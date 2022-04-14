public class firmazad {
    public static void main(String[] args) {

        int c = 10;
        int[] arr={c};
        for (int i = 0; i < c; i++) {
            arr[i] = i*i;
        }
        int k=1;
        int sum=0;
        if(k < 10){

        }
        if(k++ < 5){
            sum+=arr[k];
        }
        System.out.println(sum);
    }

}
