import java.io.FileReader;
import java.util.Arrays;
import com.opencsv.CSVReader;


public class CSVReader {
	public static void main(String[] args) {
		 // List<MyBean> beans comes from somewhere earlier in your code.
		
		 
		try {
			CSVReader reader = new CSVReader(new FileReader("d:/sample.csv"));
			String[]nextline;
			while((nextline=reader.readNext()) !=null)
			{
				if(nextline!=null) {
					System.out.println(Arrays.toString(nextline));
				}
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		System.out.println("CSV Read Complete");
//	    Writer writer = new FileWriter("yourfile.csv");
//	    StatefulBeanToCsv beanToCsv = new StatefulBeanToCsvBuilder(writer).build();
//	    beanToCsv.write(beans);
//	    writer.close();
	}
}
