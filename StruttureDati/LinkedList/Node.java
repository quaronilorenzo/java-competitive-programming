package StruttureDati.LinkedList;


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
    public static boolean isListEmpty(Node head){
        if(head == null){
            return true;
        }
        return false;
    }
    public static void printList(Node head){
        Node temp = head;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
    public static Node insertAtHead(Node head, int val) {
    // 1. Crea nuovo nodo
    // 2. Punta il nuovo nodo a head
    // 3. Aggiorna head e restituiscilo
        if(isListEmpty(head) == true){
            System.out.println("La lista è vuota");
            return null;
        }
        Node newHead = new Node(val);
        newHead.next = head;
        head = newHead;
        System.out.println(head.data); // verifichiamooo
        printList(head);
        return head;
    }
    public static Node insertAtTail(Node head, int val) {
    // Se la lista è vuota → crea nodo e ritorna
    // Altrimenti scorri fino a last.next == null
    // Collega il nuovo nodo in fondo
        if(isListEmpty(head) == true){
            System.out.println("La lista è vuota");
            return null;
        }
        Node newTail = new Node(val, null);
        Node temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = newTail;
        printList(head);
        return head;
    }
    public static Node insertAtIndex(Node head, int index, int val) {
        // Se index == 0 → insertAtHead
        // Scorri fino al nodo prima dell'indice
        // Collega il nuovo nodo in mezzo
        if(isListEmpty(head) == true){
            System.out.println("La lista è vuota");
            return null;
        }
        if(index == 0){
            insertAtHead(head, val);
            return head; // se l'indice è 0 insertiamo dal head
        }
        int i = 1; // contatore che ci servirà ad arrivare fino al index
        Node temp = head.next; // head la abbiamo sistemata, ora iniziamo dal prossimo
        Node newVal = new Node(val); // creiamo il nuovo nodo
        while(i != (index-1)){ // loopiamo fino al indice come da suggerimento dalla richiesta - 1 perchè sennò sovrascriveremmo dei dati, e non saremo nel indice giusto.
            temp = temp.next; // continuiamo a ciclare il nodo
            i++; // si incrementa l'indice
        }
        newVal.next = temp.next;
        temp.next = newVal;  // se vogliamo storare il nuovo valore dobbiamo fare temp.next non temp e basta, perchè se scegliamo l'indice uguale storreremo il dato 
        printList(head);
        return head;
    }

    public static Node deleteHead(Node head) {
    // Se lista vuota → return null
    // Altrimenti head = head.next
    if(isListEmpty(head) == true){
        System.out.println("La lista è vuota");
        return null;
    }
        head = head.next;
        printList(head);
        return head;
    }
    public static Node deleteTail(Node head) {
    // Se lista vuota o con 1 nodo → return null
    // Scorri fino al penultimo nodo
    // Imposta penultimo.next = null
        if(isListEmpty(head) == true || head.next == null){
            return null;
        }
        Node temp = head; // penultimo
        while(temp.next.next != null){
            temp = temp.next;
        }
        temp.next = null;
        printList(head);
        return head;
    }

public static void main(String[] args) {
        int[] arr = {2,1,2,4,5};
        Node head = stackingList(arr);
        head = deleteTail(head);
    }
}
