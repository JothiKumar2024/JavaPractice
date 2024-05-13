package Sample;

import java.util.Scanner;

public class Basics3 {

	public static void main(String[] args) {
		float area,radious;
		final float pi=3.14f;
	
		System.out.println("Enter the radious ");
		Scanner sc=new Scanner(System.in);
		radious=sc.nextFloat();
		area=pi*radious*radious;
		System.out.println("Area is "+area);

	}

}
