public class Lab6s1 {
    public static void main(String[] args){
        int [] arr = new int [20];
        for (int i=0; i<arr.length; i++ ){
            arr[i] = 1000 + i;
        }
        int [] testArray = makeItBigger(arr, 42);
        for( int i = 0; i<testArray.length; i++){
            System.out.println(testArray[i]);
        }

    }
    public static int[] makeItBigger(int[] oldArray, int newSize){
        int [] tempArray = new int[newSize];
        for(int i = 0; i < oldArray.length; i++){
            tempArray[i] = oldArray[i];
        }
        return tempArray;
    }
}
