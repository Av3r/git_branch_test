import java.util.Scanner;

/**
 * Created by Damia on 18.06.2019.
 */
public class Main {
    Scanner scanner = new Scanner(System.in);

    public void createuser(){
        String name, lastname;
        Integer age;

        System.out.println("Type a name: ");
        name = scanner.next();

        System.out.println("Type a lastname: ");
        lastname = scanner.next();

        System.out.println("Type your age: ");
        age = scanner.nextInt();

        User user = new User(name, lastname, age);
        System.out.println("Create user: " + user.toString());
    }

    public static void main(String[] args) {

    }
}
