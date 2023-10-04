package ListInt;


import java.util.List;
import java.util.concurrent.locks.Lock;

public class Thread1 extends Thread{
    List<Integer> list;
    Lock lock;
    Integer anInt;

    public Thread1(List<Integer> list, Lock lock, int anInt){
        this.list = list;
        this.lock = lock;
        this.anInt = anInt;
    }

    @Override
    public void run(){
        lock.lock();
        while(list.remove(anInt)){
        }
        lock.unlock();
    }
}
