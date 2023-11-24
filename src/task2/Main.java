package task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
        try {
            //FileWriter writer = new FileWriter("/Users/alexandrzhidkov/Documents/testfile.txt", true);
            FileWriter writer = new FileWriter("firstText.txt", true);
            writer.write("writing to file");
            writer.write("\n");
            writer.close();

        } catch (IOException e) {
            System.out.println("During writing process error was captured");
        }

        try {
            FileReader fr = new FileReader("firstText.txt");
            BufferedReader br = new BufferedReader(fr);
            String temp = null;
            while ((temp = br.readLine()) != null) {
                System.out.println(temp);
            }
            br.close();
        } catch (IOException e){
            System.out.println("During reading process error was captured");
        }


    }
}
