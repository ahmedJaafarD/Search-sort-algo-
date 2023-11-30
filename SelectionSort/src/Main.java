import java.util.Arrays;


public class Main {

    // this code run and test the selection sort algo
    public static void selectionSort(int[] array){

        for(int i= 0 ; i < array.length ; i++){
            int minIndex= i;
            for(int j = i; j < array.length; j++){

                if(array[j] < array[minIndex]){
                    minIndex = j;
                }

            }

            int temp = array[i];
            array[i]= array[minIndex];
            array[minIndex]=temp;
        }
    }


    public static void main(String[] args) {

        int[] myArray = {4,2,6,5,1,3};

        selectionSort(myArray);

        System.out.println( Arrays.toString(myArray) );

        /*
            EXPECTED OUTPUT:
            ----------------
            [1, 2, 3, 4, 5, 6]

         */

    }

}