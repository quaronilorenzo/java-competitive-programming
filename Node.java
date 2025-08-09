public class Node {
    
    int data;
    Node next;
    
    Node(int data, Node next){
        this.data = data;
        this.next = next;
    }
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
    
    public static void main(String[] args) {
        int[] arr = {0,1,2,4,5};
        Node y = new Node(arr[0]);
        
    }
}
