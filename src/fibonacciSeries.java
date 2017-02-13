/**
 * Created by Anil_Kulkarni on 2/10/2017.
 */
public class fibonacciSeries {
    public static void main(String[] args) {
        int n=10;
        int first=0;
        int second=1;
        int nth=1;
        int i;
        System.out.println(first);
        System.out.println(second);
        for(i=2;i<n;i++){
            nth=first+second;
            first=second;
            second=nth;
            System.out.println(nth);
        }
    }
}
