import java.util.Scanner;

public class Loop_Task5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Add number which will be multiplied: ");
        int number = sc.nextInt();
        whileLoop(number);
    }
    public static void forLoop(int number){
        for (int i = 1; i <= 10 ; i++) {
            System.out.println(number + " x " + i + " = " + i * number);
        }
    }
    public static void whileLoop(int number){
        int i = 1;
        while (i <= 10){
            System.out.println(number + " x " + i + " = " + i * number);
            i++;
        }
    }
}
