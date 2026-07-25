class Solution {
    public boolean isPalindrome(int x) {
        StringBuilder sb = new StringBuilder(String.valueOf(x));
        sb.reverse();

      if(String.valueOf(x).equals(sb.toString())){
        return true;
        
      }
        return false;

    }
}