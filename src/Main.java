import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        int count = 1;
        while(true){
            System.out.println("Введите путь к файлу и нажмите <Enter>:");
            String path = new Scanner(System.in).nextLine();
            File file = new File(path);
            boolean fileExists = file.exists();
            boolean isDirectory = file.isDirectory();
            if (fileExists && !isDirectory){
                System.out.println("Путь указан верно");
                System.out.println("Это файл номер " + count);
                count++;
            }
            else {
                System.out.println("Указанный файл не существует или указанный путь является путем к папке");
                continue;
            }
            try {
                FileReader fileReader = new FileReader(path);
                BufferedReader reader = new BufferedReader(fileReader);
                String line;
                int minLength = 0;
                int maxLength = 0;
                int sumString = 0;
                while ((line = reader.readLine()) != null) {
                    int length = line.length();
                    if (length > 1024){
                        throw new RuntimeException("Длина строки превысило 1024 символов");
                    }
                    if (length > maxLength) maxLength = length;
                    if (sumString == 0 || length < minLength) minLength = length;
                    sumString+=1;
                }
                System.out.println("Общее количество строк в файле " + sumString);
                System.out.println("Длина самой длинной строки в файле " + maxLength);
                System.out.println("Длина самой короткой строки в файле " + minLength);
            }
            catch (FileNotFoundException ex){
                ex.printStackTrace();
            }
            catch (IOException ex){
                ex.printStackTrace();
            }
        }
    }
}
