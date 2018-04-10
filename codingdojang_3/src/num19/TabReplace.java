package num19;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TabReplace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String filePath = "C:\\Users\\present\\Desktop\\test\\1234.txt";
		String filePath2 = "C:\\Users\\present\\Desktop\\test\\12343.txt";
		try {
			FileReader fis = new FileReader(new File(filePath));
			FileWriter fos = new FileWriter(new File(filePath2));
			
			int i=0;
			
			while((i=fis.read()) != -1){
				
				if(i == '	'){				
					fos.write(' ');
					fos.write(' ');
					fos.write(' ');
					fos.write(' ');
				}else{
					fos.write(i);
				}
			}
			fos.flush();
			fis.close();
			fos.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
