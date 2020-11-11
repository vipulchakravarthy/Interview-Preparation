class Solution{

	public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        Set<List<Integer>> triplets  = new HashSet<>();
        if(nums.length==0) return new ArrayList<>(triplets);
        int sum = 0;
        for(int i = 0; i < nums.length-2;i++){
           int l = i + 1;
            int h = nums.length-1;
            while(l < h){
                sum = nums[l] + nums[h];
                if(sum == -nums[i] && l != i && h != i){
                    triplets.add(Arrays.asList(nums[i], nums[l], nums[h]));
                    l++;
                    h--;
                }
                else if(sum > -nums[i]){
                    h--;
                }else{
                    l++;
                }
            }
        }
        return new ArrayList<>(triplets);
    }


	public static void main(String[] args) {
		Solution obj = new Solution();

		System.out.println(obj.isUnique("vipulv"));
	}
}