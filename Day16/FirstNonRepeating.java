
public class FirstNonRepeating {
    public static void main(String[] args) {
        String str = "aabbcde";

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            boolean repeated = false;

            for (int j = 0; j < str.length(); j++) {
                if (i != j && current == str.charAt(j)) {
                    repeated = true;
                    break;
                }
            }

            if (!repeated) {
                System.out.println("First non-repeating character: " + current);
                return;
            }
        }

        System.out.println("No non-repeating character found");
    }
}
