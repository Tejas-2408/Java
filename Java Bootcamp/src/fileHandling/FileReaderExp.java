package fileHandling;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderExp {
    public static void main(String[] args) {
        try(FileReader fr = new FileReader("note.txt")){
            int letters = fr.read();
            while(fr.ready()){
                System.out.println((char)fr.read());
                letters = fr.read();
            }

        } catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
