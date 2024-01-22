class Solution {
    public boolean isPalindrome(String s) {
        s=s.replaceAll("[^A-Za-z0-9]","").toLowerCase();
        String nstr = "";
        char ch;
        //reverse string
        for (int i=0; i<s.length(); i++) {
        ch= s.charAt(i); //extracts each character
        nstr= ch+nstr; //adds each character in front of the existing string
        }
       if (s.equals(nstr)){
          return true;
      }
      return false;
    }
}