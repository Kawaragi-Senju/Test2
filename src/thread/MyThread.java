package thread;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MyThread extends Thread{
    private final File file;

    public MyThread(File file){
        this.file = file;
    }

    @Override
    public void run(){
        synchronized (file) {
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                for(int i = 0; i < 10; i++) {
                    bw.write(Thread.currentThread().getName() + "\n");
                    System.out.println("Sad");
                    file.notifyAll();
                    file.wait();
                }
            } catch (IOException | InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
