package Stack;

public class StackByArray {
    int arr[];
    int topofStack;

    public StackByArray(int size) {
        arr=new int[size];
        topofStack=-1;
    }

    public boolean isFullStack(){
        if(topofStack==arr.length-1){
            System.out.println("Stack is full");
            return true;
        }
        return false;
    }

    public boolean isEmptyStack(){
        if(topofStack==-1){
            return true;
        }
        return false;
    }

    public void peek(){
        if(isEmptyStack()){
            System.out.println("stack is empty");
        }
        else {
            System.out.println(arr[topofStack]);
        }
    }

    public void delete(){
        arr=null;
        System.out.println("stack deleted");
    }

    public void push(int val){
        if(isFullStack()){
            System.out.println("stack overflow error");
        }
        else{
            topofStack++;
            arr[topofStack]=val;
            System.out.println("successfully inserted");
        }
    }

    public void pop(){
        if(isEmptyStack()){
            System.out.println("Stack underflow error");
        }
        else{
            System.out.println(arr[topofStack]);
            topofStack--;
        }
    }
}
