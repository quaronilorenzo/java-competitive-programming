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
    public void printTop(Stack s){
        if(isStackEmpty(s.top)){
            System.out.println("Lo stack è vuoto");
        }else{
            System.out.println(s.arr[top]);
        }
    }
    public void sizeStack(Stack s){
        System.out.println("Lunghezza stack:" + s.length);
    }

    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(s, 5);
        s.push(s, 8);
        s.push(s, 8);
        s.push(s, 8);
        s.push(s, 7);
        s.push(s, 8);
        s.printTop(s);
    }
}
