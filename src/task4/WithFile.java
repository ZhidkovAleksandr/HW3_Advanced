package task4;

import java.io.*;

public class WithFile {

    private  final String PATH_TO_FILE = "src/task4/";
    private  String fullName;

     {

        fullName = PATH_TO_FILE + createFileName();

    }

    private String createFileName(){
        return this.hashCode() +".txt";
    }
    public boolean createFileInDirectoryOfProject() throws IOException {

        File fileInProject = new File(fullName);
        return fileInProject.createNewFile();

    }

    public void putSomeInFile(){

        try {
            //FileWriter writer = new FileWriter("/Users/alexandrzhidkov/Documents/testfile.txt", true);
            FileWriter writer = new FileWriter(fullName, true);
            writer.write("We have putted this into new txt file");
            writer.close();

        } catch (IOException e) {
            System.out.println("During writing process error was captured");
        }

    }

    public void readInformationFromFile(){

        try {
            FileReader fr = new FileReader(fullName);
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
