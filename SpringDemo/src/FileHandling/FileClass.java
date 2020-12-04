package FileHandling;

import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class FileClass {

    public static void main(String args[]) {

        try {

            File f = new File("C:/Users/Akshya kochale/Desktop/test.txt");

            FileWriter wr = new FileWriter(f);
            if (f.canWrite()) {
                wr.append("is this replacing all the previous content");
                wr.append("watch your mouth bitch once again");
                wr.close();

            }

            Scanner sc = new Scanner(f);

            while (sc.hasNext()) {
                String s = sc.nextLine();
                System.out.print(s);
            }
        } catch (Exception e) {
            System.out.println("not able to write");
        }
    }

}
