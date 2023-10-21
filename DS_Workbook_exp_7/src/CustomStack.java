class CustomStack {
    int index = -1;
    int [] Size0fStack;
    final int DEFAULT_SIZE = 10;
    CustomStack(int size) {
        this.Size0fStack = new int [size];
    }
    CustomStack(){this.Size0fStack = new int [DEFAULT_SIZE];
    }

    public void push( int data) {
        if (index == Size0fStack. length-1){
            System. out. print( "stack is full");
    }
        index++;
        Size0fStack [index] = data;}
public int pop(){


        if (index ==-1){
        System. out. print ( "stack is empty");}
        return Size0fStack [index--];}
public int peek(){
        return Size0fStack [index];}
public boolean isEmpty() {
        if(index == -1 || index<Size0fStack.length-1){
            return true;
        }


        return false;}
public boolean isFull(){
        if (index == Size0fStack. length-1){
        return true;}
        return false;}
public void printStack (){
        if (isEmpty() ) {
        System.out.println("stack empty");}
        for(int i=index; i>=0; i--) {
            System. out. println(Size0fStack [i] );
            System. out. println ("-");
        }}

public static void main(String[] args) {
        CustomStack stack1 = new CustomStack( 5);
    stack1. push ( 1);
    stack1. push ( 2) ;
    stack1. push ( 3) ;
    stack1. push ( 4);
    stack1. push ( 5);
        //System. out. println (stack1.pop());
//System, out . println (stackl.pop());
        System. out. println (stack1. isEmpty() );
        System. out. println (stack1. isFull());
        System.out. println (stack1. peek() );
        stack1.printStack();}
}