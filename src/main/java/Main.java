import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args ){
        Scanner input = new Scanner(System.in);

        System.out.println("Please enter your name");
        String name = input.next();

        if(name.equals("Alice") || name.equals("Bob")){
            System.out.println(name
            );
        }
    }
}
