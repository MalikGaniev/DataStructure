
import java.util.LinkedList;
import java.util.Queue;

public class MyTree {
    TNode root;

    public MyTree() {

    }
    void insert(int value){
        TNode newNode=new TNode(value);
        if(root==null){
            root=newNode;
            return;
        }
        TNode current=root;
        while(true){
            if(value<=current.value){
                if(current.leftChild==null){
                    //if left is null insert it here
                    current.leftChild=newNode;
                    break;
                }//if left is not null branch left subtree
                current=current.leftChild;
            }else{
                if(current.rightChild==null){
                    //if right is null insert it here
                    current.rightChild=newNode;
                    break;
                }//if right is not null branch left subtree
                current=current.rightChild;

            }
        }
    }
    // Root - left - right

    void preOrderTraversal(TNode root){
        if(root==null) return; //termination
        System.out.println(root.value+", ");// visit root
        preOrderTraversal(root.leftChild);//visit left subtree
        preOrderTraversal(root.rightChild);// visiting right subtree

    }


    void inOrderTraversal(TNode root){
        if(root==null)return;
        inOrderTraversal(root.leftChild);
        System.out.print(root.value+", ");
        inOrderTraversal(root.rightChild);
    }
    void postOrderTraversal(TNode root){
        if(root==null)return;
        inOrderTraversal(root.leftChild);
        inOrderTraversal(root.leftChild);
        System.out.print(root.value+", ");

    }
void levelOrderTraversal(TNode root){
        if(root==null)return;
        Queue<TNode>queue=new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()){
            TNode toVisit=queue.poll();
            System.out.println(toVisit.value+", ");
            if(toVisit.leftChild!=null) queue.add(toVisit.leftChild);
            if (toVisit.rightChild!=null) queue.add(toVisit.rightChild);
        }
}

}
