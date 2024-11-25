class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        helper("",n,n,ans);
        return ans;
    }
    void helper(String s,int left,int right,List<String> ans){
        if(left ==0 && right==0){
            ans.add(s);
            return;
        }
        if(left>0)helper(s+"(",left - 1,right,ans);
        if(right>left)helper(s+")",left,right - 1,ans);
    }
}