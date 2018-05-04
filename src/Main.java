import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
//    public static void main(String[] args) {
//        List<Lamp> lamplist= new ArrayList();
//        Lamp lamp3= new Lamp("lamp03", 5000000,"El Sol",1);
//        Lamp lamp1= new Lamp("lamp01",1,"Lampara que no ilumina",10000000);
//        Lamp lamp4= new Lamp("lamp04",12,"Bajo Consumo",1000);
//        Lamp lamp2= new Lamp("lamp02",35,"Lampara Led",81923);
//        lamplist.add(lamp1);
//        lamplist.add(lamp2);
//        lamplist.add(lamp3);
//        lamplist.add(lamp4);
//        BinarySearchTree<Lamp> bst=new BinarySearchTree<>();
//        bst = bst.transformList(lamplist);
//        bst.printInOrder();
//    }

//    public static void main(String[] args) {
//        List<Lamp> lampList = new ArrayList<>();
//        Random random = new Random();
//        for (int i = 0; i < 100; i++) {
//            String lampCode = "" + (char)( random.nextInt(25) + 97) + (char)( random.nextInt(25) + 97) + (char)( random.nextInt(25) + 97);
//            int watts = random.nextInt(100);
//            String lampType = lampCode;
//            int quantity = random.nextInt(10000);
//            Lamp lamp = new Lamp(lampCode,watts,lampType,quantity);
//            lampList.add(lamp);
//        }
//        BinarySearchTree<Lamp> bst = new BinarySearchTree<>();
//        bst = bst.transformList(lampList);
//
//        bst.printInOrder();
//    }

    public static void main(String[] args) {
        BinarySearchTree<Lamp> bst = new BinarySearchTree<>();
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            String lampCode = "" + (char)( random.nextInt(25) + 97) + (char)( random.nextInt(25) + 97) + (char)( random.nextInt(25) + 97);
            int watts = random.nextInt(100);
            String lampType = lampCode;
            int quantity = random.nextInt(10000);
            Lamp lamp = new Lamp(lampCode,watts,lampType,quantity);
            bst.insert(lamp);
        }
    }

//    public static void main(String[] args) {
//        BinarySearchTree<Lamp> bst = new BinarySearchTree<>();
//        Lamp abc = new Lamp("abc",100,"abc",1000);
//        Lamp are = new Lamp("are",10,"are",1000);
//        Lamp xss = new Lamp("xss",20,"xss",1000);
//        Lamp usd = new Lamp("usd",400,"usd",1000);
//        Lamp mnb = new Lamp("mnb",70,"mnb",1000);
//        Lamp aaa = new Lamp("aaa",12,"aaa",1000);
//        Lamp abb = new Lamp("abb",75,"abb",1000);
//        bst.insert(abc);
//        bst.insert(are);
//        bst.insert(xss);
//        bst.insert(usd);
//        bst.insert(mnb);
//        bst.insert(aaa);
//        bst.insert(abb);
//        bst.remove(abc);
//        System.out.println("hola");
//    }
}
