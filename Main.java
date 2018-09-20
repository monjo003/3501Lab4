import java.util.Arrays;

public class Main {

    // TODO Put elements into bins of a fixed size - B
    // TODO Return possible bin outputs
    // TODO Create approximate algorithm for bins

    // Main
    public static void main(String[] args) {
        int[] elements = {12, 4, 8, 15, 9, 3, 1, 10};
        int binCapacity = 20;

        // Put elements into bins
        putInBins(elements, binCapacity);
        // Output list of elements in each bin
        System.out.println(Arrays.toString(elements));
        // Output list of unpacked items
        // Output amount of unused space
    }

    // Method for puting elements of a given array into 3 separate bins
    public static void putInBins(int[] elements, int binCapacity){
        int bin1[] = new int [elements.length];
        int bin2[] = new int [elements.length];
        int bin3[] = new int [elements.length];

        // Put elements into bin until we hit 20 or as close as possible
        while (binSum(bin1, bin1.length) <= binCapacity){
            for (int i = 0; i < elements.length; i++){
                elements[i] = bin1[i];
                // Remove used elements from array of elements
                //elements[i] = 0;
            }
        }
        // Put elements into bin until we hit 20 or as close as possible
        while (binSum(bin2, bin2.length) <= binCapacity){
            for (int i = 0; i < elements.length; i++){
                elements[i] = bin2[i];
                // Remove used elements from array of elements
                //elements[i] = 0;
            }
        }
        // Put elements into bin until we hit 20 or as close as possible
        while (binSum(bin3, bin3.length) <= binCapacity){
            for (int i = 0; i < elements.length; i++){
                elements[i] = bin3[i];
                // Remove used elements from array of elements
                //elements[i] = 0;
            }
        }
    }

    // Find the sum of elements in a bin - used to not overfill bin
    public static int binSum(int arr[], int n){
        int sum = 0;

        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        return sum;
    }

    // Approximate the different possible bin combos
    public static void approximate(){

    }
}


