import java.util.Scanner;

public class inputData {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Your name:");
        String name = in.nextLine();
        System.out.print("Enter Your age:");
        int age = in.nextInt();
        in.close();
        System.out.println("Your name is" + name);
        System.out.println("You are " + age + "year old");
    }
}
