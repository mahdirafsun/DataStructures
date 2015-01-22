package sorting;


public class BubbleSort {

    public static void main(String[] args) {


        int[] array = {5, 3, 7, 1, 4, 6, 2};
        int  tmp;

        for ( int i = 0; i < array.length-1; i++){

            for(int j = i; j < array.length-1; j++){
                if (array[i] > array[j + 1]){
                    tmp = array[j + 1];
                    array[j + 1] = array[i];
                    array[i] = tmp;
                }

            }
        }

        for (int n = 0; n<array.length; n++){
            System.out.println(array[n]);
        }

//        int[] array = {5, 3, 7, 1, 4, 6, 2};
//        int tmp;
//        for (int cursor = array.length-1; cursor >= 0; cursor--) {
//            for (int i = 0; i < array.length-1; i++) {
//                if (array[i] > array[i + 1]) {
//                    tmp = array[i];
//                    array[i] = array[i + 1];
//                    array[i + 1] = tmp;
//                }
//            }
//
//        }
//        for (int n = 0; n < array.length; n++) {
//            System.out.println(array[n]);
//
//        }
    }
}
