package Problems;
class Node
{
    int key;
    Node left, right;
    public Node(int item)
    {
        this.key=item;
        left=right=null;
    }
}
public class BinaryTree
{
    Node root;
    BinaryTree()
    {
        root=null;
    }
    /**
     * Prints nodes in bottom-up postorder traversal: left, right, root
     * @param node
     */
    void printPostorder(Node node)
    {
        if(node==null)
        {
            return;
        }
        printPostorder(node.left);
        printPostorder(node.right);
        System.out.print(node.key+" ");
    }
    /**
     * Prints nodes in inorder traversal: left, root, right
     * @param node
     */
    void printInorder(Node node)
    {
        if(node==null)
        {
            return;
        }
        printInorder(node.left);
        System.out.print(node.key+" ");
        printInorder(node.right);
    }
    /**
     * Prints nodes in inorder traversal: root, left, right
     * @param node
     */
    void printPreorder(Node node)
    {
        if(node==null)
        {
            return;
        }
        System.out.print(node.key+ " ");
        printPreorder(node.left);
        printPreorder(node.right);
    }
    void printPostorder()  {     printPostorder(root);  }
    void printInorder()    {     printInorder(root);   }
    void printPreorder()   {     printPreorder(root);  }
    public static void main(String[] args)
    {
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("Preorder traversal of binary tree is ");
        tree.printPreorder();
        System.out.println("\nInorder traversal of binary tree is ");
        tree.printInorder();
        System.out.println("\nPostorder traversal of binary tree is ");
        tree.printPostorder();
    }
}
