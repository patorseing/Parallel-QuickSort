import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.Random;

public class GenerateDataSet {
	   
    public static void main(String args[]){
    	try {
			File writename = new File("sortData.txt");
			writename.createNewFile();
			BufferedWriter out = new BufferedWriter(new FileWriter(writename));
			Random rand = new Random();
			int dataSize = 400000;//2M
			//int dataSize = 200000;//1M
			out.write(dataSize + "\r\n"); 
			out.flush();
			for(int i = 0; i < dataSize; i ++)
			{
					int tmp = rand.nextInt(999) + 1;
					out.write(tmp + "\r\n"); 
					out.flush();
			}		
			out.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    }
}