package Homework.HW_02;

import java.io.File;
import java.io.FileReader;

public class Task2 {

    public static void main(String[] args) {
        read_and_parse_txt();
    }

    public static void read_and_parse_txt() {
        String file_name = "D:/GeekBrains/Java/Homework/HW_02/database.txt";
        File file = new File(file_name);
        try {
            FileReader f = new FileReader(file);
            char[] a = new char[(int) file.length()];
            f.read(a);
            StringBuilder sb = new StringBuilder();
            for (char c : a) {
                sb.append(c);
            }
            f.close();
            String line = sb.toString();
            line = line.replace("фамилия", "Студент");
            line = line.replace("оценка", "получил(а)");
            line = line.replace("предмет", "по предмету");
            line = line.replace("\"", "");
            line = line.replace(":", " ");
            line = line.replace(",", " ");
            System.out.println(line);
            
        } catch (Exception e) {
            System.out.println("Error" + e);
        }
    }
}