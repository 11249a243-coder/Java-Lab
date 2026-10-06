import java.io.*;

class FileOperations {
    public static void main(String[] args) throws Exception {

        File f = new File("sample.txt");

        f.createNewFile();

        FileWriter fw = new FileWriter(f);
        fw.write("Hello, this is a Java file.");
        fw.close();

        FileReader fr = new FileReader(f);

        int ch;
        System.out.println("File Content:");

        while ((ch = fr.read()) != -1) {
            System.out.print((char) ch);
        }

        fr.close();
    }
}