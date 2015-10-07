/**
 * Created by hushiwei on 15/10/7.
 */
public class Node {
    String value;
    Node next;

    public Node(String value) {
        this.value = value;
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node tnext) {
        next = tnext;
    }
}
