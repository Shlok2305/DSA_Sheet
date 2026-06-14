package No_1_Sorting;

public class Selection {
    public static int[] selectionSort(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int smallest = i;
            for(int j =i+1;j<nums.length;j++){
                if(nums[smallest]>nums[j]){
                    smallest=j;
                }
            }
            int temp = nums[smallest];
            nums[smallest]=nums[i];
            nums[i]=temp;
        }
        return nums;
    }

    public static void main(String[] args) {
        int []nums = {7 ,4 ,1 ,5 ,3};
        int[] result = selectionSort(nums);

        for (int i =0 ;i<nums.length;i++){
            System.out.print(result[i]+" ");
        }
    }
}

