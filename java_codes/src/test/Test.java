package test;

public class Test {
    public static int[] removeElement(int[] originalArray, int index) {
        if (originalArray == null || index < 0 || index >= originalArray.length) {
            return originalArray;
        }

        int[] newArray = new int[originalArray.length - 1];

        for (int i = 0, j = 0; i < originalArray.length; i++) {
            if (i == index) {
                continue;
            }
            newArray[j++] = originalArray[i];
        }

        return newArray;
    }
    
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5};
        int indexToRemove = 2;

        array = removeElement(array, indexToRemove);

        // Print the array after removing the element
        for (int i : array) {
            System.out.print(i + " ");
        }
    }
}

