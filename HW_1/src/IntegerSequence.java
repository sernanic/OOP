
import java.util.InputMismatchException;
import java.util.Scanner; // Import the Scanner class

public class IntegerSequence {
    
    public static void getIntegerSequence() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter number sequence");
        boolean keepInput = true;
        int numberForSequence = 0;
        while (keepInput == true) {
            try {
                numberForSequence = scan.nextInt();
                FileTools.writeToFile(numberForSequence);
            } catch (InputMismatchException err) {
                System.out.println("Input is not an integer sequence input question terminated");
                keepInput = false;
            }

        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter name of file including extension");
        String fileName = scan.nextLine();
        FileTools userRecordToFile = new FileTools(fileName);
        userRecordToFile.createFile();
        getIntegerSequence();
    }
}
