class Solution {
    long maxProduct(int[] arr, int n) {
        // code here
        long maxi = Integer.MIN_VALUE;
        long temp = 1;
        long l = 1;
        for(int i=0; i<n; i++){
           temp *= arr[i];
           l *= arr[n-i-1];
           maxi = Math.max(maxi, Math.max(temp, l));
           if(temp == 0) temp=1;
           if(l == 0) l=1;
        }
        return maxi;
    }
}
