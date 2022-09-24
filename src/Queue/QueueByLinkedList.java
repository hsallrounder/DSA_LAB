package Queue;

class Node{
    String data;
    Node next;

    public Node(String data) {
        this.data = modify3(data);
    }
    private String modify1(String data){
        String res="";
        for(int i=0;i<data.length();i++){
            if(data.charAt(i)%2==0){
                res=data.charAt(i)+res;
            }
            else {
                res+=data.charAt(i);
            }
        }
        return res;
    }
    private String modify2(String data){
        String res="";
        boolean flag=true;
        if(data.charAt(0)=='-') res+="N";
        else res+="P";
        for(int i=0;i<data.length();i++){
            if(res=="N") continue;
            if(data.charAt(i)=='0'){
                if(flag) continue;
                res+="Z";
            }
            else if((data.charAt(i)-'0')%2==0){
                res+="e";flag=false;
            }
            else {
                res+="o";flag=false;
            }
        }
        return res;
    }
    private String modify3(String data){
        return String.valueOf(sumOfDigiCyc(data));
    }
    private int sumOfDigiCyc(String val){
        int sum=0,start=0;
        while (start!=val.length()) {
            for (int i = start; i < val.length(); i++) {
                sum += val.charAt(i) - '0';
            }
            start++;
        }
        return sum;
    }
}
public class QueueByLinkedList {
    Node front,rear;

    public boolean isEmpty(){
        return front==null && rear==null;
    }

    public void enqueue(String data){
        Node n1=new Node(data);
        if(isEmpty()){
            front=rear=n1;
        }
        else {
            rear.next=n1;
            rear=n1;
        }
    }

    public void dequeue(){
        if(isEmpty()){
            System.out.println("underflow");
        }
        else {
            System.out.println(front.data);
            front=front.next;
        }
    }

    public void display(){
        if(isEmpty()) System.out.println("underflow");
        else {
            Node temp=front;
            while(temp!=null){
                System.out.println(temp.data);
                temp=temp.next;
            }
        }
    }
}
class Test{
    public static void main(String[] args) {
        QueueByLinkedList q = new QueueByLinkedList();
        if(args.length>0){
            for(int i=0;i<args.length;i++) {
                q.enqueue(args[i]);
            }
        }
        q.display();
    }
}