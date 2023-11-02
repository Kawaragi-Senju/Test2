package Classwork;

import java.io.File;
import java.nio.file.FileVisitor;
import java.nio.file.Files;
import java.util.Arrays;
import java.util.concurrent.RecursiveTask;
import java.util.stream.Stream;


public class Action extends RecursiveTask<Integer> {
    final int TIME = 30;
    String[] folders;

    public Action(String[] folders) {
        this.folders = folders;
    }

    @Override
    protected Integer compute() {
        if (folders.length == 1) {
            return monitorFolder(folders[0]);
        } else {
            Action action = new Action(Arrays.copyOfRange(folders, 0, folders.length / 2));
            Action action1 = new Action(Arrays.copyOfRange(folders, folders.length / 2, folders.length));
            action.fork();
            action1.fork();
            return action.join() + action1.join();
        }
    }

    private String monitorFolderButCooler(String path){
        String[] files;
        return "";
    }

    private Integer monitorFolder(String path) {
        String[] files;
        File file = new File(path);
        files = file.list();
        if (files == null) {
            return 0;
        }else{
            return files.length;
        }
    }
}