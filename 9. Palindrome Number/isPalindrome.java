class Solution {
    public boolean isPalindrome(int x) {
        if (x<0) return false;
        int a=x;
        int rev = 0;
        while (x!=0){
            int temp = x%10;
            rev=rev*10+temp;
            x=x/10;
        }
        if(a==rev)return true;
        else return false;
        
    }
}