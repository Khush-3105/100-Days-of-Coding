class Solution {
    public String convert(String s, int numRows) {
        if(numRows==1)return s;
        String res="";
        for (int r=0 ; r<numRows;r++){
            int incre = (numRows-1)*2;
            for (int i=r ; i<s.length(); i+=incre ){
                res += s.charAt(i);
                if(r>0 && r<numRows-1 && (i+incre-(2*r))<s.length()){
                    res+=s.charAt(i+incre-(2*r));
                }
            }

        }
        return res;

    }
}