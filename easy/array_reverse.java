import java.util.Arrays;

public class array_reverse {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9};
        int[] reverseArr = reverse(arr);
        System.out.println("배열 뒤집기:"+Arrays.toString(reverseArr));
    }

    public static int[] reverse(int[] arr) {
        Arrays.sort(arr);
        int[] newArr = new int[arr.length];
        for (int i=0; i<arr.length; i++) {
            newArr[newArr.length-1-i] = arr[i];
        }
        return newArr;
    }

}
