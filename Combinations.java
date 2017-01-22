public class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result= new ArrayList<List<Integer>>();
        List<Integer> list= new ArrayList<Integer>();
        
        dfs(result,list,1,n,k);
        
        return result;
    }
    
    public void dfs(List<List<Integer>> result, List<Integer> list, int start, int n, int k){
        
        if(list.size()==k){
            result.add(new ArrayList<Integer>(list));
            return;
        }
        
        for(int i=start;i<=n;i++){
            list.add(i);
            dfs(result,list,i+1,n,k);
            list.remove(list.size()-1);
        }
    }
}