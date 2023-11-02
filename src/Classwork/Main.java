package Classwork;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ForkJoinPool;


public class Main {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ForkJoinPool commonpool = ForkJoinPool.commonPool();
        String[] paths = {"C:\\FileforJava\\papka", "C:\\FileforJava\\papka 2", "C:\\FileforJava\\papka 3", "C:\\FileforJava\\papka 4"};
        System.out.println(commonpool.invoke(new Action(paths)));
    }
}
//Переделать на FileVisitor, method filewalk();