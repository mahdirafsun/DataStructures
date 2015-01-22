package sorting;


public class Use_Sorting {

    // logic to sort the elements
    public static void main(String[] args) {

        int[] array = {17, 10, 3, 5, 9, 1, 11, 4};
        int temp, index;
        for (int i = 0; i < array.length - 1; i++) {
            index = i;
            for (int j = i - 1; j >= 0; j--) {
                if (array[j] > array[index]) {
                    temp = array[j];
                    array[j] = array[index];
                    array[index] = temp;
                }
                index --;
            }

        }
        for (int n=1; n<array.length; n++ ){
            System.out.println(n);
        }
    }
}