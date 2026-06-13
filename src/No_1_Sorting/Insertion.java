package No_1_Sorting;

public class Insertion {
    public int[] insertionSort(int[] nums) {
        for (int i = 0 ;i<=nums.length-1;i++){
            int j = i;
            while(j > 0 && nums[j-1] > nums[j]){
                int temp = nums[j-1];
                nums[j-1]=nums[j];
                nums[j]=temp;
                j--;
            }
        }
        return nums;
    }
    public static void main (String[]argd){
        int []nums={7, 4, 1, 5, 3};
}
