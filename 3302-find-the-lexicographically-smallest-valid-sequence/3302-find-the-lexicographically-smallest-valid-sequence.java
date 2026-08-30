class Solution {
    public int[] validSequence(String word1, String word2) {
        int n = word1.length(), m = word2.length();
        int[] suffix = new int[n + 1];
        java.util.Arrays.fill(suffix, m);
        int j = m - 1;
        for (int i = n - 1; i >= 0; i--) {
            suffix[i] = suffix[i + 1];
            if (j >= 0 && word1.charAt(i) == word2.charAt(j)) {
                suffix[i] = j;
                j--;
            }
        }
        j = 0;
        boolean usedMismatch = false;
        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (j >= m) break;
            if (word1.charAt(i) == word2.charAt(j)) {
                list.add(i);
                j++;
            } else if (!usedMismatch && suffix[i + 1] <= j + 1) {
                usedMismatch = true;
                list.add(i);
                j++;
            }
        }
        if (j == m) {
            int[] ans = new int[list.size()];
            for (int k = 0; k < ans.length; k++) ans[k] = list.get(k);
            return ans;
        }
        return new int[0];
    }
}