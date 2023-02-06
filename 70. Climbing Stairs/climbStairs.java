class Solution {
    public int climbStairs(int n) {
        int arr[]= new int[n+1];
        return rec(n,arr);
    }
    public static int rec(int n,int arr[]){
        if(n<=1)return 1;
        if(arr[n]>0)return arr[n];
        int a=rec(n-1,arr);
        int b=rec(n-2,arr);
        arr[n]=a+b;
        return a+b;

    }
}