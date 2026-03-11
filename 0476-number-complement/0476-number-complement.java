class Solution {
    public int findComplement(int num) {
        if(num==0)
        return 1;
        int mask = (1 << (32 - Integer.numberOfLeadingZeros(num))) - 1;
        return num^mask;
    }
}