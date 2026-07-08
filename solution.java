class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int q = queries.length;
        for(int i = 0;i < q;i++)
        {
            int idx = queries[i][0];
            while(idx <= queries[i][1])
            {
                nums[idx] = (nums[idx]*queries[i][3])%1000000007;
                idx += queries[i][2];
            }
        }
        int out=0;
        for(int n:nums)
        {
			System.out.print(n+" ");
            out^=n;
        }
        return out;
    }
	public static void main(String []args)
	{
		int nu[]={780};
		int que[][]={{0,0,1,13},{0,0,1,17},{0,0,1,9},{0,0,1,18},{0,0,1,16},{0,0,1,6},{0,0,1,4},{0,0,1,11},{0,0,1,7},{0,0,1,18},{0,0,1,8},{0,0,1,15},{0,0,1,12}};
		Solution ob = new Solution();
		System.out.println(ob.xorAfterQueries(nu,que));
	}
}