public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int num = 0;
        int mask = 1;
        for(int i = 0; i < 32; i++){
            if((mask & n) != 0){
                num++;
            }
            n = n>>1;
        }
        return num;
    }
}