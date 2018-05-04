import java.util.List;
import java.util.NoSuchElementException;

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
        if (node == null) return node;

        if (elem.compareTo(node.elem) < 0)
            node.left = remove(node.left, elem);
        else if (elem.compareTo(node.elem) > 0)
            node.right = remove(node.right, elem);

        else {
            if (node.left == null)
                return node.right;
            else if (node.right == null)
                return node.left;

            node.elem = getMin(node.right).elem;
            node.right = remove(node.right, node.elem);
        }

        return node;

    }

    private DoubleNode<T> getMin(DoubleNode<T> node){
        if (node.left == null)
            return node;
        else
            return getMin(node.left);
    }

    private DoubleNode<T> removeMin(DoubleNode<T> node){
        if (node.left != null)
            node.left = removeMin(node.left);
        else
            node = node.left;
        return node;
    }

    public T search(T elem){
        return search(root, elem);
    }

    private T search(DoubleNode<T> node, T elem){
        if(node == null) throw new NoSuchElementException("Node not found");
        if (elem.compareTo(node.elem)== 0)
            return node.elem;
        else if (elem.compareTo( node.elem)< 0)
            return search(node.left, elem);
        else
            return search(node.right, elem);
    }

//    public void modifyQuantity(BinarySearchTree<Lamp> tree, int quantity, Lamp lamp){
//        try {
//            if (tree.contains(lamp)) {
//                tree.search(lamp).setQuantity(quantity);
//            }
//        }catch (NoSuchElementException e){
//            throw new NoSuchElementException("Lamp not found");
//        }
//    }
//
//    public void mofidyName(BinarySearchTree<Lamp> tree, String name, Lamp lamp){
//        try {
//            if (tree.contains(lamp)) {
//                tree.search(lamp).setLampType(name);
//            }
//        }catch (NoSuchElementException e){
//            throw new NoSuchElementException("Lamp not found");
//        }
//    }
//
//    public void modifyWatts(BinarySearchTree<Lamp> tree, int watts, Lamp lamp){
//        try {
//            if (tree.contains(lamp)) {
//                tree.search(lamp).setWatts(watts);
//            }
//        }catch (NoSuchElementException e){
//            throw new NoSuchElementException("Lamp not found");
//        }
//    }

    public boolean contains(T elem){
        return search(elem) == elem;
    }

    public void printInOrder(){
        printInOrder(root);
    }

    private void printInOrder(DoubleNode<T> node) {
        if(node.left != null) printInOrder(node.left);
        System.out.println(node.elem);
        if(node.right != null) printInOrder(node.right);
    }
}
