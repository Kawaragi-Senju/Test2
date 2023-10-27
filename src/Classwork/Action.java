package Classwork;

import java.io.File;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.RecursiveAction;


public class Action extends RecursiveAction {
    final int TIME = 30;
    String[] folders;

    public Action(String[] folders) {
        this.folders = folders;
    }

    @Override
    protected void compute() {
        if(folders.length == 1){
            monitorFolder(folders[0]);
        } else {
            Action action = new Action(Arrays.copyOfRange(folders, 0, folders.length/2));
            Action action1 = new Action(Arrays.copyOfRange(folders, folders.length/2, folders.length));
            action.fork();
            action1.fork();
            action.join();
            action.join();
        }

    }

    private void monitorFolder(String path){
        String[] files;
        Random random = new Random();
        int number = random.nextInt();
        LocalTime lt = LocalTime.now();
        while(lt.plusSeconds(TIME).isAfter(LocalTime.now())){
            //System.out.println("Works" + number);
            File file = new File(path);
            files = file.list();
            if(files.length >= 1){
                System.out.println("files appeared");
                break;
            }
        }
    }
}