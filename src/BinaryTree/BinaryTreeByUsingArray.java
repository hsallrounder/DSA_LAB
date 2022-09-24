package BinaryTree;

public class BinaryTreeByUsingArray<T> {
    T[] arr;
    int lastusedindex;

    public BinaryTreeByUsingArray(int size) {
        arr = (T[]) new Object[size];
        this.lastusedindex = 0;
    }

    public void insert(T value) {
        if (arr.length - 1 == lastusedindex) System.out.println("Tree is full");
        else {
            arr[++lastusedindex] = value;
        }
    }

    public void PreOrderTraverse(int index) {
        if (index > lastusedindex) {
            return;
        }
        System.out.print(arr[index] + " ");
        PreOrderTraverse(index * 2);
        PreOrderTraverse(index * 2 + 1);
    }

    public static void main(String[] args) {
        BinaryTreeByUsingArray<Integer> tree=new BinaryTreeByUsingArray(6);
        tree.insert(5);
        tree.insert(10);
        tree.insert(50);
        tree.insert(60);
        tree.insert(70);
        tree.insert(55);
        tree.PreOrderTraverse(1);
    }
}