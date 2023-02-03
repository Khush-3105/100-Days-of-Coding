class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] map = new int[26];
        int seq=0;
        for(char ch: order.toCharArray()){
            map[ch-'a']=seq++;
        }

        for(int i = 0; i < words.length-1;i++){
            String current = words[i];
            String next = words[i+1];
            int len = Math.min(current.length(),next.length());
            if (len!=current.length() && len==next.length() && current.startsWith(next)){
                return false;
            }
            for(int l =0 ; l<len; l++){
                
                if (map[current.charAt(l)-'a'] > map[next.charAt(l)-'a']){
                    return false;
                }
                if (map[current.charAt(l)-'a'] < map[next.charAt(l)-'a']){
                    break;
                }
            }
        }
        return true;
    }
}
