import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class fileExample {
    public static void main (String[] args){
        String allNames = "";
        var fileName = "students.txt";
        try {
            allNames = Files.readString(Paths.get(fileName));
        }catch (IOException e) {
            System.out.println("Something went wrong reading from file.");
        }
        String[] nameList = allNames.split("\n");
        //part2 - printing the list
        for (String name: nameList){
            System.out.println(name);
        }
    }
}
