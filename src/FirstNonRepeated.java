import java.util.HashMap;

/**
 * Created by Anil_Kulkarni on 2/9/2017.
 */
public class FirstNonRepeated {
    public static void main(String[] args) {
        String s;
        s = "Krkishna";
        char c = firstNonRepeatedCharacter(s.toLowerCase());
        System.out.println("Character is: "+c);
    }

    public static Character firstNonRepeatedCharacter(String s) {
        HashMap<Character, Integer> characterhashtable = new HashMap<Character, Integer>();
        int i, length;
        Character c;
        length = s.length();
        for (i = 0; i < length; i++) {
            c = s.charAt(i);
            if (characterhashtable.containsKey(c)) {
                //increment
                characterhashtable.put(c, characterhashtable.get(c) + 1);
            } else {
                characterhashtable.put(c, 1);
            }
        }
        for (i = 0; i < length; i++) {
            c = s.charAt(i);
            if (characterhashtable.get(c) == 1) {
                return c;
            }
        }
        return null;
    }
}

