package org.kodluyoruz.questions.two;

import java.util.Scanner;

public class QuestionTwo {
	/*
	 * 
	 * Kullanıcının konsol ekrandan 4 temel matematiksel işlemi yapabildiği bir
	 * program yazmanız bekleniyor. Program aşağıdaki özellikleri sağlamalıdır.
	 * 
	 * Yapılabilecek temel işlemler: Toplama, Çıkarma, Çarpma, Bölme Kullanıcıya 4
	 * işlemden birini seçeceği menüyü konsol ekrana yazdırın. Örneğin: 1-Toplama,
	 * 2-Çıkarma vb... Ardından kullanıcıdan 2 adet tamsayı tipinde sayı girmesini
	 * isteyin. Bu girilen iki sayıyı değişkenlerde saklayın. Seçilen işlem tipine
	 * göre matematiksel işlemi yapın ve konsol ekranına yazdırın.
	 * 
	 * 
	 */

	public static void main(String[] args) {
		Scanner scannerNumberOne = new Scanner(System.in);
		System.err.print("Tam sayı girin :");
		int numberOne = scannerNumberOne.nextInt();
		Scanner scannerNumberTwo = new Scanner(System.in);
		System.err.print("Tam sayı girin :");
		int numberTwo = scannerNumberOne.nextInt();

		Scanner scannerOperation = new Scanner(System.in);
		System.err.print("Oparator belirtin :");
		String operation = scannerOperation.nextLine();

		// + - * / yi okuyup ona göre işlem seçer
		switch (operation) {
		case "+":
			System.err.println("Resut : " + addition(numberOne, numberTwo));
			break;
		case "-":
			System.err.println("Resut : " + multiplication(numberOne, numberTwo));
			break;
		case "x":
			System.err.println("Resut : " + extraction(numberOne, numberTwo));
			break;
		case "/":
			System.err.println("Resut : " + division(numberOne, numberTwo));
			break;
		default:
			System.err.println("Invalid operator");
			break;
		}

	}

	/*
	 * dışarıdan gelen 2 tam sayıyı toplar
	 */
	static Double addition(int numberOne, int numberTwo) {
		return (double) (numberOne + numberTwo);
	}

	/*
	 * dışarıdan gelen 2 tam sayıyı cıkartır
	 */
	static Double multiplication(int numberOne, int numberTwo) {
		return (double) (numberOne - numberTwo);
	}

	/*
	 * dışarıdan gelen 2 tam sayıyı çarpar
	 */
	static Double extraction(int numberOne, int numberTwo) {
		return (double) (numberOne * numberTwo);
	}

	/*
	 * dışarıdan gelen 2 tam sayıyı böler
	 * 
	 */
	static Double division(int numberOne, int numberTwo) {
		return (double) (numberOne / numberTwo);
	}

}
