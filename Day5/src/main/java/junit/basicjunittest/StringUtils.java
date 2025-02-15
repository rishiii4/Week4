package junit.basicjunittest;

public class StringUtils {
    public String reverse(String str){
        String reverseStr = "";
        for(int i=str.length()-1;i>=0;i--){
            reverseStr += str.charAt(i);
        }
        return reverseStr;
    }
    public boolean isPalindrome(String str){
        for (int i = 0; i < str.length()/2; i++) {
            if(str.charAt(i) != str.charAt(str.length()-1-i)){
                return false;
            }
        }
        return true;
    }
    public String  toUpperCase(String str){
        String upperCase = "";
        for (int i = 0; i < str.length(); i++) {
            upperCase += str.toUpperCase().charAt(i);
        }
        return upperCase;
    }
}
