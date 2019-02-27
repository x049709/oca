package allchapters;

public class AnonInnerClassTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AICTwo x = new AICTwo();
		System.out.println(x.calcTotalPrice(200));
		AICThree y = new AICThree();
		System.out.println(y.calcTotalPrice(200));

	}

}

abstract class SalePrice {
	abstract int dollarsOff();
}

//Using anonymous inner class
class AICTwo {	
	int calcTotalPrice (int basePrice) {
		SalePrice sp = new SalePrice () {
											int dollarsOff() {
												return 3;
											};
										};
		return basePrice - sp.dollarsOff();
	}
	
}

//Using a regular inner class
class AICThree {
	class AICThreeSalePrice extends SalePrice {
		int dollarsOff () {
			return 5;
		}
	}
	
	int calcTotalPrice (int basePrice) {
		AICThreeSalePrice sp = new AICThreeSalePrice ();
		return basePrice - sp.dollarsOff();
	}

}


