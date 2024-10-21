package emailapp;

public class EmailApp {

	public static void main(String[] args) {

		Email em1 = new Email(null, null);
		em1.changePassword(null);
		em1.setAltEmail(null);
		System.out.println(em1.showInfo()); 
		System.out.println(""); 
		System.out.println("Your alternate email is: " + em1.getAlternateEmail());
		System.out.println("Your new password is: " + em1.getPassword()); 
		}

	}