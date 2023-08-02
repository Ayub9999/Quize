package com.velocity.project;

import java.util.ArrayList;
import java.util.Scanner;

public class Displayqustion {

	public static void main(String[] args) {
		System.out.println("                    WELCOME TO JAVA QUIZ");
		ArrayList<String> option=new ArrayList<String>();
		System.out.println("1. what is java");
		option.add(0, "A]class");
		option.add(1,"B]interface");
		option.add(2,"C]progrmming laguage");
		option.add(3,"D]none of above");
		System.out.println(option);
Scanner sc=new Scanner(System.in);
System.out.println("Enter your choice");

	}

}
