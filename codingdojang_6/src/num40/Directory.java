package num40;

import java.io.File;

public class Directory {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File fileTest = new File("C:\\Users\\present\\Desktop\\test");
		File fileReal = new File("C:\\Users\\present\\Desktop\\real");

		File[] filesTest = fileTest.listFiles();
		File[] filesReal = fileReal.listFiles();
		
	}

}
