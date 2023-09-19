package message;

import java.util.LinkedList;
import java.util.Queue;

public class Message {
    Queue<String> messageQueue = new LinkedList<>();

    public void showMessage(){
        for(int i = 0; true; i++){
            while (!messageQueue.isEmpty()){
                System.out.println(messageQueue.poll());
            }
        }
    }
}
