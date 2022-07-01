package task02;

import java.io.BufferedReader;
import java.io.IOException;

public class CSVReader1
{
    public static void main( String[] args )
    {
        String path = "/Users/sathy/Assessment/task01/task01/tour_packages.csv";
        String line = "";
        BufferedReader br = new BufferedReader(new FileReader0(path));

        while((line=br.readLine()) !=null) {
            System.out.println(line);

        }

        try {
            BufferedReader br = new BufferedReader(new FileReader(path));
            
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        

      
    }
    }
}
