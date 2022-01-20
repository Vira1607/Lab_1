import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
 
public class Main {
public static boolean isSequence(String str){
  for (int i=1;i<str.length();i++)
         {
            if (str.charAt(i-1)>str.charAt(i))return false;
         }  return true;
    }
    // построчное считывание файла
    public static void main(String[] args) {
        try {
            File file = new File("manifestGNU.txt");
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);
            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                String[] words = line.split(" ");
                 for (String word : words) {
                       if (isSequence(word)) System.out.println(word);
                       }
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
 
}
