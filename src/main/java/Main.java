import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){

        Scanner in = new Scanner(System.in);
        String name;

        System.out.print("Enter name: ");
        name = in.nextLine();

        if ("Alice".equalsIgnoreCase(name) || "Bob".equalsIgnoreCase(name)){
            System.out.println("Hello " + name);
        }

    }

}
