public class ReverseString {
    public static void main(String[] args) {
        String string = "jayant";
        String reverseString = "";
        for (int i = string.length() - 1 ; i >= 0 ; i--){
            reverseString += string.charAt(i);
        }
        System.out.println(reverseString);
    }
}
