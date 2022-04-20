package assignment;

public class himasalary {
	public static void main (String[]args) {
		//TODO Auto-generated method stub
		
		int h_BaseSalary =85000;
		double ta= 0.15*h_BaseSalary;;
		double da= 0.2*h_BaseSalary;;
		double dr= 0.18*h_BaseSalary;;
		double pf=0.2*h_BaseSalary;;
		double tax=0.25*h_BaseSalary;;
		
		double GrossAmount =h_BaseSalary+ta+da+dr;
		double netAmount = GrossAmount -(pf+tax);
		
		System.out.println("Total Gross Amount of Hima's is "+"\t $" + GrossAmount);
		System.out.println("Total Net Salary of Hima's is"+"\t $" +netAmount);
		
		
	}

}
