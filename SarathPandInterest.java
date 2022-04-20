package assignment;

public class SarathPandInterest {
public static void main (String[]args) {
	//TODO Auto-generated method stub
	
	int DepositAmount =500000;
	int TimeInYear =5;
	double IntrestRate =6.8;
	double TotalIntrestAmount = DepositAmount*TimeInYear*IntrestRate/100;
	
	double TotalAmountbyEndOfFiveYears = DepositAmount +IntrestRate;
			
	System.out.println("Total IntrestAmount" + "\t$" + TotalIntrestAmount);
	
	
	System.out.println("Total Amount at end of Five Years "+"\t$" + TotalAmountbyEndOfFiveYears);
}
}
