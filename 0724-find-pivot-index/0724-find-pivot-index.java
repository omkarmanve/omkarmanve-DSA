class Solution {
    public int pivotIndex(int[] nums) {

        int n=nums.length;
        int ans=0;
        int right=0;

        for(int i =0;i<n;i++)
        {
           
            ans=sum(i,nums);
            
            if(ans==0){

                return i;
            }

        }
        return -1;
    }

    public int sum(int point ,int []arr){

        int left=0;
        int right=0;
        int total=0;

        for(int i=point+1;i<arr.length;i++)
        {
            left+=arr[i];
        }

        for(int i=0;i<point;i++){

            right+=arr[i];

        }

        total=left-right;

        return total;
    }

    

}