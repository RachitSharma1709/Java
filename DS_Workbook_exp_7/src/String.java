class CS {

    public static void main(String [] args)
    StackUsingLinkedlist obj = new StackUsingLinkedl ist ();
obj.push( 11):
            obj. push ( 22);
obj.push ( 33) ;
obj.push ( 44);
obj .display( ) ;
System.out. printf (  "\nTop element is %d\n");
    obj - peek(0);
    obj.pop 0;
    obj pop0:
            obj.display () ;
System. out. printf ( format: "\nTop element is %d\n", obj. peek(0);
    class StackUsingLinked list {
        private class Node {
            int data;
            Node link;
            Node top;
            StackUsingLinkedlist() { this. top = null; }
            public void push(int x)
            Node temp = new Node() :
                    if (temp = null)
                    System.out.print(s: "nHeap. Overflow");
return
            temp.data = x;
            temp. link = top;
            top = temp;
            public boolean isEmpty() { return top = null; }
            public int peek()
if (!isEmoty() ) {