import java.util.Scanner;

class Pos_neg_alt{
	
    public static int[] arrange(int[] array) {
        int[] rearrangedArray = new int[array.length];
		
        int positiveCount = 0;
        int negativeCount = 0;

         for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }
        }
		
        if (positiveCount > array.length / 2 || negativeCount > array.length / 2) {
            System.out.println("Cannot rearrange");
            return array;
        } 

        int positiveIndex = 0;
        int negativeIndex = 1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] >= 0) {
                rearrangedArray[positiveIndex] = array[i];
                positiveIndex += 2;
            } else {
                rearrangedArray[negativeIndex] = array[i];
                negativeIndex += 2;
            }
        }

        return rearrangedArray;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
		
        int[] arr = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }
		
        int[] rearrangedArr = arrange(arr);

        System.out.println("Rearranged Array with Positive and negative alternatly:");
        for (int i = 0; i < rearrangedArr.length; i++) {
            System.out.print(rearrangedArr[i] + " ");
        }
    }
}
