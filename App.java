import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner kb = new Scanner(System.in);
        Calculator cl = new Calculator();
        System.out.println("Please Enter the First Number");
        float no1 = kb.nextFloat();
        System.out.println("Please Enter the Second Number");
        float no2 = kb.nextFloat();
        
        System.out.println("Enter the number of operation");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");
        System.out.println("5: Remainder");
        System.out.println("6: Exit");

        int choice = kb.nextInt();
        
        switch (choice){
            case 1: System.out.println("The addition of two numbers is "+cl.addition(no1, no2));
                    break;
            case 2: System.out.println("The subtraction of two numbers is "+cl.subtraction(no1, no2));
                    break;    
            case 3: System.out.println("The multiplication of two numbers is "+cl.multiplication(no1, no2));
                    break;
            case 4: System.out.println("The division of two numbers is "+cl.division(no1, no2));
                    break;
            case 5: System.out.println("The remainder of the division is "+cl.remainder(no1, no2));
                    break;
            case 6: kb.close();
                    System.exit(0);
        }

    }
}
