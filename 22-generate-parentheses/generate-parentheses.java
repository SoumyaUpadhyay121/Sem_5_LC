class Solution {
    public List<String> generateParenthesis(int n) {
        List <String> ll=new ArrayList<>();
        generate(n,0,0,"",ll);
        return ll;

    }

    
    public static void generate(int n,int close,int open,String ans,List <String> ll) {
		if(open==n && close==n) {
			ll.add(ans);
			return ;
		}
		if(open>n || close>open) {
			return ;
		}
		
		
		generate(n,close,open+1,ans+"(",ll);
		generate(n,close+1,open,ans+")",ll);
	}

}