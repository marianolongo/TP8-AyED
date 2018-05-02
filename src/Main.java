import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List lamplist= new ArrayList();
        Lamp lamp1= new Lamp("lamp01",1,"lampara que no ilumina",10000000);
        Lamp lamp2= new Lamp("lamp02",35,"lampara led",81923);
        Lamp lamp3= new Lamp("lamp03", 5000000,"el sol",1);
        Lamp lamp4= new Lamp("lamp04",12,"Bajo consumo",1000);
        lamplist.add(lamp1);
        lamplist.add(lamp2);
        lamplist.add(lamp3);
        lamplist.add(lamp4);
        BinarySearchTree<Lamp> bst=new BinarySearchTree<>();
        bst = bst.transformList(lamplist);
        bst.printLevelOrder(bst.getRoot());
        System.out.println("Cambio la cantidad de sol a 2 para ver si funciona el modify");
        System.out.println();
        bst.modifyQuantity(bst,2,lamp3);
        bst.printLevelOrder(bst.getRoot());
        /*System.out.println("Prueo eliminar una lampara para ver si funicona el remove");
        System.out.println();
        bst.remove(lamp1);
        bst.printLevelOrder(bst.getRoot());*/
        System.out.println("Pruebo agregar un elemento");
        System.out.println();
        Lamp lamp5= new Lamp("lamp05",2,"Farol",20);
        bst.insert(lamp5);
        bst.printLevelOrder(bst.getRoot());

    }
}
