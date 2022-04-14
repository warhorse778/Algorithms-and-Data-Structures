import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class FirstArray {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);

        DynamicArray dynamicArray = new DynamicArray(5);


        String end = "null";
        while (!end.equals("end")) {
            System.out.println("Array: " + dynamicArray);
            TimeUnit.SECONDS.sleep(1);
            System.out.println("What do you want to do now?");
            end = sc.nextLine();

            switch (end) {
                case "add":
                    System.out.println("add What?");
                    String todo2 = sc.nextLine();
                    switch (todo2) {
                        case "a":
                            dynamicArray.add("A");
                            break;
                        case "b":
                            dynamicArray.add("B");
                            break;
                        case "c":
                            dynamicArray.add("C");
                            break;
                        case "d":
                            dynamicArray.add("D");
                            break;
                        case "e":
                            dynamicArray.add("E");
                            break;
                        case "f":
                            dynamicArray.add("F");
                            break;
                        case "g":
                            dynamicArray.add("G");
                            break;
                        case "1":
                            dynamicArray.add("1");
                            break;
                        case "2":
                            dynamicArray.add("2");
                            break;
                        case "3":
                            dynamicArray.add("3");
                            break;
                        case "4":
                            dynamicArray.add("4");
                            break;
                        case "5":
                            dynamicArray.add("5");
                            break;


                    }
                    break;
                case "showArray":
                    System.out.println(dynamicArray);
                    break;


            }
        }
    }


   /* public int DynamicArray(int[] array, int i ){

        for ( i = 1;i <= array.length / 2; i++) {
            int x = array[i-1];
            array[i-1] = array[array.length - i];
            array[array.length - i] = x;
        }
        return array[i];*/
    }



 class DynamicArray {
    int size;
    int capacity = 10;
    Object[] array;

    public DynamicArray() {
        this.array = new Object[capacity];
    }
    public DynamicArray(int capacity) {
        this.capacity = capacity;
        this.array = new Object[capacity];
    }
    public void add(Object data){
        if(size >= capacity){
            grow();
        }
        array[size] = data;
        size++;
    }
    public void insert(int index, Object data){

        if(size >= capacity){
            grow();
        }
        for(int i = size; i > index; i--){
            array[i] = array[i - 1];
        }
        array[index] = data;
        size++;
    }
    public void delete(Object data){
        for(int i= 0;i < size; i++){
            if(array[i] == data){
                for(int j = 0; j < (size - i - 1); j++){
                    array[i+j] = array[i + j + 1];
                }
                array[size - 1] = null;
                size--;
                if(size <= (capacity / 3)){
                    shrink();
                }
                break;
            }
        }
    }
    public int search(Object data){
        for(int i = 0; i < size; i++){
            if(array[i] == data){
                return i;
            }
        }
        return -1;
    }
    private void grow(){
        int newCapacity = (int) (capacity * 2);
        Object[] newArray = new Object[newCapacity];

        for(int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }
    private void shrink(){
        int newCapacity = (int) (capacity / 2);
        Object[] newArray = new Object[newCapacity];

        for(int i = 0; i < size; i++){
            newArray[i] = array[i];
        }
        capacity = newCapacity;
        array = newArray;
    }
    public boolean isEmpty(){
        return size == 0;
    }
    public String toString(){

        String string = "";

        for(int i = 0; i < capacity; i++) {
            string += array[i] + ", ";
        }
        if(string != ""){
            string = "[" + string.substring(0, string.length() - 2) + "]";
        } else {
            string = "[]";
        }
        return string;
    }
}
