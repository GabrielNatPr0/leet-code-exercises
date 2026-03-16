public class IsPalindrome {
    private static boolean checkPalindrome(String num){
        int left = 0;
        int right = num.length() - 1;
        while (left < right){
            if(num.charAt(left) != num.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static boolean isPalindrome(int x){
        if(x < 0){
            return false;
        }
        String num = x + "";
        return checkPalindrome(num);
    }

//    public static void main(String[] args) {
//        int input = 121;
//        if (isPalindrome(input)){
//            System.out.println("\"" + input + "\" is a palindrome.");
//        } else {
//            System.out.println("\"" + input + "\" is not a palindrome.");
//        }
//    }
}
