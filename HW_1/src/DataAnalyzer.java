import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class DataAnalyzer {
    static LinkedList<Integer> list;
    public DataAnalyzer() {
        list = new LinkedList();
    }
    public static void insertNumberToList(String fileName){
        try {
            BufferedReader reader = new BufferedReader(new FileReader(fileName));
            reader.lines().forEach(numberTypeString -> {
                int numberTypeInt = Integer.parseInt(numberTypeString);
                list.add(numberTypeInt);
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int min(){
        int min[] = {list.getFirst()};
        list.forEach((number) -> {
            if(number < min[0]){
                min[0] = number;
            }
        });
        return min[0];
    }
    public static int max(){
        int max[] = {list.getFirst()};
        list.forEach((number) -> {
            if(number > max[0]){
                max[0] = number;
            }
        });
        return max[0];
    }
    public static int average(){
        int sum[] = {0};
        list.forEach((number) -> {
            sum[0] = number + sum[0];
        });
        int average = sum[0]/list.size();
        return average;
    }
    public static void main(String[] args) {
        new DataAnalyzer();
        insertNumberToList("sample3.txt");
        System.out.println(list);
        int minValue = average();
        System.out.println(minValue);

    }
}
