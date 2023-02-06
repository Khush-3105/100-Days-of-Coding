class Solution {
    public int reverse(int x) {
        long result=0;
        int temp;
        while(x!=0){
            temp=x%10;
            result = (result * 10) + temp;
            x=x/10;
        }
        if (result >= Integer.MAX_VALUE || result <= Integer.MIN_VALUE) return 0;
        else{
            return (int)result;
        } 
    }
}