package src.datastructures;

public class BinarySearchTree {
    //Binary Trees are Trees that have no more than two children

    //Binary Search Trees are Trees with the root value should be greater than the left side but less than the right.


    //benefits:easy to locate a node when they are in this order

    //time complexity: best case O(log n)
    //worse case O(n)

    //space complexity O(n)
    BinaryNode root;

    public static void main(String[] args) {
        BinarySearchTree tree=new BinarySearchTree();

        tree.insert(new BinaryNode(7));
        tree.insert(new BinaryNode(8));
        tree.insert(new BinaryNode(3));
        tree.insert(new BinaryNode(6));
        tree.insert(new BinaryNode(4));
        tree.insert(new BinaryNode(5));
        tree.insert(new BinaryNode(2));
        tree.insert(new BinaryNode(1));

tree.remove(0);
        tree.display();

        System.out.println(tree.search(7));
    }


    public void insert(BinaryNode node){
        root= insertHelper(root,node);

    }
    private BinaryNode insertHelper(BinaryNode root,BinaryNode node){
        int data= node.data;
        if(root == null){
            root  = node;
            return root;
        } else if (data < root.data) {
            root.left = insertHelper(root.left,node);
            
        }else{
            root.right= insertHelper(root.right,node);

        }
        return root;

    }
    public void display(){
        displayHelper(root);
    }
    private void displayHelper(BinaryNode root){
        if(root!=null){
            displayHelper(root.left);
            System.out.println(root.data);
            displayHelper(root.right);
        }

    }
    public boolean search(int data){
      return  searchHelper(root,data);

    }
    private boolean searchHelper(BinaryNode root,int data){

        if (root==null){
            return false;

        } else if (root.data== data) {
            return true;
            
        }else if(root.data>data){
            return searchHelper(root.left,data);

        }else{
            return searchHelper(root.right,data);
        }


    }
    public void remove(int data){
        if(search(data)){
            removeHelper(root,data);

        }else{
            System.out.println(data +" could not be found");
        }

    }
    private BinaryNode removeHelper(BinaryNode root,int data){

        if(root == null){
            return root;

        } else if (data < root.data) {
            root.left=removeHelper(root.left,data);
            
        } else if (data> root.data) {
            root.right=removeHelper(root.right,data);

        }else{//node found
            if(root.left == null&& root.right==null){
                root= null;
            } else if (root.right!= null) {//find successors to replace this node
                root.data= successor(root);
                root.right=removeHelper(root.right,root.data);
            } else {
                root.data=predecessor(root);
                root.left=removeHelper(root.left,root.data);
                
            }

        }
        return root;
    }
    private int successor(BinaryNode root){//find the least value below the right child of this root node
        root=root.right;
        while(root.left!= null){
            root=root.left;

        }
        return  root.data;
    }
    private int predecessor(BinaryNode root){//find the greatest value below the right child of this root node
        root=root.left;
        while(root.right!= null){
            root=root.right;

        }
        return  root.data;
    }


}
