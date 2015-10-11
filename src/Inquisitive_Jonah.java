import java.util.Scanner;
//changes for the new branch

public class Inquisitive_Jonah 
{
	public static void main(String[] args)
	{
		Overriding obj = new Overriding();
		@SuppressWarnings("resource")
		Scanner sr=new Scanner(System.in);
		System.out.println("Press F for float or I for integer");
		String input= sr.nextLine();
		if(input.equalsIgnoreCase("F"))
		{
		System.out.println("Enter first number");
		float n1=sr.nextFloat();
		System.out.println("Enter second number");
		float n2=sr.nextFloat();
        obj.multiply(n1,n2);
        float result=obj.multiply(n1,n2);
        System.out.println(result);
		
	       
	}
		else if(input.equalsIgnoreCase("I"))	
		{
			System.out.println("Enter first number");
			int n1=sr.nextInt();
			System.out.println("Enter second number");
			int n2=sr.nextInt();
	        int result=obj.multiply(n1,n2);
	        System.out.println(result);
		
       }
		else 
		{
			System.out.println("Input not recognized");
		}
	}

}
