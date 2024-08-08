import java.io.File;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
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
        }
    }
}
