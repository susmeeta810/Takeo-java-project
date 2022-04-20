package assignment;

public class pizzacost {
	public static void main (String[]args) {
		//TOD0 Auto-generated stub
		
		int pizzacost=300;
		// discount on each pizza is 20%
		// Number of order pizza is 2
		int totalpizzaAmount= pizzacost *2;
		int totaldiscount = totalpizzaAmount*20/100;
		int finalAmount =totalpizzaAmount-totaldiscount;
		
		System.out.println("total discount" +"\t"+totaldiscount);
		System.out.println("total final Amount"+"\t"+finalAmount);
				
		
	}

}
