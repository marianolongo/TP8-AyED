import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BinarySearchTree<Lamp> lampTree = new BinarySearchTree<>();
        while (true) {
            System.out.println("Press 1 to add a lamp" + "\n" + "Press 2 to remove " + "\n" +"Press 3 to modify a lamp" + "\n" + "Press 4 to exit");
            String line = bufferedReader.readLine();

            if (line.equals("1")) {
                System.out.println("Enter a LAMPCODE for the lamp: ");
                String lampCode = bufferedReader.readLine();
                System.out.println("Enter the amount of WATTS of the lamp: ");
                int watts = bufferedReader.read();
                System.out.println("Enter the LAMPTYPE for the lamp: ");
                String lampType = bufferedReader.readLine();
                System.out.println("Enter the QUANTITY of the lamp: ");
                int quantity = bufferedReader.read();
                lampTree.insert(new Lamp(lampCode, watts,lampType,quantity));
            }
            else if (line.equals("2")) {
                System.out.println();
            }
            else if (line.equals("3")){
                System.exit(0);
            }
            else{
                System.out.println("Try again");
            }
        }
    }
}
