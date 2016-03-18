package sort;

public class QuickSort {
	
	public static void main(String args[]){
		int[] nums = {3,2,4,5,8,1,1,2};
		int low = 0;
		int high = nums.length -1;
		quickSort(nums,low,high);
		System.out.println("Quick Sort");
		for(int i = 0; i <= high; i++){
			System.out.print(nums[i]);
			System.out.print(";");
		}
	}
	
	public static void quickSort(int arr[], int low, int high) {
	      int index = partition(arr, low, high);
	      if (low < index - 1)
	            quickSort(arr, low, index - 1);
	      if (index < high)
	            quickSort(arr, index, high);
	}
	
	public static int partition(int[] nums, int low, int high){
		int pivot = nums[low+(high-low)/2];
		int i = low;
		int j = high;
		while(i <= j){
			while(nums[i] < pivot){
				i++;
			}
			while(nums[j] > pivot){
				j--;
			}
			if(i <= j){
				swap(nums,i,j);
				i++;
				j--;
			}
			
		}
		return i;
	}
	
	public static void swap(int[] nums, int i, int j){
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
