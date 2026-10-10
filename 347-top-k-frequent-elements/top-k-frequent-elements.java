class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0;i<nums.length;i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        int[] arr=new int[map.size()];
        int t = 0;

        for (int num : map.keySet()) {
            arr[t] =num;
            t++;
        }

        for (int i = 0;i<arr.length-1;i++) {
            for (int j = i+1;j<arr.length;j++) {
                if (map.get(arr[i]) < map.get(arr[j])) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return Arrays.copyOf(arr, k);
    }
}