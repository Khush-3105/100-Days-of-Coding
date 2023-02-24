class Solution {
    public int minimumDeviation(int[] nums) {
    if(nums==null || nums.length==0) return 0;
    TreeSet<Integer> set=new TreeSet<>();
    for(int i:nums){
        if( (i & 1) == 1){
            i = i << 1;
        }
        set.add(i);
    }
    int min=set.last()-set.first();
    int max=set.last();
    while((max & 1) ==0){
        set.remove(max);
        max = max>>1;
        set.add(max);
        max=set.last();
        int i=set.last()-set.first();
        if(i<min) min=i;
    }
    return min;
}
}