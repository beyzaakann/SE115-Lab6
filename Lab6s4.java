import java.util.Random;

public class Lab6s4 {
    public static void main(String[] args){
        Random random = new Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100) + 1;
        }
        System.out.print("Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        int peakCount = 0;
        int tallestPeak = 0;

        System.out.print("Peak values: ");
        for (int i = 1; i < arr.length - 1; i++) {
            if (arr[i] > arr[i - 1] && arr[i] > arr[i + 1]) {
                System.out.print(arr[i] + " ");
                peakCount++;
                if (arr[i] > tallestPeak) {
                    tallestPeak = arr[i];
                }
            }
        }

        System.out.println();
        System.out.println("Total number of peaks: " + peakCount);
        System.out.println("Tallest peak: " + tallestPeak);
    }

}
