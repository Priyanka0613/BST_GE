public class Node<T> {
    T data ;
    Node<T> left,right ;

    Node(T value){
         this.data = value ;
         this.left =null ;
         this.right = null ;
    }
}