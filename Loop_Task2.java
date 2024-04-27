public class Loop_Task2 {
    public static void main(String[] args) {
       whileLoop();
    }
    public static void forLoop(){
        int sum = 0;
        for (int i = 1; i <=10 ; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }
    public static void whileLoop(){
        int sum = 0;
        int i = 1;
        while (i <= 10){
            sum = sum + i;
            i++;
        }
        System.out.println(sum);
    }
}
