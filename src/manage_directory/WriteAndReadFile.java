package manage_directory;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteAndReadFile {
    public WriteAndReadFile() throws IOException {
        FileWriter fw = new FileWriter("src\\data\\directory.csv");
        BufferedWriter bw = new BufferedWriter(fw);




    }
}
