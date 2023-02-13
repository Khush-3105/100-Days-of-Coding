class Solution {
    public int countOdds(int low, int high) {
        int N = (high - low) / 2;
        if (high % 2 != 0 || low % 2 != 0)N++;
        return N;
    }
}