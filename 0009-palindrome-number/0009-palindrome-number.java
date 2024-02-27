class Solution {
    public boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        StringBuffer sb=new StringBuffer(s);
        String s1=sb.reverse().toString();
        if(s1.equals(s))
        return true;
        else
        return false;
    }
}
