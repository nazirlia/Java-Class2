import java.util.Arrays;

public class Array_Task6 {
    public static void main(String[] args) {
        int array[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 200 ,201};
        int[] newArray = {0,1};
        for (int i = 0, j = 0; i < array.length; i++) {
            if (array[i] % 2 != 0){
                newArray[j++] = array[i];
            }
        }
        System.out.println(Arrays.toString(newArray));
    }
}
