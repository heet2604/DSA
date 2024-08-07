import java.util.ArrayList;
           
public class stack {                                                          //stack using arraylist
    public static class stackA{
        static ArrayList<Integer> list = new ArrayList<>();
        public static boolean empty(){
            if(list.size()==0){
                return true;
            }
            return false;
        }

        public static void push(int data){
            list.add(data);
        }

        public static int pop(){
            if(empty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            list.remove(list.size()-1);
            return top;
        }

        public static int peek(){
            if(empty()){
                return -1;
            }
            int top=list.get(list.size()-1);
            return top;
        }
    }

    public static void main(String args[]){
        stackA s = new stackA();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(s.empty()==false){
            System.out.println(s.peek() );
            s.pop();
        }

    }
}


public class stack{                                         //Stack using LinkedLists
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=next;
        }
    }
    public static class stackA{
        static Node head;
        public static boolean empty(){
            return head==null;
        }

        public static void push(int data){
            Node newnode = new Node(data);

            if(empty()){
                head=newnode;
                return;
            }
            newnode.next=head;
            head=newnode;
        }
        public static int pop(){
            if(empty()){
                return -1;
            }
            int top=head.data;
            head=head.next;
            return top;
        }

        public static int peek(){
            if(empty()){
                return -1;
            }
            return head.data;
        }

    }

    public static void main(String args[]){
        stackA s = new stackA();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        while(s.empty()==false){
            System.out.println(s.peek());
            s.pop();
        }
    }
}

import java.util.*;                                                    //Stack using JCF

public class StackA{                                                     //push at the bottom

    public static void bottom(Stack<Integer>s,int data){
        if(s.empty()){
            s.push(data);
            return;
        }
        int top=s.pop();
        bottom(s,data);
        s.push(top);
    }
    public static void main(String args[]){
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        bottom(s,4);
        while(!s.empty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}

import java.util.*;                                      //Reverse a string using stack
public class StackA{
    public static String reverse(String str){
        Stack<Character> s = new Stack<>();
        int i=0;
        while(i<str.length()){
            s.push(str.charAt(i));
            i++;
        }
        StringBuilder res = new StringBuilder("");
        while(!s.empty()){
            char curr=s.pop();
            res.append(curr);
        }
        return res.toString();
    }

    public static void main(String args[]){
        String str="Heet Dudhwala";
        System.out.println(reverse(str));
    }
}


import java.util.*;                                  //reverse a stack
 
public class StackA{
    public static void bottom(Stack<Integer> s , int data){
        if(s.empty()){
            s.push(data);
            return;
        }
        int top = s.pop();
        bottom(s,data);
        s.push(top);
    }

    public static void reverse(Stack<Integer> s){
        if(s.empty()){
            return;
        }
        int top=s.pop();
        reverse(s);
        bottom(s,top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        reverse(s);
        while(!s.empty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}


