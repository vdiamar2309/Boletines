package Arrays;

public class Burbuja {
    public static void main(String[] args) {

        int[] array= new int [9];
        for (int i = 0; i < 9; i++){
           int random = (int) (Math.random()*100);
            array [i]=random;
        }

        int length = array.length;

        for (int i = 0; i < array.length; i++) {
            for (int o = 0; o < length; o++) {
                if (array[i] > array[o]) {
                    int a = array[i];
                    int b = array[o];
                    array[i] = b;
                    array[o] = a;

                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
}
