package org.cts.test;

import java.util.Scanner;

public class Split11 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	String s = sc.next();
		int count = 0;
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		String small="";
		String capital="";
		String digits="";
		String spl="";

		for (int i = 0; i < s.length(); i++) {
         char c = s.charAt(i);
		if (Character.isLowerCase(c)) {
			small=small+c;
      count++;
		} else if (Character.isUpperCase(c)) {
			capital=capital+c;

		count1++;
		} else if (Character.isDigit(c)) {
			digits=digits+c;
		count2++;
		} else {
			spl=spl+c;
		count3++;
		}
		}
		System.out.println("total no of small letters: " + count+"="+small);
		System.out.println("total no of capital letters: " + count1+"="+capital);
		System.out.println("total no of digits: " + count2+"="+digits);
		System.out.println("total no of special characters: " + count3+"="+spl);
		}
		}


