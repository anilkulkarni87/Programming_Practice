import java.util.HashMap;

/**
 * Created by Anil_Kulkarni on 2/10/2017.
 */
public class findDuplicateInArray {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 3, 4, 5, 6, 6};
        int i, length;
        length = numbers.length;
        HashMap<Integer, Integer> integerhash = new HashMap<Integer, Integer>();
        int num;
        for (i = 0; i < length; i++) {
            num = numbers[i];
            if (integerhash.containsKey(num)) {
                integerhash.put(num, integerhash.get(num) + 1);
            } else {
                integerhash.put(num, 1);
            }

        }
        for(Integer val:integerhash.keySet()){
            //System.out.println("Key: "+val+" Value: "+integerhash.get(val));
            if(integerhash.get(val)>1){
                System.out.println("The duplicate values are: "+val);
            }
        }


    }
}
