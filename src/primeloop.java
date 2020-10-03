public class primeloop {

    public static void main(String[] args) {


        int i, j, k;
        int n = 5;
        for (i = 0; i < n; i++) {
            k = 1;
            for (j = 0; j <= i; j++) {
                System.out.print(k);
                k++;
            }

            System.out.println();
        }
    }
}

