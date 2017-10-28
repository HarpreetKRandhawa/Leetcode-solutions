class Solution {
    private int lo, maxlen;
    
    public String longestPalindrome(String s) {
        int len = s.length();
        if(len<2)
            return s;
        for(int i=0; i<len; i++){
            helper(s,i,i);
            helper(s,i,i+1);
        }
        return s.substring(lo,lo+maxlen);
    }
    
    public void helper(String s, int j, int k){
        while(j>=0 && k<s.length() && s.charAt(j)==s.charAt(k)){
            j--;
            k++;
        }
        if(maxlen<k-j-1){
            lo = j+1;
            maxlen = k-j-1;
        }
    }
}
