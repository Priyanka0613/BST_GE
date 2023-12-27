public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("BST");
        Tree<Integer> BST = new Tree<Integer>();
        Node<Integer>  root = BST.insert(null, 56) ;
        BST.insert(root, 56);
        BST.insert(root, 30);
        BST.insert(root, 70);

        BST.inorderFunction(root);
        System.out.println("SIZE: " + BST.sizeFunction(root));
    }
}
