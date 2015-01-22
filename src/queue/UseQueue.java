package queue;


import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[]args){

        Queue<String> que = new LinkedList<String>();

        que.add("salah");
        que.add("uddin");
        que.add("akanda");
        System.out.println(que);
        System.out.println(que.size());

        System.out.println(que.peek());
        for(String st : que){
           System.out.println(st);
        }

    }
}
