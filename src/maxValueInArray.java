import java.util.Arrays;

/**
 * Created by Anil_Kulkarni on 2/10/2017.
 */
public class maxValueInArray {

    public static void main(String[] args) {
        int[] numbers={120,200,20,45,678,567};
        int i, max;
        max=0;
        int maximum= Arrays.stream(numbers).max().getAsInt();
        System.out.println("Maximum is : "+maximum);
        for(i=0;i<numbers.length;i++){
            if(numbers[i]>max){
                max=numbers[i];
            }
        }
        System.out.println("The highest number is: "+max);
    }

}
