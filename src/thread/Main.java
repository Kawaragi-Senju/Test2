package thread;

import java.io.File;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        File file = new File("C:\\File\\file.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        Thread thread = new MyThread(file);
        Thread thread2 = new MyThread(file);
        Thread thread3 = new MyThread(file);
        Thread thread4 = new MyThread(file);
        Thread thread5 = new MyThread(file);
        thread.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();
    }
}
