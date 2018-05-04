import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BinarySearchTree<Lamp> lampTree = new BinarySearchTree<>();

        while (true) {
            System.out.println("Press 1 to add a lamp" + "\n" + "Press 2 to remove " +
                    "\n" +"Press 3 to modify a lamp" + "\n" + "Press 4 to show stock" + "\n" + "Press 5 to exit");
            String line = bufferedReader.readLine();

            if (line.equals("1")) {
                System.out.println("Enter a LAMPCODE for the lamp: ");
                String lampCode = bufferedReader.readLine();
                System.out.println("Enter the amount of WATTS of the lamp: ");
                int watts = Integer.parseInt(bufferedReader.readLine());
                System.out.println("Enter the LAMPTYPE for the lamp: ");
                String lampType = bufferedReader.readLine();
                System.out.println("Enter the QUANTITY of the lamp: ");
                int quantity = Integer.parseInt(bufferedReader.readLine());
                lampTree.insert(new Lamp(lampCode, watts,lampType,quantity));
            }
            else if (line.equals("2")) {
                System.out.println("Enter the LAMPCODE of the lamp to remove: ");
                String lampCode = bufferedReader.readLine();
                lampTree.remove(new Lamp(lampCode));
            }
            else if (line.equals("3")){
                System.out.println("Enter the LAMPCODE of the lamp you want to modify: ");
                String lampcode = bufferedReader.readLine();
                System.out.println("What do you want to modify?");
                System.out.println("a) Quantity" + "\n" + "b) Lamptype" + "\n" + "c) Watts");
                String line2 = bufferedReader.readLine();
                if(line2.equals("a")){
                    System.out.println("Enter the new QUANTITY for the selected lamp");
                    int newQuantity = Integer.parseInt(bufferedReader.readLine());
                    lampTree.search(new Lamp(lampcode)).setQuantity(newQuantity);
                }
                else if(line2.equals("b")){
                    System.out.println("Enter the new LAMPTYPE for the selected lamp");
                    String newLamptype = bufferedReader.readLine();
                    lampTree.search(new Lamp(lampcode)).setLampType(newLamptype);
                }
                else if(line2.equals("c")){
                    System.out.println("Enter the new WATTS for the selected lamp");
                    int newWatts = Integer.parseInt(bufferedReader.readLine());
                    lampTree.search(new Lamp(lampcode)).setWatts(newWatts);
                }
            }
            else if(line.equals("4")){
                lampTree.printInOrder();
            }
            else if(line.equals("5")){
                System.exit(0);
            }
            else{
                System.out.println("Try again");
            }
        }
    }
}
