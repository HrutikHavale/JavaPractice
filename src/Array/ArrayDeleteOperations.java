package Array;

import java.util.Arrays;

public class ArrayDeleteOperations {
    public static void main(String[] args) {
        int[] nums ={2,6,3,4,9};
        int val=3;
        int x=3;
        int n= nums.length;
        int[] result = deleteElement(nums,val,x,n);
        //System.out.println(deleteElement(nums,val,x,n));
        //deleteElement(nums,val,x,n);
        System.out.println(Arrays.toString(result));
    }

    static int[] deleteElement(int[] nums,int val,int x,int n){
        int i;
        for ( i=0;i<n;i++){
            if (nums[i]==x) {
                if (i<n-1){
//                   int temp=nums[i];
//                   nums[i]=nums[i+1];
//                    nums[i+1]=temp;
                    nums[i]=nums[i]+nums[i+1];
                    nums[i+1]=nums[i]-nums[i+1];
                    nums[i]=nums[i]-nums[i+1];
                }
            }
        }
//        for (int j=i;j<n-1;j++){
//            nums[j]=nums[j+1];
//        }
        return nums;
    }
}
