public class RecursionLevelThree {
    public static void main(String[] args) {
        System.out.println(power(2,8));
    }

    private static int power(int base, int exponent) {
        if(exponent < 1) return 1;
        return base * power(base, exponent - 1);
    }
}
