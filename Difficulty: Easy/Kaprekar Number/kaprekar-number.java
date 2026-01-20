// User function Template for Java

class Solution {
    int isKaprekar(int n) {
        // code here
        int square =(int) Math.pow(n, 2);
        String str = String.valueOf(square);
        int l = String.valueOf(square).length();
        int j = 10;
        while( l-1 != 0) {
            int a = square % j;
            int b = square / j;
            l--;   
            if (a == 0 || b == 0) continue;
            if (a+b == n) return 1; 
            j = j * 10;
        }
        
        return 0;
    }
}