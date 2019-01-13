package allchapters;
//Immutable class
final class LabeledBreak {

	
	public LabeledBreak () {
	}
	//NO SETTERS
	
	public void runIt() {
		boolean isTrue=true;
		outer:
			for (int i=1;i<5;i++) {
				while (isTrue) {
					System.out.println("Hello");
					//continue outer; //print Hello 5 times
					break outer; //print Hello 1 time
				}
				System.out.println("Out of while");
			}
			System.out.println("Out of for");
	}
	
	
	public static void main(String[] args) {
		MultiCatch a1 = new MultiCatch();
		a1.runIt();
		System.out.println("Good bye");
	}

}