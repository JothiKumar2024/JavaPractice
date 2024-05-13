package Sample;

import java.util.Scanner;

public class simpleinterest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float p,n,r,si;
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the value of p:");
		p=sc.nextFloat();
		System.out.println("Enter the value of n:");
		n=sc.nextFloat();
		System.out.println("Enter the value of r:");
		r=sc.nextFloat();
		
		si=(p*n*r)/100;
		
		System.out.println("Simple Interst is "+si);


	}

}
