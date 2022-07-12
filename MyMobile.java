package week1.day2;

public class MyMobile {

	String device = "Nokia";
	float version = 8.2f;
	String bodycolour = "Black";
	String model = "Touch Sensor";
	int Warranty = 2;
	long idno = 1238789l;

	public void makeCall() {

		String slot1 = "Sim1";
		String slot2 = "Sim2";

		System.out.println("I can make calls using Sim 1 & 2");

	}

	public void sendMsg() {

		String message = "Whatsapp";
		String messanger = "Normal message";

		System.out.println("I can send messages using Whatsapp & Messenger");

	}

	private void payBills() {
		System.out.println("Total amount is 25K");
	}

	public static void main(String[] args) {
		MyMobile mob = new MyMobile();
		System.out.println(mob.device);
		System.out.println(mob.version);
		System.out.println(mob.bodycolour);
		System.out.println(mob.model);
		System.out.println(mob.Warranty);
		System.out.println(mob.idno);
		mob.makeCall();
		mob.sendMsg();
		mob.payBills();

	}

}
