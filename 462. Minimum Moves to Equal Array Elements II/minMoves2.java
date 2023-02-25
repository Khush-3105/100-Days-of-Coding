class Solution {
    public static int findMedian(int a[], int n)
    {
        // First we sort the array
        Arrays.sort(a);
  
        // check for even case
        if (n % 2 != 0)
            return (int)a[n / 2];
  
        return (int)(a[(n - 1) / 2] + a[n / 2]) / 2;
    }
    public int minMoves2(int[] a) {
        int count=0,median; 
        
        median = findMedian(a,a.length);
        
        for(int i = 0 ; i<a.length;i++){
            if (a[i] > median)
                count += a[i]-median;
            else
                count += median-a[i];
        }
        return(count);

    }
}