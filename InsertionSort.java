package sort;

public class InsertionSort {
	public static void main(String args[]){
		int[] nums = {3,2,4,5,8,1,1,2};
		insertionSort(nums);
		System.out.println("Insertion Sort");
		for(int i = 0; i < nums.length; i++){
			System.out.print(nums[i]);
			System.out.print(";");
		}
	}

	public static void insertionSort(int[] nums) {
		for(int i = 0; i < nums.length - 1; i++) {
			int index = i, temp = nums[i];
            while (index > 0 && nums[index - 1] > temp) {
            	nums[index] = nums[index - 1];
                index--;
            }
            nums[index] = temp;
		}
	}
}
