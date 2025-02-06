public class Solution {
    // DO NOT MODIFY THE LIST. IT IS READ ONLY
    public ArrayList<Integer> spiralOrder(final List<ArrayList<Integer>> A) {
        
        ArrayList<Integer> B = new ArrayList<Integer>();
        int M = A.size();         
        int N = A.get(0).size(); 
        int t=0,b=M-1,l=0,r=N-1;
        while(t<=b && l<=r){
            for(int j=l;j<=r;j++){
                B.add(A.get(t).get(j));
            }
            t++;
            
            for(int i=t;i<=b;i++){
                B.add(A.get(i).get(r));
            }
            r--;
            if(t<=b){
                for(int j=r;j>=l;j--){
                   B.add(A.get(b).get(j)); 
                }
                b--;
            }
            
            if (l <= r) {
                for (int i = b; i >= t; i--) {
                    B.add(A.get(i).get(l));
                }
                l++;
            }
        }
        return B;
    }
}
