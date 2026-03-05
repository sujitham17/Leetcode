class Solution {
    public int minOperations(String s) {
        return Math.min(compute(s,0),compute(s,1));
    }
    public int compute(String s,int need){
        int ops=0;
        for(char c:s.toCharArray()){
            int b=c-'0';
            if((b^need)!=0)
            ops++;
            need=need^1;
        }
        return ops;
    }
}