package Stack;

import Node.NodeS;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StackBySinglyLinkedList {
    NodeS top;

    public StackBySinglyLinkedList() {
    }

    public boolean isEmpty(){
        return top==null;
    }

    public void push(NodeS newnode){
        newnode.setNext(top);
        top=newnode;
    }

    public void push(){
        Scanner sc = new Scanner(System.in);
        try {
            int tdata = sc.nextInt(); // "name"
            sc.close();
            push(tdata);
        }
        catch (InputMismatchException e){
            System.out.println(e);
        }
    }

    public void push(int data){
        push(new NodeS(data));
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("empty");
            return 0;
        }
        int ans=top.getData();
        top=top.getNext();
        return ans;
    }
    public void display(){
        NodeS s=top;
        while(s!=null){
            System.out.println(s.getData());
            s=s.getNext();
        }
    }

    public static void main(String[] args) {
        StackBySinglyLinkedList obj = new StackBySinglyLinkedList();
        obj.push(10);
        obj.push(20);
        obj.pop();
        obj.pop();
        obj.push(10);
        obj.display();
    }
}


/*
1) get choice from user implement stack by
he wants to work with array, singly linked list or doubly linked list
2) which operation you want to perform
3) use the concept of data hiding by making the variables private
4) use getter and setter methods along with constructors
5) use overloading feature
5) use user defines exception as per your understanding of the type of exception
7) use predefined exception also
 */