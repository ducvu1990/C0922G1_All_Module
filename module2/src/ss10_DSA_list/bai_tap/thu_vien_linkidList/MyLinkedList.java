package ss10_DSA_list.bai_tap.thu_vien_linkidList;

public class MyLinkedList<E>{
    private class Node{
        private Node next;
        private Object data;

        public Node(Object data){
            this.data = data;
        }
        public Object getData(){
            return this.data;
        }
    }
    private Node head;
    private int numNodes = 0;

    public MyLinkedList() {
    }
    public void addFirat(E element){
        Node tem = head;
        head = new Node(element);
    }
}
