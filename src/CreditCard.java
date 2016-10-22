import java.util.Arrays;
import java.util.Calendar;
import java.util.StringJoiner;

public class CreditCard{
	
	private int expiryMonth;
	private int expiryYear;
	private String firstName;
	private String lastName;
	private String ccNumber;

	
	public CreditCard(int expiryMonth, int expiryYear, String firstName, String lastName, String ccNumber){
		this.expiryMonth = expiryMonth;
		this.expiryYear = expiryYear;
		this.firstName = firstName;
		this.lastName = lastName;
		this.ccNumber = ccNumber;
	}
	
	public String formatExpiryDate(){
		StringJoiner s = new StringJoiner("/");
		String year = String.valueOf(expiryYear);
		year = year.substring(2);
		String month = String.valueOf(expiryMonth);
		
		s.add(month);
		s.add(year);
		return(s.toString());
	}
	
	public String formatFullname(){
		StringJoiner z = new StringJoiner(" ");
		z.add(firstName);
		z.add(lastName);
		return(z.toString());
	}
	
	public String formatCCNumber(){
		String part1 = ccNumber.substring(0, 4);
		String part2 = ccNumber.substring(4, 8);
		String part3 = ccNumber.substring(8, 12);
		String part4 = ccNumber.substring(12, 16);
		
		StringJoiner m = new StringJoiner(" ");
		m.add(part1);
		m.add(part2);
		m.add(part3);
		m.add(part4);
		
		return(m.toString());
	}
	
	public boolean isValid(){
		Calendar x = Calendar.getInstance();
		System.out.println(x.get(Calendar.YEAR));
		if(expiryYear > x.get(Calendar.YEAR)){
			return true;
		}
		else if(expiryYear > x.get(Calendar.YEAR) && expiryMonth >= x.get(Calendar.MONTH)){
			return true;
		}
		return false;
	}
	
	public String toString(){
		String name1 = "Cardholder name =";
		String name2 = this.formatFullname();
		
		String date1 = "\n This card expires on";
		String date2 = this.formatExpiryDate();
		
		String cc1 = "\n CC number =";
		String cc2 = this.formatCCNumber();
		
		StringJoiner q = new StringJoiner(" ");
		q.add(name1);
		q.add(name2);
		q.add(date1);
		q.add(date2);
		q.add(cc1);
		q.add(cc2);
		
		return(q.toString());
	}
	
	
}
