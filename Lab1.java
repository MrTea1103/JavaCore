package learnJavaCore;

import java.util.Scanner;

public class Lab1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		Bài 1:
//		String name;
//		double marks;
//		System.out.println("Your name: ");
//		name = sc.nextLine();
//		System.out.println("Your marks: ");
//		marks = sc.nextDouble();
//
//		System.out.println("Your name is: " + name.toUpperCase() + "\nAnd your marks is : " + marks);

//		Bài 2: Tính diện tích, chu vi, cạnh nhỏ nhất của HCN

//		double cd, cr, cv, dt, min;
//
//		System.out.println("Chiều dài: ");
//		cd = sc.nextDouble();
//		System.out.println("Chiều rộng: ");
//		cr = sc.nextDouble();
//
//		cv = (cd + cr) * 2;
//		dt = cd * cr;
//		min = Math.min(cd, cr);
//
//		System.out.println("Chu Vi HCN: " + cv);
//		System.out.println("Diện Tích HCN: " + dt);
//		System.out.println("Cạnh nhỏ nhất: " + min);

//		Bài 3:
		double canh, thetich;
		System.out.println("Cạnh: ");
		canh = sc.nextDouble();
		thetich = Math.pow(canh, 3);
		System.out.println("Thể tích hình lập phương: " + thetich);

	}
}
