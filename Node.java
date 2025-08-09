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
    private static Node stackingList(int[] arr){
        Node head = new Node(arr[0]);
        Node mover = head; // store l'indirizzo di memoria di Head
        System.out.println(mover.data); 
        for(int i = 1; i < arr.length;i++){
            Node temp = new Node(arr[i]);
            mover.next =  temp;
            mover = temp;
        }
        return head;
    }
    public static Node insertAtHead(Node head, int val) {
    // 1. Crea nuovo nodo
    // 2. Punta il nuovo nodo a head
    // 3. Aggiorna head e restituiscilo
        Node newHead = new Node(val); 
        newHead.next = head;
        head = newHead;
        return head;
    }
    public static Node insertAtTail(Node head, int val) {
    // Se la lista è vuota → crea nodo e ritorna
    // Altrimenti scorri fino a last.next == null
    // Collega il nuovo nodo in fondo
        Node newTail = new Node(val, null);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newTail;
        return head;
    }
    public static void main(String[] args) {
        int[] arr = {4,1,2,4,5};
        Node head = stackingList(arr);

    }
}
