class BinaryTreeNode {
    public int data;
    public BinaryTreeNode left,right,mid;

    public BinaryTreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;

    }

    public BinaryTreeNode getLeft() {
        return left;
    }
    public BinaryTreeNode getMid() {
        return mid;
    }
    public void setMid(BinaryTreeNode mid) {
        this.mid = mid;
    }
    public void setLeft(BinaryTreeNode left) {
        this.left = left;
    }

    public BinaryTreeNode getRight() {
        return right;
    }

    public void setRight(BinaryTreeNode right) {
        this.right = right;
    }


}

public class Main {

    public static void main(String[]args){
BinaryTreeNode b=new BinaryTreeNode(10);
        System.out.println("Original root->"+b.getData());
b.setData(21);
        System.out.println("new root->"+b.getData());
//value left child of root
        BinaryTreeNode leftChild = new BinaryTreeNode(10);
        // Set the value to left child
        b.setLeft(leftChild);
        //get the value
        System.out.println("left child="+b.getLeft().getData()); // It will print 10
        //value right child of root
BinaryTreeNode rightchild = new BinaryTreeNode(11);
// Set the value to right child
b.setRight(rightchild);
        System.out.println("right child="+b.getRight().getData());

        //left of left node
        BinaryTreeNode leftchildChild1=new BinaryTreeNode(1);
        leftChild.setLeft(leftchildChild1);
        System.out.println("Left child left node="+leftChild.getLeft().getData());
        //right child of left node
        BinaryTreeNode leftchildChild2=new BinaryTreeNode(2);
        leftChild.setRight(leftchildChild2);
        System.out.println("Left child Right node="+leftChild.getRight().getData());
        //left child of right node
        BinaryTreeNode rightChildchild1=new BinaryTreeNode(3);
        rightchild.setLeft(rightChildchild1);
        System.out.println("Right child left node="+rightchild.getLeft().getData());
        //right child of right node
        BinaryTreeNode rightChildchild2=new BinaryTreeNode(4);
        rightchild.setRight(rightChildchild2);
        System.out.println("Right child Right node="+rightchild.getRight().getData());
        //right child of mid node
        BinaryTreeNode rightChildMidChild= new BinaryTreeNode(8);
        rightchild.setMid(rightChildMidChild);
        System.out.println("Right child Mid node="+rightchild.getMid().getData());
        // Print the data values of the nodes
        printTree(b,1);



}

    public static void printTree(BinaryTreeNode node, int i) {

        if (node != null) {
            System.out.println("Level="+i + ")." + node.getData());

            printTree(node.getLeft(), i + 1);/*i+1 only uses the value of i+1, whereas ++i directly increments the
             value of i in the storage*/
            printTree(node.getMid(), i + 1);
            printTree(node.getRight(), i + 1);

        }
    }
}
