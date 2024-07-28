public class Solution {
    public void reverseString(char[] s) {
        int left = 0, right = s.length - 1;
        recursion(left, right ,s );
    }
     
    private void recursion(int left, int right , char[] s) {
        if (s == null || left >= s.length / 2) return;
        char c = s[right];
        s[right] = s[left];
        s[left] = c;
        recursion(left + 1, right -1 , s); 
        
    }   
}