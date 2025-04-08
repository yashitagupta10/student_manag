import java.util.Scanner;
import java.lang.Thread;
class ICICI 
{
	public static void main(String[] args) 
	{
	Scanner bank = new Scanner(System.in);
	
	
	String name="";
	long phoneNo=0;
	int pwd=0;
	
	long accountNo=0;
	String ifsc="";
	String address="";
	String upiId="";
	
	
	
	System.out.println("Want to create account ? Y-yes | N-no");
	char result=bank.next().charAt(0);
	
	if(result=='y' || result=='Y')
		{    {
		
		System.out.println("Enter Your Beautiful Name:");
		name=bank.nextLine();
		name=bank.nextLine();
		System.out.println("Enter Your contact:");
		phoneNo=bank.nextLong();
		System.out.println("Enter Your Password:"); 
		pwd=bank.next();
		
		
		System.out.println("Sucessfully Created Account"+name); 
		
		try
		{
			Thread.sleep(3000);
		
		}
		catch (Exception e)
		{
			e.printlnStackTrace();
			
		}
		
		System.out.println("==================================="); 
		System.out.println("Name"+name); 
		System.out.println("contact"+phoneNo); 
		System.out.println("=====================================");
		
		
		
		try
		{
			Thread.sleep(2000);
		}
		
		catch (Exception e)
		{
			e.printlnStackTrace();
			
		}
	
	System.out.println("Generating Bank Account Please Wait........");
	accountNo=34499772;
	ifsc="ICICI00540457";
	address="Deccan-pune";
	System.out.println("Enter your UPI ID to proceed futher");
	upiId=bank.next();
			
	try
		{
			Thread.sleep(3000);
		}
		
		catch (Exception e)
		{
			e.printlnStackTrace();	
	    }
	System.out.println("Account creation successful");
	
	try
		{
			Thread.sleep(3000);
		}
		
		catch (Exception e)
		{
			e.printlnStackTrace();
	    }
	
	
	System.out.println("==========3==============");
	System.out.println("Account Number"+accountNo);
	System.out.println("IFSC"+ifsc);
	System.out.println("Branch Address"+address);
	System.out.println("UPI ID"+upiId);
	System.out.println("==========================");
	
	}
	else{
		System.out.println("OVER");
	}	
	}
}