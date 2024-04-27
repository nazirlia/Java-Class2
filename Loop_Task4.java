import java.util.Scanner;

public class Loop_Task4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add first number: ");
        int number = sc.nextInt();
        System.out.println("Add number which will be power of first number");
        int power = sc.nextInt();
        whileLoop(number, power);
    }
    public static void forLoop(int number, int power){
        int result = 1;
        for (int i = 1; i <=power ; i++) {
            result = number * result;
        }
        System.out.println(power + " times power of " + number + " equals " + result);
    }
    public static void whileLoop(int number, int power){
        int result = 1;
        int i = 1;
        while (i <=power){
            result = number * result;
            i++;
        }
        System.out.println(power + " times power of " + number + " equals " + result);
    }
}
