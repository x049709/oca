package allchapters;

import java.util.Locale;
import java.util.ResourceBundle;

public class EdBundle {

	public void runIt() {
		Locale lcl = new Locale("en");
		ResourceBundle rb = ResourceBundle.getBundle("Edbundle", lcl);
		//bundle must be in classpath or default in ocp/bin (see ocp properties/classpath
		System.out.println(rb.getString("Hello"));		
	}

	public void runItAgain() {
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdBundle edt = new EdBundle();
		edt.runIt();
	}

}
