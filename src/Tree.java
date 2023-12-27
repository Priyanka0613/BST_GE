public class Tree<T extends Comparable <T>> {

    public Node<T> insert(Node<T> root, T data) {
        if(root == null){
            return new Node<>(data);
        }
        if(root.data.compareTo(data)  < 0 ){
           root.right = insert(root.right,data);
        }
        else if (root.data.compareTo(data) > 0){
            root.left = insert(root.left,data);
        }
        return root; 
    }

    public void preorderFunction(Node<T> current){
        if(current == null) return;
        System.out.print(current.data + " ");
        preorderFunction(current.left);
        preorderFunction(current.right);
    }

    public void inorderFunction(Node<T> current){
        if(current == null) return;
        inorderFunction(current.left);
        System.out.print(current.data + " ");
        inorderFunction(current.right);
    }

    public void postorderFunction(Node<T> current){
        if(current == null) return;
        postorderFunction(current.left);
        postorderFunction(current.right);
        System.out.print(current.data + " ");
    }
}
