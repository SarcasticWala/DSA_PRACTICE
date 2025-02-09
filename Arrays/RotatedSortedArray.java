class RotatedSortedArray {
    public boolean check(int[] nums) {
        int n = nums.length;
        int count = 0;
        
        // Traverse the array to count how many times nums[i] > nums[(i+1) % n]
        for (int i = 0; i < n; i++) {
            if (nums[i] > nums[(i + 1) % n]) {
                count++;
            }
        }
        
        // The array is a rotated sorted array if count is at most 1
        return count <= 1;
    }

    public static void main(String[] args) {
        RotatedSortedArray RotatedSortedArray = new RotatedSortedArray();

        // Test cases
        int[] arr1 = {3, 4, 5, 1, 2};
        int[] arr2 = {2, 1, 3, 4};
        int[] arr3 = {1, 2, 3};
        int[] arr4 = {6, 7, 8, 9, 10}; // Already sorted, should return true
        int[] arr5 = {10, 6, 7, 8, 9}; // Not a valid rotated sorted array

        // Print results
        System.out.println(RotatedSortedArray.check(arr1)); // true
        System.out.println(RotatedSortedArray.check(arr2)); // false
        System.out.println(RotatedSortedArray.check(arr3)); // true
        System.out.println(RotatedSortedArray.check(arr4)); // true
        System.out.println(RotatedSortedArray.check(arr5)); // false
    }
}
