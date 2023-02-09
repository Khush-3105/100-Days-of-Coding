class Solution {
    public long distinctNames(String[] ideas) {
        Set<String> [] suffix = new Set[26];
        for(int i =0; i<26; i++) suffix[i]=new HashSet<>();
        for(String idea : ideas) suffix[idea.charAt(0)-'a'].add(idea.substring(1));
        long pairs=0;
        for(int i=0; i<26; i++){
            for(int j = i+1; j<26;j++){
                int overlap=0;
                for(String s: suffix[i]){
                    if(suffix[j].contains(s)){
                        overlap++;
                    }
                }
                pairs+= (suffix[i].size()-overlap)*(suffix[j].size() - overlap)*2;
            }
        }
        return pairs;
    }
}