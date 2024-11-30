


public class MyString {

    public static void main(String[] args) {
        // System.out.println("Testing lowercase:");
        // System.out.println("UnHappy : " + lowerCase("UnHappy"));
        // System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        // System.out.println("TLV : " + lowerCase("TLV"));
        // System.out.println("lowercase : " + lowerCase("lowercase"));

        // System.out.println("Testing contains:");
        // System.out.println(contains("unhappy", "happy")); // true
        // System.out.println(contains("happy", "unhappy")); // false
        // System.out.println(contains("historical", "story")); // false
        // System.out.println(contains("psychology", "psycho")); // true
        // System.out.println(contains("personality", "son")); // true
        // System.out.println(contains("personality", "dad")); // false
        // System.out.println(contains("resignation", "sign")); // true
        System.out.println(contains("baba yaga", "baba"));
        System.out.println(contains("baba yaga", ""));
        System.out.println(contains("baba yaga", "John Wick is the baba yaga"));
        System.out.println(contains("baba yaga", "Yaga"));
        System.out.println(contains("baba yaga", "babayaga"));
    }

    /**
     * Returns the lowercase version of the given string.
     */
    public static String lowerCase(String str) {
        int increaseChar = 32;
        StringBuilder sb = new StringBuilder(str.length());
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) < 91 && str.charAt(i) > 64) {
                char temp = str.charAt(i);
                char newChar = (char) (temp + increaseChar);
                sb.append(newChar);
            } else {
                sb.append(str.charAt(i));
            }

        }
        return sb.toString();
    }

    /**
     * If str1 contains str2, returns true; otherwise returns false.
     */
    public static boolean contains(String str1, String str2) {
        // str1 = str1.replace(" ", "");
        // str2 = str2.replace(" ", "");
        if (str1.length() < str2.length()) {
            return false;
        }
        else if (str2.isEmpty()) {
            return true;
        }
        else if(str1.isEmpty()){
            return false;
        }
        // str1 = lowerCase(str1);
        // str2 = lowerCase(str2);
        
        int j = 0;
        int counter =0;
        for (int i = 0; i < str1.length(); i++) {
                if (str1.charAt(i) == str2.charAt(j)) {
                    j++;
                    counter++;
                    if (counter == str2.length()) {
                        return true;
                    }
                } else {
                    
                    counter = 0;
                }
        }
        return false;
    }
}
