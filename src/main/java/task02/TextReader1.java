package task02;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TextReader1 {

    public static void main(String[] args) throws FileNotFoundException {
        
    }
    
    File file = new File("/Users/sathy/Assessment/task01/task01/thankyou.txt");
    Scanner scan = new Scanner(file);

    String fileContent = "";
    while(scan.hasNextLine()) {}
    fileContent = fileContent.concat(scan.nextLine() + "\n");
    
}

FileWriter writer = new FileWriter("/Users/sathy/Assessment/task01/task01/tour_packages.txt");
writer.write(fileContent);


{
}
