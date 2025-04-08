import java.util.*;

public class AssemblerPass1 {
    // Data structures for Pass-I
    private int locationCounter;
    private final Map<String, Integer> symtab = new LinkedHashMap<>();  // Symbol Table
    private final Map<String, Integer> littab = new LinkedHashMap<>(); // Literal Table
    private final Map<String, String> optab = new HashMap<>();         // Operation Table
    private final List<String> intermediateCode = new ArrayList<>();  // Intermediate Code

    // Constructor
    public AssemblerPass1.java() {
        locationCounter = 0;

        // Initialize operation table
        optab.put("ADD", "01");
        optab.put("MUL", "02");
        optab.put("DS", "DL");
        optab.put("START", "AD");
        optab.put("END", "AD");
    }

    // Parse line into tokens
    private String[] parseLine(String line) {
        return line.trim().split("\\s+");
    }

    // Process assembler directive
    private void processDirective(String directive, String operand) {
        if (directive.equals("START")) {
            locationCounter = Integer.parseInt(operand);
            intermediateCode.add("AD START " + operand);
        } else if (directive.equals("DS")) {
            symtab.put(operand, locationCounter);
            intermediateCode.add("DL DS " + operand);
            locationCounter++; // Increment LC for storage allocation
        } else if (directive.equals("END")) {
            intermediateCode.add("AD END");
        }
    }

    // Process an instruction
    private void processInstruction(String instruction, String[] operands) {
        if (optab.containsKey(instruction)) {
            StringBuilder code = new StringBuilder(optab.get(instruction));
            for (String operand : operands) {
                if (operand.matches("^[A-Za-z]+$")) { // It's a symbol
                    symtab.putIfAbsent(operand, null); // Add to SYMTAB if not already present
                    code.append(" ").append(operand);
                } else if (operand.startsWith("=")) { // It's a literal
                    littab.putIfAbsent(operand, null); // Add to LITTAB if not already present
                    code.append(" ").append(operand);
                } else {
                    code.append(" ").append(operand); // For registers or immediate values
                }
            }
            intermediateCode.add(code.toString());
            locationCounter++; // Increment LC for the instruction
        }
    }

    // Pass-I: Process the input program
    public void pass1(String[] program) {
        for (String line : program) {
            if (line.trim().isEmpty()) continue;
            String[] tokens = parseLine(line);
            if (optab.containsKey(tokens[0])) { // Instruction
                processInstruction(tokens[0], Arrays.copyOfRange(tokens, 1, tokens.length));
            } else if (tokens[0].equals("START") || tokens[0].equals("DS") || tokens[0].equals("END")) { // Directive
                processDirective(tokens[0], tokens.length > 1 ? tokens[1] : null);
            } else { // Label
                String label = tokens[0];
                symtab.put(label, locationCounter);
                if (tokens.length > 1) {
                    processInstruction(tokens[1], Arrays.copyOfRange(tokens, 2, tokens.length));
                }
            }
        }
    }

    // Display results
    public void displayResults() {
        System.out.println("\nSymbol Table (SYMTAB):");
        symtab.forEach((sym, addr) -> System.out.println(sym + ": " + addr));

        System.out.println("\nLiteral Table (LITTAB):");
        littab.forEach((lit, addr) -> System.out.println(lit + ": " + addr));

        System.out.println("\nIntermediate Code:");
        intermediateCode.forEach(System.out::println);
    }

    // Main Method
    public static void main(String[] args) {
        // Sample Input Program
        String[] program = {
                "START 200",
                "B ADD AREG=10",
                "MUL BREG A",
                "A DS 2",
                "END"
        };

        // Run Pass-I
        AssemblerPass1 assembler = new AssemblerPass1();
        assembler.pass1(program);
        assembler.displayResults();
    }
}
