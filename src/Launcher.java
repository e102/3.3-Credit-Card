
public class Launcher {

	public static void main(String[] args) {
		CreditCard myCard = new CreditCard(06, 2016, "Srdjan", "Miletic", "1234567890123456");
		CreditCard myInvalidCard = new CreditCard(05, 2003, "Srdjan", "Miletic", "1234567890123456");
		
		System.out.println(myCard.formatExpiryDate());
		System.out.println(myCard.formatFullname());
		System.out.println(myCard.formatCCNumber());
		System.out.println(myCard.isValid());
		System.out.println(myCard.toString());
		
		System.out.println(" ");
		
		System.out.println(myInvalidCard.formatExpiryDate());
		System.out.println(myInvalidCard.formatFullname());
		System.out.println(myInvalidCard.formatCCNumber());
		System.out.println(myInvalidCard.isValid());
		System.out.println(myInvalidCard.toString());
	}

}
