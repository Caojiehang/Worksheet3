public class CSExercise2 {

    public static void main(String[] args) {


    }

    public static double sumSqrt(double[] a) {
        int k = a.length;
        double sum = 0;
        for(int i =0; i<a.length;i++) {
            sum = sum+Math.sqrt(a[i]);

        }
        return sum;
    }
}
