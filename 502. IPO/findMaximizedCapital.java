class Solution {
    public int findMaximizedCapital(int k, int w, int[] profits, int[] capital) {
        PriorityQueue<int[]> pqCap = new PriorityQueue<>((a, b) -> (a[0] - b[0]));
        PriorityQueue<int[]> pqPro = new PriorityQueue<>((a, b) -> (b[1] - a[1]));
        for (int i = 0; i < profits.length; i++) {
            pqCap.add(new int[] {capital[i], profits[i]});
        }
        for (int i = 0; i < k; i++) {
            while (pqCap.size() > 0 && pqCap.peek()[0] <= w) {
                pqPro.offer(pqCap.poll());
            }
            if (pqPro.size() > 0) {
                w += pqPro.poll()[1];
            }
        }
        return w;
    }
}