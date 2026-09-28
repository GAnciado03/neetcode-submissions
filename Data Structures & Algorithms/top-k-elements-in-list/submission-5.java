class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        int min = nums[0];
        int max = nums[0];
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] < min) {
                min = nums[i];
            }
            if(nums[i] > max) {
                max = nums[i];
            }
        }
        int range = max - min + 1;
        int[] freqs = new int[range];
        for (int i = 0; i < nums.length; i++) {
            freqs[nums[i] - min]++;
        }
        List<Integer>[] bucket = new ArrayList[nums.length + 1];
        for(int i = 0; i < freqs.length; i++) {
            int f = freqs[i];
            if(f == 0) {
                continue;
            }

            if(bucket[f] == null) {
                bucket[f] = new ArrayList<>();
            }

            int value = i + min;
            bucket[f].add(value);
        }
        int[] ans = new int[k];
        int idx = 0;

        for(int j = bucket.length - 1; j >= 0 && idx < k ; j--) {
            if(bucket[j] == null) {
                continue;
            }
            for(int j2 = 0; j2 < bucket[j].size() && idx < k; j2++) {
                ans[idx++] = bucket[j].get(j2);
            }
        }
        return ans;
    }
}
