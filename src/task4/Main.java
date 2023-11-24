package task4;

import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        WithFile nExmp = new WithFile();
        boolean isCreated = nExmp.createFileInDirectoryOfProject();
        if (isCreated){
            nExmp.putSomeInFile();
            nExmp.readInformationFromFile();
        }else {
            System.out.println("Try again");
        }
    }

}
