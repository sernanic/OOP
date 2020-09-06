
import java.io.File; // Import the File class
import java.io.IOException; // Import the IOException class to handle errors
import java.io.FileWriter; // Import the FileWriter class
import java.io.BufferedWriter; // allows to append to file and not overwrite

public class FileTools {
    static String FileName;

    public FileTools(String fileName) {
        FileName = fileName;
    }

    public static void createFile() {
        try {
            File myObj = new File(FileName);
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public static void writeToFile(int fileIntContent) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter(FileName, true));
            bw.append(fileIntContent + "\n");
            bw.close();
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

}
