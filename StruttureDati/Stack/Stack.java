package StruttureDati.Stack;

public class Stack{
    int top;
    int length; // lunghezza massima
    int[] arr;
    public Stack(){
        this.top = -1;
        this.length = 5;
        this.arr = new int[length];
    }
    public boolean isStackEmpty(int top){
        if(top == -1 ){
            return true; 
        }
        return false;
    }
    public int[] push(Stack s, int val){
        if(top == 4){ // se lo stack è pieno (il top è alla lunghezza del ultimo elemento del array)
            System.out.println("stack pieno!");
            return null;
        }
        s.top++;
        s.arr[top] = val;
        return s.arr;
    }
    public int pop(Stack s) {
        if (isStackEmpty(s.top)) {
            System.out.println("Stack vuoto!");
            return -1;
        }
        int val = s.arr[s.top];
        s.top--;
        return val;
    }
    public void printTop(Stack s){
        if(isStackEmpty(s.top)){
            System.out.println("Lo stack è vuoto");
        }else{
            System.out.println("top:" + s.arr[top]);
        }
    }
    public void printStack(Stack s){
        for(int i = 0; i  <= s.arr.length-1 ; i++){
            System.out.print(s.arr[i]+ " ");
        }
    }
    public void sizeStack(Stack s){
        System.out.println("Lunghezza stack:" + s.length);
    }
    public int[] reverseStack(Stack s){
        if(isStackEmpty(s.top)){
            System.out.println("lo stack è vuoto");
            return null;
        }
        int[] rev = new int[s.arr.length];
        int index = 0;
        for(int i = top; i >= 0; i--){
            rev[index] = s.arr[i];
            index++;
        }
        
        return rev;
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.arr = s.push(s, 5);
        s.arr = s.push(s, 8);
        s.arr = s.push(s, 8);
        s.arr = s.push(s, 5);
        s.arr = s.push(s, 7);
        System.out.println();
        s.arr = s.reverseStack(s);
        s.printStack(s);
    }
}
