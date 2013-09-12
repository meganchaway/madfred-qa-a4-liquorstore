import javax.swing.JOptionPane;

public class AgeChecker {

	//Asking for the fn, ln for the input information of the client...
	public static void main(String[] args) {
		String firstName = JOptionPane.showInputDialog(null,"What is your first name?");
		String lastName = JOptionPane.showInputDialog(null,"What is your last name?");
		int yearOfBirth = Integer.parseInt(JOptionPane.showInputDialog(null,"What year were you born?"));
		
		//Methods for verification...
		boolean oldEnough = verifyLegalAge(yearOfBirth);
		String fullName = concatenateNames(firstName, lastName);
		
		if(oldEnough == true) {
			JOptionPane.showMessageDialog(null,  firstName + ", you may proceed with your purchase");
		}else {
			JOptionPane.showMessageDialog(null,  firstName + ", you are not old enought to purchase the item requested, please visit again once you reached legal age!");
		}
	}		
		
		public static boolean verifyLegalAge(int yob){
			boolean legalAgeStatus = (2013-yob) >= 19;
			return legalAgeStatus;
		}
		
		public static String concatenateNames(String fn, String ln) {
			String fullName = fn + " " +  ln;
			return fullName;
		}
 
}

