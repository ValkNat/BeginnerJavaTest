//Imports
import java.util.Scanner;


public class App {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter first number: ");
        int first_num = input.nextInt();
        System.out.println("Please enter second number: ");
        int second_num = input.nextInt();
        System.out.println("Add, Subtract, Divide, or Multiply?");
        String operation = input.next();

        if (operation.equals("add")) {
            System.out.println(first_num + second_num);
        }
        else if (operation.equals("subtract")) {
            System.out.println(first_num - second_num);
        }
        else if (operation.equals("divide")) {
            System.out.println(first_num / second_num);
        }
        else if (operation.equals("multiply")) {
            System.out.println(first_num * second_num);
        }
        else {
            System.out.println("Invalid operation");
        }

    }

}


    

