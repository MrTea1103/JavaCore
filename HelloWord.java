package learnJavaCore;

import java.util.Scanner;

public class HelloWord {
	public static void main(String[] args) {
//		int a = 6;
//		int b = 6;
//		int c = a + b;
//		System.out.println("sum: " + c);

		Scanner sc = new Scanner(System.in);
//		sc.nextLine nhận 1 dòng chữ từ bàn phím
//		sc.nextInt nhận 1 dòng số nguyên từ bàn phím
//		sc.nextDouble nhận 1 dòng số thực từ bàn phím
//		String name;
//		int age;
//		System.out.println("Your name is: ");
//		name = sc.nextLine();
//		System.out.println("Your age is: ");
//		age = sc.nextInt();
//		System.out.println("Your name is " + name.toUpperCase() + " and your age is " + age);
//		sc.close();

		double a, b, c;
		System.out.print("a: ");
		a = sc.nextInt();
		System.out.print("b: ");
		b = sc.nextInt();

//		c = Math.max(a, b); // Tìm số lớn nhất giữa 2 số 
//		c = Math.min(a, b); // Tìm số nhỏ nhất giữa 2 số
//		c = Math.pow(a, b); // Tính a mũ b dữ liệu đầu vào sẽ là dạng double
		c = Math.sqrt(a); // Tính căn bậc 2 của a
		System.out.println("result: " + c);
		sc.close();

	}
}
