import java.util.Scanner;

public class Loop_Task3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add number which of you want to find factorial");
        int number = sc.nextInt();
        whileLoop(number);
    }
    public static void forLoop(int number){
        int multiply = 1;
        for (int i = 1; i <= number; i++) {
            multiply = i * multiply;
        }
        System.out.println("Factorial of " + number + " equals " + multiply);
    }
    public static void whileLoop(int number){
        int multiply = 1;
        int i = 1;
        while (i <= number){
            multiply = i * multiply;
            i++;
        }
        System.out.println("Factorial of " + number + " equals " + multiply);
    }
}
