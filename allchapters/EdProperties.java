package allchapters;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class EdProperties {

	public void runIt() {
		Properties prop = System.getProperties();
		prop.setProperty("p1", "p1Value");
		prop.list(System.out);
		try (FileOutputStream fos = new FileOutputStream("ed.props")) {
			prop.store(fos, "ed-comments");
		} catch (IOException e) {
			System.out.println("FOS failed: " + e.getMessage());
		}
		
	}

	public void runItAgain() {
		Properties prop = new Properties();
		prop.list(System.out);
		try (FileInputStream fis = new FileInputStream("ed.props");FileOutputStream fos = new FileOutputStream("ed.propsAgain")) {
			prop.load(fis);
			prop.setProperty("p2", "p2Value");
			prop.store(fos, "ed-propsAgain-comments");
		} catch (IOException e) {
			System.out.println("FIS/FOS failed: " + e.getMessage());
		}
		
		
	}

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EdProperties edt = new EdProperties();
		//edt.runIt();
		edt.runItAgain();

	}

}
