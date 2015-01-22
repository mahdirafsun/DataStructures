package sorting;


public class SelectionSort {

    public static void main(String[]args){


        int[] array = {5, 3, 7, 1, 4, 6, 2};
            int index, tmp;

        for ( int i = 0; i < array.length; i++){
            index = i;
            for(int j = i+1; j < array.length; j++){
                if (array[index] > array[j]){
                    tmp = array[j];
                    array[j] = array[index];
                    array[index] = tmp;
                }

            }
        }

        for (int n = 0; n<array.length; n++){
            System.out.println(array[n]);
        }
    }



}


