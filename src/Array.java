import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array {

    private static void addElement(Integer[] arr, int element, int position)
    {
        // Converting array to ArrayList
        List<Integer> list = new ArrayList<>(Arrays.asList(arr));

        // Printing the original array
        System.out.println("\nInitial Array:\n" + Arrays.toString(arr));

        // Adding the element at position
        list.add(position - 1, element);

        // Converting the list back to array
        arr = list.toArray(arr);

        // Printing the updated array
        System.out.println("\nArray with " + element
                + " inserted at position "
                + position + ":\n"
                + Arrays.toString(arr));
    }

    // Drivers Method
    public static void main(String[] args)
    {
        // Sample array
        Integer[] arr = { 5, 0, 9, 8 };

        // Element to be inserted
        int element = 12;

        // Position to insert
        int position1 = 5;
        int position2 = 1;

        // Calling the function to insert
        addElement(arr, element, position1);
        addElement(arr, element, position2);
    }
}