package task02;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class CSVReader2 {

    public static void main(String[] args) {
        
    }

    String path = "/Users/sathy/Assessment/task01/task01/thankyou.csv";
    String line = "";
    BufferedReader br = new BufferedReader(new FileReader1(path));

    try {
        BufferedReader br = new BufferedReader(new FileReader(path));

        while((line=br.readLine()) !=null) {
            System.out.println(line);
        }

            try {

            }
                catch (FileNotFoundException e) {
                    e.printStackTrace();

            }
         catch (IOException e){

         
            e.printStackTrace();
        
    } 
    }


    
}
