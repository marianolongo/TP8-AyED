import java.util.List;

public class BinarySearchTree<T extends Comparable> {
    private DoubleNode<T> root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(T x) {
        root = insert(root, x);
    }

    private DoubleNode<T> insert(DoubleNode<T> node, T elemToInsert) {
        if (node == null) {
            node = new DoubleNode<T>(null);
            node.elem = elemToInsert;
        } else if (elemToInsert.compareTo(node.elem) < 0)
            node.left = insert(node.left, elemToInsert);
        else
            node.right = insert(node.right, elemToInsert);
        return node;
    }

    public boolean isEmpty() {
        return root == null;
    }

    public DoubleNode<T> getRoot() {
        return root;
    }

    public BinarySearchTree<T> getLeft() {
        BinarySearchTree<T> t = new BinarySearchTree<>();
        t.root = root.left;
        return t;
    }

    public BinarySearchTree<T> getRight() {
        BinarySearchTree<T> t = new BinarySearchTree<>();
        t.root = root.right;
        return t;
    }

    public BinarySearchTree<T> transformList(List<T> list){
        BinarySearchTree<T> result = new BinarySearchTree<>();
        if(list.size() == 0){
            return result;
        }
        for (T elem:list) {
            result.insert(elem);
        }
        return result;
    }

    public void remove(T elem){
        root = remove(root, elem);
    }

    private DoubleNode<T> remove(DoubleNode<T> node, T elem) {
        if (elem.compareTo(node.elem) < 0)
            node.left = remove(node.left, elem);
        else if (elem.compareTo(node.elem) > 0)
            node.right = remove(node.right, elem);
        else
        if (node.right != null && node.right != null ) {
            node.elem = getMin(node.right).elem;
            node.right = eliminarMin(node.right);
        }
        else if (node.left != null)
            node = node.left;
        else
            node = node.right;
        return node;
    }

    private DoubleNode<T> getMin(DoubleNode<T> node){
        if (node.left == null)
            return node;
        else
            return getMin(node.left);
    }

    private DoubleNode<T> eliminarMin(DoubleNode<T> node){
        if (node.left != null)
            node.left = eliminarMin(node.left);
        else
            node = node.left;
        return node;
    }

    public T search(T elem){
        return search(root, elem).elem;
    }

    private DoubleNode<T> search(DoubleNode<T> node, T elem){
        if (elem.compareTo( node.elem)== 0)
            return node;
        else if (elem.compareTo( node.elem)< 0)
            return search(node.left, elem);
        else
            return search(node.right, elem);
    }

    public void modifyQuantity(int quantity, Lamp lamp){
        if(contains(lamp)){
            this.search(lamp)
        }
    }

    public boolean contains(T elem){
        return search(elem) == elem;
    }
}
