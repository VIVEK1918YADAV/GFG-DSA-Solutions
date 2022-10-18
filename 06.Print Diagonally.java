class Solution{
    static ArrayList<Integer> downwardDigonal(int N, int A[][])
    {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<N; i++){
            int cnt = 0;
            
            for(int j=i; j>=0; j--){
                res.add(A[cnt][j]);
                cnt++;
            }
        }
        
        for(int i=1; i<N; i++){
            int cnt = i;
            
            for(int j=N-1; j>=i; j--){
                res.add(A[cnt][j]);
                cnt++;
            }
        }
        return res;
    }
}
