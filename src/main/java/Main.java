import java.io.*;

public class Main {
    public static void main(String[] args) {
        File directory = new File("file");
        File file = new File(directory,"1txt");

        try {
            directory.mkdir();
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (InputStream inputstream = new FileInputStream("file/1.txt")){
            int a = inputstream.read();
            while (a != -1){
                System.out.print((char) a);
                a = inputstream.read();
            }
        }catch(IOException e){
           e.printStackTrace();
        }
        
        /*
        File file = new File("1.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // try с ресурсами. Передаваемый объект должен реализовывать интерфейс Closeable
        try (InputStream inputStream = new FileInputStream("1.txt")){
            int a = inputStream.read();  // Читает один байт, если данных нет -1
            while (a != - 1){
                System.out.print((char) a);
                a = inputStream.read();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
         */
    }
}
