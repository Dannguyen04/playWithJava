package runtime;

public class Util {
    public static boolean isReversed(String str){
        String reverseStr = new StringBuilder(str).reverse().toString();
        if(str.equals(reverseStr)) return true;
        return false;
    }
}
