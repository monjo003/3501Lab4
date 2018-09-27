import java.util.Scanner;
import java.util.Arrays;

public class Main {

    // TODO Return possible bin outputs
    // TODO Create approximate algorithm for bins

    // Main
    public static void main(String[] args) {

        // Declare size of elements in order to get bin capacity 'B'
        Scanner sc = new Scanner (System.in);

        System.out.println("What is the bin capacity? Ex. 20");
        int binCapacity = sc.nextInt();
        System.out.println("How many elements? Ex. 5");
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
        // Output list of unpacked items
        System.out.println("This is the remainder: " + Arrays.toString(remainder));
        // Output amount of unused space - Didn't get to this
        // Would need to be using array list

        /*
        // Below is an example of optimal - Would need 3 elements all being 1's with a bin capacity of 1
        binCapacity = 1;
        elements[0] = 1;
        elements[1] = 1;
        elements[2] = 1;

        remainder = new int[elements.length];
        int[] optimal1 = new int[elements.length];
        int[] optimal2 = new int[elements.length];
        int[] optimal3 = new int[elements.length];

        putInBins(optimal1, elements, binCapacity);
        putInBins(optimal2, elements, binCapacity);
        putInBins(optimal3, elements, binCapacity);
        putInBins(remainder, elements, remainderCapacity);

        // Output list of elements in each bin
        System.out.println("This is bin1: " + Arrays.toString(optimal1));
        System.out.println("This is bin2: " + Arrays.toString(optimal2));
        System.out.println("This is bin3: " + Arrays.toString(optimal3));
        // Output list of unpacked items
        System.out.println("This is the remainder: " + Arrays.toString(remainder));

        // Below is an example of nonoptimal
        binCapacity = 5;
        elements[0] = 3;
        elements[1] = 3;
        elements[2] = 3;

        remainder = new int[elements.length];
        int[] nonoptimal1 = new int[elements.length];
        int[] nonoptimal2 = new int[elements.length];
        int[] nonoptimal3 = new int[elements.length];

        putInBins(nonoptimal1, elements, binCapacity);
        putInBins(nonoptimal2, elements, binCapacity);
        putInBins(nonoptimal3, elements, binCapacity);
        putInBins(remainder, elements, remainderCapacity);

        // Output list of elements in each bin
        System.out.println("This is bin1: " + Arrays.toString(nonoptimal1));
        System.out.println("This is bin2: " + Arrays.toString(nonoptimal2));
        System.out.println("This is bin3: " + Arrays.toString(nonoptimal3));
        // Output list of unpacked items
        System.out.println("This is the remainder: " + Arrays.toString(remainder));
        */
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


