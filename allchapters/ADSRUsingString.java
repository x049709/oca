package allchapters;
//Immutable class
final class ADSRUsingString {

	private final String name;
	private final int attack, decay;
	
	public ADSRUsingString (String n, int a, int d) {
		this.name = n;
		this.attack = a;
		this.decay = d;
	}
	//NO SETTERS
	
	public StringBuilder getName() {
		StringBuilder nameCopy = new StringBuilder (name);
		return nameCopy;
	}
	
	public ADSRUsingString getADSR() {
		return this;
	}
	public static void main(String[] args) {
		String sb = new String("a1 ");
		ADSRUsingString a1 = new ADSRUsingString(sb, 5, 7);
		//ADSRUsingString a2 = a1.getADSR();
		System.out.println(a1.getName());
		sb = sb + "alter the name ";
		System.out.println(a1.getName());;
	}

}
