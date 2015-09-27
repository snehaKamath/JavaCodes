package InterfacesInJava;
import java.util.Scanner;

public class InstallPhoneApps implements InstallGoogleMapsInterface, InstallWhatsappInterface {

	Scanner sc = new Scanner(System.in);

	@Override
	public void create_GooglePlayStoreAccount() {

		System.out.println("Please enter your gmail id:");
		String gmailId = sc.next();
		System.out.println("Please enter password:");
		String gmail_password = sc.next();

		System.out.println("You are now logged into google playstore");

	}

	@Override
	public void inputPhoneNumber() {

		System.out.println("Please enter your whatsapp phone number:");
		String phone_number = sc.next();
		System.out.println("Phone number updated!");
	}

	@Override
	public void updateProfilePicture() {

		System.out.println("Profile pic updated!");

	}

	@Override
	public void updateStatus() {

		System.out.println("Status updated!");
	}

	@Override
	public void updateHomeAddress() {

		System.out.println("Address updated!");

	}

	@Override
	public void enableGPS() {

		System.out.println("GPS enabled");

	}

	public static void main(String args[]) {

		System.out.println("Welcome to google apps installation");
		InstallPhoneApps application = new InstallPhoneApps();
		application.create_GooglePlayStoreAccount();
		application.inputPhoneNumber();
		application.updateProfilePicture();
		application.updateStatus();
		application.updateHomeAddress();
		application.enableGPS();
		System.out.println("Whatsapp and Google maps apps installed!");
	}

}