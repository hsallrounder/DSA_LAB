package Node;

public class NodeD {
    int data;
    NodeD next;
    NodeD prev;

    public int getData() {
        return data;
    }

    public NodeD getNext() {
        return next;
    }

    public void setNext(NodeD next) {
        this.next = next;
    }

    public void setPrev(NodeD prev) {
        this.prev = prev;
    }

    public NodeD getPrev() {
        return prev;
    }

    public NodeD(int data) {
        this.data = data;
    }
}
