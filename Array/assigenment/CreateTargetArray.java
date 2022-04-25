// 1389. Create Target Array in the Given Order
// https://leetcode.com/problems/create-target-array-in-the-given-order/

public class CreateTargetArray {
    public static int[] createTargetArray(int[] nums, int[] index) {
        int []target = new int[nums.length+index.length];
        int i = 0,k = 0;

        while(i<nums.length && i < index.length){
            if(nums[i] == index[i]){
                target[k++] = nums[i++];
            }
            else
            {
                target[k++] = nums[i];
                target[k++] = index[i];
                i++;
            }
        }
        

        return target;
    }
    public static void main(String []args)
    {
        int []a = {0,1,2,3,4};
        int []b = {0,1,2,2,1};
        for(int x : createTargetArray(a,b))
        {
            System.out.println(x);
        }

    }
}
