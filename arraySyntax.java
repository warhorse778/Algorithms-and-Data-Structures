import java.util.Arrays;
public class arraySyntax {

    public static void main(String[] args) {
        int [] array = {1, 2, 3, 4, 5, 6};
        System.out.println(Arrays.toString(array));

        int x = array[0];
        array[0] = array[array.length-1];
        array[array.length-1] = x;
        System.out.println("New array after swaping the first and last elements: "+Arrays.toString(array));

    }

}
