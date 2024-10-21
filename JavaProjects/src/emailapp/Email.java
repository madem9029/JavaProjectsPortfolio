package emailapp;

import java.util.Scanner;

public class Email {
private String firstName; 
private String lastName; 
private String email; 
private String randompassword; 
private int defaultPasswordLenth = 10; 
private String department; 
private int mailboxCpacity = 500;
private String altEmail; 
private String companySuffix = "javacompany.com";
 

// Constructor to receive the first and last name
public Email(String firstName, String lastName) {
	Scanner in = new Scanner (System.in); 
	System.out.println("Enter the first name"); 
	firstName = in.nextLine(); 
	System.out.println("Enter the last name"); 
	lastName = in.nextLine(); 
	this.firstName = firstName;
	this.lastName = lastName; 

	
	//Call a method asking for the department - return the department
	this.department = setDepartment(); 
	System.out.println(""); 
	//Call a method that returns a random password
	this.randompassword = randomPassword(defaultPasswordLenth);
	System.out.println(""); 
	System.out.println("Your password is: "+ this.randompassword);	
	
	//Combine elements to generate email
	email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" +  department + "." +companySuffix; 
}

//Ask for the department
private String setDepartment() {
	System.out.println(""); 
	System.out.print("New worker:" + firstName+ "\nDEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accouting\n0 for none\nEnter department code: ");
	Scanner in = new Scanner(System.in);
	int deptChoice = in.nextInt(); 
	
	if (deptChoice == 1) {
		return "Sales";
	}
	else if (deptChoice == 2) {
		return "Development"; 
	}
	else if (deptChoice == 3) {
		return "Accounting"; 
	}
	else {
		return ""; 
	}
	
}

//Generate a random password
private String randomPassword(int length) {
	String passwordSet = "ABCDEFGHIJKLMOPQRSTUVWXYZ0123456789!@#$%";
	//Created an array of characters
	char[] password = new char[length];
	//Iterate through the value of length
	for(int i =0; i < length; i++) {
		int rand = (int) (Math.random() * passwordSet.length());
		password[i] = passwordSet.charAt(rand);
	}
	return new String (password);
}

//Set the mailbox capacity
public void setMailboxCap(int capacity) {
	this.mailboxCpacity = capacity; 
}
//set the alt email
public void setAltEmail(String alternateEmail) {
	Scanner in = new Scanner(System.in); 
	System.out.println("Enter an alternate email");
	alternateEmail = in.nextLine(); 
	System.out.println(""); 
	
	this.altEmail = alternateEmail; 

}

//Change the password
public void changePassword(String currentPassword) {
	Scanner in = new Scanner(System.in); 
	System.out.println(""); 
	System.out.println("Would you like to change your password Y/N: "); 
	String choice = in.nextLine();
	 if (choice.equals("Y"))
	 {
		 System.out.println("Enter the new password: "); 
		 currentPassword = in.nextLine();
	 }
	 else
	 {
		 System.out.println("Password will remain the same"); 
		 System.out.println(""); 
	 }
	
	this.randompassword = currentPassword; 
	
}

public int getMailCap() {
	return mailboxCpacity; 
}
public String getAlternateEmail() {
	return altEmail; 
}
public String getPassword() {
	return randompassword; 
}

public String showInfo() {
	return "DISPLAY NAME: " + firstName + " " + lastName +
			"\nCOMPANY EMAIL: " + email +
			"\nMAILBOX CAPACITY: " + mailboxCpacity + "MB"; 
}
}
