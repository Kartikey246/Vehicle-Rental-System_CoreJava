package com.keyutil;

import java.sql.Date;
import java.util.InputMismatchException;
import java.text.ParseException;
import java.util.Scanner;

//class to read all values from keyboard
public class KeyBoardUtil {
	public static String getString(String msg) {
		System.out.println(msg);
		try (Scanner s = new Scanner(System.in)) {
			return s.nextLine();
		}
	}

	public static int getInt(String msg) {
		while (true) {
			System.out.println(msg);
			try(Scanner s = new Scanner(System.in)) {
				return s.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("enter again");
			}
		}
	}

	@SuppressWarnings("resource")
	public static Date getDate(String msg) throws ParseException {
		while (true) {
			try (Scanner s = new Scanner(System.in)){
				System.out.println(msg);
			String str = s.nextLine();
			return Date.valueOf(str);
			}
			
		}
	}
}
