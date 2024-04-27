public class Array_Task5 {
    public static void main(String[] args) {
        int array[] = {10, 20, 30, 40, 50};
        int num = 30;
        for (int i = 0; i < array.length; i++) {
            if (num == array[i]){
                System.out.println("Index of " + num + " is " + i);
                break;
            }
        }
    }
}
