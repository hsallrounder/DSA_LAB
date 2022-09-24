package Stack;

import Node.NodeD;

import java.util.InputMismatchException;
import java.util.Scanner;

public class StackByDoublyLinkedList {
    NodeD top;
    NodeD bottom;

    public StackByDoublyLinkedList() {
    }

    public boolean isEmpty(){
        return top==null;
    }

    public void push(NodeD newnode){
        if(isEmpty()){
            bottom=newnode;
        }
        else {
            top.setPrev(newnode);
        }
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
        push(new NodeD(data));
    }

    public int pop(){
        if(isEmpty()){
            System.out.println("empty");
            return 0;
        }
        int ans=top.getData();
        if(top.getNext()==null && top.getPrev()==null){
            top=null;
        }
        else {
            top = top.getNext();
        }
        return ans;
    }

    public void display(){
        if(isEmpty()){
            System.out.println("empty");
        }
        NodeD s=top;
        while(s!=null){
            System.out.println(s.getData());
            s=s.getNext();
        }
    }

    public void displayRev(){
        if(isEmpty()){
            System.out.println("empty");
            return;
        }
        NodeD temp=bottom;
        while(temp!=null){
            System.out.println(temp.getData());
            temp=temp.getPrev();
        }
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("empty");
            return;
        }
        System.out.println(top.getData());
    }

    public void peekBottom(){
        if(isEmpty()){
            System.out.println("empty");
            return;
        }
        System.out.println(bottom.getData());
    }

    public static void main(String[] args) {
        StackByDoublyLinkedList obj=new StackByDoublyLinkedList();
        obj.push(10);
        obj.push(20);
        obj.push(30);
        obj.push(50);
        System.out.println("yo");
        obj.pop();
        obj.pop();
        obj.display();
    }
}