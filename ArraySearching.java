public class ArraySearching {

    static int[] array = new int[10];
    static int size = 0;

    static void insert(int value) {
        if (size == array.length) {
            System.out.println("Array is full.");
            return;
        }

        array[size] = value;
        size++;

        System.out.println(value + " inserted.");
    }

    static void delete(int value) {
        int index = linearSearch(value);

        if (index == -1) {
            System.out.println(value + " not found.");
            return;
        }

        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        size--;

        System.out.println(value + " deleted.");
    }

    static int linearSearch(int value) {
        for (int i = 0; i < size; i++) {
            if (array[i] == value) {
                return i;
            }
        }

        return -1;
    }

    static int binarySearch(int value) {
        int left = 0;
        int right = size - 1;

        while (left <= right) {
            int middle = (left + right) / 2;

            if (array[middle] == value) {
                return middle;
            }

            if (array[middle] < value) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }

    static void display() {
        if (size == 0) {
            System.out.println("Array is empty.");
            return;
        }

        System.out.print("Array: ");

        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }

        System.out.println();
    }

    public static void main(String[] args) {

        System.out.println("ARRAY OPERATIONS");

        insert(10);
        insert(20);
        insert(30);
        insert(40);
        insert(50);

        display();

        System.out.println();

        System.out.println("LINEAR SEARCH");
        int result = linearSearch(30);

        if (result != -1) {
            System.out.println("30 found at index " + result);
        }

        System.out.println();

        System.out.println("BINARY SEARCH");
        result = binarySearch(40);

        if (result != -1) {
            System.out.println("40 found at index " + result);
        }

        System.out.println();

        System.out.println("DELETE");
        delete(30);

        display();
    }
}
