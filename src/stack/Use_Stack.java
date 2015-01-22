package stack;


import java.util.Stack;

public class Use_Stack {

    public static void main(String[]args){
        Stack <String> sta = new Stack<String>();
        sta.add("salah");
        sta.add("uddin");
        sta.add("akanda");

        System.out.println(sta);
        System.out.println(sta.size());


        //First in lest out
        System.out.println(sta.peek());

        for(String st : sta ){
            System.out.println(st);
        }

    }
}
