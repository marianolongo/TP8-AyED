import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List lamplist= new ArrayList();
        Lamp lamp3= new Lamp("lamp03", 5000000,"El Sol",1);
        Lamp lamp1= new Lamp("lamp01",1,"Lampara que no ilumina",10000000);
        Lamp lamp4= new Lamp("lamp04",12,"Bajo Consumo",1000);
        Lamp lamp2= new Lamp("lamp02",35,"Lampara Led",81923);
        lamplist.add(lamp1);
        lamplist.add(lamp2);
        lamplist.add(lamp3);
        lamplist.add(lamp4);
        BinarySearchTree<Lamp> bst=new BinarySearchTree<>();
        bst = bst.transformList(lamplist);
        bst.remove(lamp3);
        bst.modifyQuantity(bst,2,lamp3);
        bst.printLevelOrder(bst.getRoot());
    }
}
