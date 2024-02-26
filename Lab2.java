package learnJavaCore;

import java.util.Scanner;

public class Lab2 {
	public static void main(String[] args) {
		System.out.println("+-------------------------------------------+");
		System.out.println("| Bài 1: Cho Phương trình ax + b = 0        |");
		System.out.println("| Bài 2: Cho phương trình ax^2 + bx + c = 0 |");
		System.out.println("| Bài 3: Tính tiền điện                     |");
		System.out.println("+-------------------------------------------+");
		Scanner sc = new Scanner(System.in);
		int keyword;
		System.out.println("Chọn bài ?: ");
		keyword = sc.nextInt();
		switch (keyword) {
		case 1:
			ptb1();
			break;
		case 2:
			ptb2();
			break;
		case 3:
			tiendien();
			break;

		default:
			break;
		}
	}

	public static void ptb1() {
		System.out.println("+--------------------+");
		System.out.println("| Phương trình Bậc 1 |");
		System.out.println("+--------------------+");
		Scanner sc = new Scanner(System.in);
		int a, b;
		double x;
		System.out.println("Nhập a: ");
		a = sc.nextInt();
		System.out.println("Nhập b: ");
		b = sc.nextInt();

		if (a == 0 && b == 0) {
			System.out.println("Phương trình có vô số ngiệm !");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình vô ngiệm !");
		} else {
			x = -b / a;
			System.out.printf("Vậy phương trình %dx + %d = 0\n", a, b);
			System.out.println("có 1 nghiệm duy nhất là: " + x);
		}
	}

	public static void ptb2() {
		System.out.println("+--------------------+");
		System.out.println("| Phương trình Bậc 2 |");
		System.out.println("+--------------------+");
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		double x, x1, x2, detal;
		System.out.println("Nhập a: ");
		a = sc.nextInt();
		System.out.println("Nhập b: ");
		b = sc.nextInt();
		System.out.println("Nhập c: ");
		c = sc.nextInt();

		if (a == 0) {
			giaiptb1(b, c);
		} else {
			detal = Math.pow(b, 2) - 4 * a * c;
			if (detal < 0) {
				System.out.println("Phương trình vô ngiệm !");
			} else if (detal == 0) {
				x = -b / (2 * a);
				System.out.println("Phương trình " + a + "x^2 + " + b + "x + " + c + " = 0\n"
						+ "\nCó nghiệm kép x=-b/(2*a) là: " + x);
			} else {
				x1 = (-b + Math.sqrt(detal)) / (2 * a);
				x2 = (-b - Math.sqrt(detal)) / (2 * a);
				System.out.printf("Phương trình %d^2 + %dx + %d = 0", a, b, c);
				System.out.printf("\nCó nghiệm 2 nghiệm phân biệt x1 = %.3f và x2 = %.3f", x1, x2);
			}
		}
	}

	public static void giaiptb1(int a, int b) {
		if (a == 0 && b == 0) {
			System.out.println("Phương trình có vô số ngiệm !");
		} else if (a == 0 && b != 0) {
			System.out.println("Phương trình vô ngiệm !");
		} else {
			double x = -b / a;
			System.out.printf("Vậy phương trình %dx + %d = 0\n", a, b);
			System.out.println("có 1 nghiệm duy nhất là: " + x);
		}
	}

	public static void tiendien() {
		System.out.println("+--------------------+");
		System.out.println("| Tính số tiền điện  |");
		System.out.println("+--------------------+");
		Scanner sc = new Scanner(System.in);
		int so, tien;
		System.out.println("Nhập số điện: ");
		so = sc.nextInt();

		if (0 <= so && so <= 100) {
			tien = so * 1000;
			System.out.println("Số tiền điện là: " + tien);
		} else if (so > 100) {
			tien = 100 * 1000 + (so - 100) * 1500;
			System.out.println("Số tiền điện là: " + tien);
		} else {
			System.out.println("Số điện không được phép âm !");
		}
	}
}
