class Solution {
    public boolean isSolvable(String[] words, String result) {
        StringBuilder all = new StringBuilder();

        for (String w : words)
            all.append(w);

        all.append(result);

        boolean[] used = new boolean[10];
        int[] map = new int[26];
        java.util.Arrays.fill(map, -1);

        boolean[] leading = new boolean[26];

        for (String w : words) {
            if (w.length() > 1)
                leading[w.charAt(0) - 'A'] = true;
        }

        if (result.length() > 1)
            leading[result.charAt(0) - 'A'] = true;

        return solve(words, result, 0, 0, map, used, leading);
    }

    private boolean solve(String[] words, String result, int pos, int carry,
                          int[] map, boolean[] used, boolean[] leading) {

        int maxLen = result.length();

        for (String w : words)
            maxLen = Math.max(maxLen, w.length());

        if (pos == maxLen)
            return carry == 0;

        int sum = carry;

        for (String w : words) {
            int index = w.length() - 1 - pos;

            if (index >= 0) {
                char c = w.charAt(index);
                int x = c - 'A';

                if (map[x] == -1)
                    return tryDigit(words, result, pos, carry, map, used,
                                    leading, x, sum, true);

                sum += map[x];
            }
        }

        int rIndex = result.length() - 1 - pos;
        char rc = result.charAt(rIndex);
        int rx = rc - 'A';

        int digit = sum % 10;

        if (map[rx] != -1)
            return map[rx] == digit && solve(words, result, pos + 1,
                                             sum / 10, map, used, leading);

        if (used[digit] || (digit == 0 && leading[rx]))
            return false;

        map[rx] = digit;
        used[digit] = true;

        boolean ok = solve(words, result, pos + 1,
                           sum / 10, map, used, leading);

        map[rx] = -1;
        used[digit] = false;

        return ok;
    }

    private boolean tryDigit(String[] words, String result, int pos, int carry,
                             int[] map, boolean[] used, boolean[] leading,
                             int x, int sum, boolean first) {

        if (map[x] != -1) return false;

        for (int d = 0; d <= 9; d++) {
            if (used[d] || (d == 0 && leading[x]))
                continue;

            map[x] = d;
            used[d] = true;

            if (solve(words, result, pos, carry, map, used, leading))
                return true;

            map[x] = -1;
            used[d] = false;
        }

        return false;
    }
}
