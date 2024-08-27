import java.util.Arrays;

public class RemoveSpecificElement {
    public static void main(String[] args) {
        int[] nums ={3,4,2,3};
        int val=2;
        System.out.println(removeElement(nums,val));
    }
    public static String removeElement(int[] nums, int val) {
        int count=0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[count++]=nums[i];
                nums[i]=-1;
            }
        }
        return Arrays.toString(nums);
    }
}
