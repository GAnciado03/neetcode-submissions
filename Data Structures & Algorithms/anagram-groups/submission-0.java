class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        boolean[] visited = new boolean[strs.length];
        List<List<String>> ans = new ArrayList<>();
        for (int i = 0; i < strs.length; i++) {
            if(visited[i]) continue;
            List<String>  group = new ArrayList<>();
            char[] word = strs[i].toCharArray();
            Arrays.sort(word);
            group.add(strs[i]);
            visited[i] = true;
            for (int j = i + 1; j < strs.length; j++) {
                if(visited[j]) continue;
                char[] checker = strs[j].toCharArray();
                Arrays.sort(checker);
                if(Arrays.equals(word, checker)){
                    group.add(strs[j]);
                    visited[j] = true;
                }
            }
            ans.add(group);

        }
        ans.sort((a,b) -> Integer.compare(a.size(), b.size()));
        return ans;
    }
}
