class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        int result = 0;
        int i = 0;

        while (i < n) {
            int j = i;

            while (j < n && chars[j] == chars[i]) {
                j++;
            }

            int count = j - i;

            chars[result++] = chars[i];

            if (count > 1) {
                String temp = Integer.toString(count);

                for (char c : temp.toCharArray()) {
                    chars[result++] = c;
                }
            }

            i = j;
        }

        return result;
    }
}