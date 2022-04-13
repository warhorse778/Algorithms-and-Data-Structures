public class wrapperr {
    private static void changeInteger(Wrapper x) {
        x = Wrapper.valueOf(5);
    }

    public static void main(String[] args) {
        Wrapper x = Wrapper.valueOf(2);
        changeInteger(x);
        System.out.println(x);
    }
}

class Wrapper {
    int n;
    public Wrapper(int k) { n = k; }
    public String toString() { return ""+n;}
    public static Wrapper valueOf(int k) { return new Wrapper(k); }
}