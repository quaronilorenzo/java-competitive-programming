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
        System.out.println(head.data); // verifichiamooo
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
        System.out.println(newTail.data); // verifichiamooo
        return head;
    }
    public static Node insertAtIndex(Node head, int index, int val) {
    // Se index == 0 → insertAtHead
    // Scorri fino al nodo prima dell'indice
    // Collega il nuovo nodo in mezzo
    if(index == 0){
        insertAtHead(head, val);
        return head; // se l'indice è 0 insertiamo dal head
    }
    int i = 1; // contatore che ci servirà ad arrivare fino al index
    Node temp = head.next; // head la abbiamo sistemata, ora iniziamo dal prossimo
    Node newVal = new Node(val); // creiamo il nuovo nodo
    while(i != (index-1)){ // loopiamo fino al indice come da suggerimento dalla richiesta, 
        temp = temp.next; // continuiamo a ciclare il nodo
        i++; // si incrementa l'indice
    }
    temp.next = newVal; // se vogliamo storare il nuovo valore dobbiamo fare temp.next non temp e basta, perchè siamo un indice dietro per metterlo nella posizione richiesta
    System.out.println(temp.next.data); // verifichiamooo
    return head;
    }
    public static void main(String[] args) {
        int[] arr = {4,1,2,4,5};
        Node head = stackingList(arr);
        head = insertAtIndex(head, 0, 50);
    }
}
