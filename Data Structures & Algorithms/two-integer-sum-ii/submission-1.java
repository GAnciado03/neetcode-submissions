class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] answer = new int[2];

        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++) {
                int check = numbers[i] + numbers[j];
                if(check == target) {
                    answer[0] = i + 1;
                    answer[1] = j + 1;
                    return answer;
                }
            }
        }
        return answer;        
    }
}
