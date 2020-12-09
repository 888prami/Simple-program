package main;
import java.util.Scanner;
public class Calculator {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a,b,c,selection;
		System.out.println("Enter any two digits");
		a=scan.nextInt();
		b=scan.nextInt();
		System.out.println("Make your selection");
		System.out.println("1.addition");
		System.out.println("2.subtraction");
		System.out.println("3.multiplication");
		System.out.println("4.division");
		selection = scan.nextInt();
		while(selection>4);{
		System.out.println("Please enter your correct selection");
		selection= scan.nextInt();
		}
		Operations op= new Operations();
		if (selection==1){
			c =op.add(a,b);
			System.out.println("Your answer is" +c);
		}
		else if(selection==2){
        	c =op.sub(a,b);
        	System.out.println("Your answer is" +c);
        }
		else if(selection==3){
            c =op.mul(a,b);
        	System.out.println("Your answer is" +c);
        }
		else if(selection==4){
        	c =op.div(a,b);
        	System.out.println("Your answer is" +c);
		}
		else 
			System.out.println("Invalid choice");
	}
}
