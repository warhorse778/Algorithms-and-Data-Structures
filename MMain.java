public class MMain {
    public static void main(String[] args) {
        DynamicArray dynamicArray = new DynamicArray(4);

       dynamicArray.add("A");
       dynamicArray.add("B");
       dynamicArray.add("C");
       dynamicArray.add("D");

       dynamicArray.insert(0,"X");
        System.out.println(dynamicArray.search("C"));

        System.out.println(dynamicArray);
        System.out.println("empty: " + dynamicArray.isEmpty());
        System.out.println("size: " + dynamicArray.size);
        System.out.println("capacity: " + dynamicArray.capacity);
    }
}
