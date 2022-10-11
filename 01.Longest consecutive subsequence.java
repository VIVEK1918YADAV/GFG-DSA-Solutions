class Solution
{   
    // arr[] : the input array
    // N : size of the array arr[]
    
    //Function to return length of longest subsequence of consecutive integers.
	static int findLongestConseqSubseq(int arr[], int N)
	{
	   // add your code here
	   HashSet<Integer> hs = new HashSet<>();
	   int min  = Integer.MAX_VALUE;
	   int max = Integer.MIN_VALUE;
	   for(int i=0; i<N; i++){
	       min = Math.min(min, arr[i]);
	       max = Math.max(max, arr[i]);
	       hs.add(arr[i]);
	   }
	   int cnt = 0;
	   int res = 0;
	   for(int i=min; i<=max; i++){
	       if(hs.contains(i)){
	           cnt++;
	       }
	       else{
	           cnt = 0;
	       }
	       res = Math.max(res, cnt);
	   }
	   return res;
	}
}
