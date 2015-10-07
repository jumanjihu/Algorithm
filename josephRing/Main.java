import java.util.LinkedList;
public class Main {
    static  int n =10;
    static  int m =3;
    public static void main(String[] args) {
        LinkedList<Node> lList = initNodes(n);

        Node prev = lList.getFirst();
        while(lList.size() >1){
            Node removedElement = getRemovedElement(prev);
            System.out.println("remove " + removedElement.value);
            getMovedPrevElement(prev).setNext(removedElement.getNext());
            lList.remove(removedElement);
            prev = removedElement.getNext();
        }
        System.out.println("remove " + lList.getFirst().value);
    }

    private static LinkedList<Node> initNodes(int n) {
        LinkedList<Node> lList = new LinkedList<Node>();
        for (int i=0; i<n; i++) {
            Node node = new Node(String.valueOf(i));
            if (lList.size() >0){
                lList.getLast().next = node;
            }
            lList.add(node);
        }
        lList.getLast().next = lList.getFirst();
        return lList;
    }

    private static Node getMovedPrevElement(Node prev) {
        for (int i=1 ;i<m-1;i++){
            prev=prev.getNext();
        }
        return prev;
    }

    private static Node getRemovedElement(Node prev) {
        for (int i=1 ;i<m;i++){
            prev=prev.getNext();
        }
        return prev;
    }
}
