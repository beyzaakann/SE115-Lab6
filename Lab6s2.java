import java.util.Random;

public class Lab6s2 {
    public static int[] function(int [] arr){
        int last = arr[arr.length-1];
        for(int i = arr.length - 1; i >0; i--){
            arr[i] = arr[i - 1];
        }
        arr[0]=last;
        return arr;
    }
    public static void main(String[] args){
        Random random = new Random();
        int size = random.nextInt(11) + 10;
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++){
            numbers[i] = random.nextInt(100);
        }
        System.out.print("Normal: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        function(numbers);

        System.out.print("\nRotated:  ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }

    }
}
