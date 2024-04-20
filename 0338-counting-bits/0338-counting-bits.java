class Solution {
    public int[] countBits(int n) {
        // for even C(n*2) = C(n)
        // for odd  C(n*2+1) = C(n)+1
        
        int sol []= new int [n+1];
        sol[0]=0;
        
        for(int i=1;i<=n;i++){
            if(i%2==0){
                sol[i]=sol[i/2];
            }else{
                sol[i]=sol[i/2]+1;
            }
            
        }
        return sol;
        
    }
}