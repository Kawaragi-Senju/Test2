package Classwork;

import java.io.File;
import java.time.LocalTime;
import java.util.concurrent.RecursiveAction;


public class Action extends RecursiveAction {
    final int TIME = 5;
    Action action = new Action();

    @Override
    protected void compute() {
        if(){
// создать конструктор для Action который принимает список папок,
// в compute надо проверку на кол-во файлов в папках
// , если файлов много распараллелить их в экшены.
        }
    }

    private void monitorFolder(String path){
        LocalTime lt = LocalTime.now();
        while(lt.plusSeconds(TIME).isAfter(LocalTime.now())){
            File file = new File(path);
            String[] files = file.list((File file1, String name) -> file1.isFile());
            if(files.length > 1){
                System.out.println("files appeared");
            }
        }
    }
}