package allchapters;
//Immutable class
final class ADSR {

	private final StringBuilder name;
	private final int attack, decay;
	
	public ADSR (StringBuilder n, int a, int d) {
		//this.name = n; DANGER! name can be modified outside the class
		this.name = new StringBuilder(n);
		this.attack = a;
		this.decay = d;
	}
	//NO SETTERS
	
	public StringBuilder getName() {
		StringBuilder nameCopy = new StringBuilder (name);
		return nameCopy;
	}
	
	public ADSR getADSR() {
		return this;
	}
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder("a1 ");
		ADSR a1 = new ADSR(sb, 5, 7);
		//ADSR a2 = a1.getADSR();
		System.out.println(a1.getName());
		sb.append("alter the name ");
		System.out.println(a1.getName());;
	}

}
