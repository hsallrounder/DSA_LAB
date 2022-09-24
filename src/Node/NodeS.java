package Node;

public class NodeS {
    int data;
    NodeS next;
    public NodeS(int data) {
        this.data = data;
    }

    public NodeS getNext() {
        return next;
    }

    public void setNext(NodeS next) {
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
