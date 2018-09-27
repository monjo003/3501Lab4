import java.util.Scanner;
import java.util.Arrays;

public class Main {

    // TODO Return possible bin outputs
    // TODO Create approximate algorithm for bins

    // Main
    public static void main(String[] args) {

        // Declare size of elements in order to get bin capacity 'B'
        Scanner sc = new Scanner (System.in);

        // Optimal would be bin capacity = size of an element with only one element
        System.out.println("What is the bin capacity?");
        int binCapacity = sc.nextInt();
        System.out.println("How many elements?");
        int[] elements = new int[sc.nextInt()];
        System.out.println("Enter size of each element. Please give " + elements.length + " elements.");
        for (int i = 0; i < elements.length; i++){
            elements[i] = sc.nextInt();
        }
        int remainderCapacity = 10000;
        int[] remainder = new int[elements.length];
        int[] bin1 = new int[elements.length];
        int[] bin2 = new int[elements.length];
        int[] bin3 = new int[elements.length];

        // Put elements into bins
        putInBins(bin1, elements, binCapacity);
        putInBins(bin2, elements, binCapacity);
        putInBins(bin3, elements, binCapacity);
        putInBins(remainder, elements, remainderCapacity);

        // Output list of elements in each bin
        System.out.println("This is bin1: " + Arrays.toString(bin1));
        System.out.println("This is bin2: " + Arrays.toString(bin2));
        System.out.println("This is bin3: " + Arrays.toString(bin3));
        System.out.println("This is the remainder: " + Arrays.toString(remainder));
        // Output list of unpacked items
        // Output amount of unused space
    }

    // Method for putting elements of a given array into 3 separate bins
    public static void putInBins(int[] bin, int[] elements, int binCapacity){

        // Put elements into bin until we hit 20 or as close as possible
        int j = 0;

        for (int i = 0; i < elements.length; i++) {
            if (binSum(bin, bin.length) <= binCapacity && elements[i]+binSum(bin, bin.length) <= binCapacity){
                bin[j] = elements[i];
                j++;
                elements[i]=0;
            }
        }
    }

    // Find the sum of elements in a bin - used to not overfill bin - This works!
    public static int binSum(int arr[], int n){
        int sum = 0;

        for(int i = 0; i < n; i++){
            sum += arr[i];
        }
        return sum;
    }
}


