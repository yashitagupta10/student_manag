package student_manag;

import java.util.Scanner;
public class StudentManagement
{
	public static void start()
	{
		Scanner sc =new Scanner (System.in);
		for(; ;)
		{
			
		System.out.println();
		System.out.println("WELCOME");
        System.out.println();
        System.out.println("1.Student");
		System.out.println("2.HR");
        System.out.println();
        System.out.print("ENTER AN OPTION :");
		int option =scanner.nextInt();
		switch(option)
			{
				case 1:
				{
					studentHomePage();
					break;
				}
				
				case 2:{
					hrHomePage();
					break;
				}
				default:
				System.out.println("INVALID OPTION");
			}
		}
	}
	
	private static void hrHomePage()
	{
		for(; ;)
		{
			
		System.out.println("HR MODULE");
        System.out.println();
        System.out.println("1. View All Student");
		System.out.println("2. Mock Ratings");
        System.out.println("3. Requirerment");
        System.out.print("4. Logout");
        System.out.println();
		}
	}
	
	private static void studentHomePage()
	{
		for(; ;)
		{
			
		System.out.println("STUDENT MODULE");
        System.out.println();
        System.out.println("1. Create Profile");
		System.out.println("2. Mock Ratings");
        System.out.println("3. Requirerment");
        System.out.print("4. Logout");
        System.out.println();
		System.out.println("Enter an option ");
		int opt=new Scanner(System.in).nextInt();
		switch(opt)
			{
			case 1:
				{
				createProfile();
				break;
				}
				case 2:
				{
				viewProfile();
				break;
				}
				case 3:
				{
				viewMockRating();
				break;
				}
				case 4:
				{
				viewRequirement();
				break;
				}
				case 5:
				{
				System.exit(0);
				
				}
				default:
					System.out.println("INVALID OPTION");
			}
		}
	}
			private static void viewRequirement()
	{
				
		}
		private static void viewMockRating()
	{
			
	}
		
	private static void viewProfile()
	{
		System.out.println("STUDENT PROFILE MODULE");
			System.out.println();
			System.out.println("Do you want edit soemthing : ");
			Stirng resp= new Scanner(System.in).next();
			if (resp.equalsIgnoreCase("YES"))
			{
				editStudentProfile();
			}
	}
	private static void editStudentProfile()
	{
}


private static void createProfile()
	{
	System.out.println("CREATE PROFILE MODULE");
	System.out.println();
	}
}