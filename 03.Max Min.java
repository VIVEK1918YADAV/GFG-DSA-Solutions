class Solution
{ 
    public static int findSum(int A[],int N) 
    {
        //Approach 1
        
        // Arrays.sort(A);
        // int sum = A[0] + A[A.length-1];
        // return sum;
        
        //Approach 2
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0; i<N; i++){
            if(A[i] > max)
            max = A[i];
            
            if(A[i] < min)
            min = A[i];
        }
        return max+min;
    }
}
