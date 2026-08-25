class Solution {
    public boolean sumGame(String num) {
        int n = num.length();
        int diff = 0;
        int leftQ = 0;
        int rightQ = 0;

        for (int i = 0; i < n / 2; i++) {
            if (num.charAt(i) == '?') {
                leftQ++;
            } else {
                diff += num.charAt(i) - '0';
            }
        }

        for (int i = n / 2; i < n; i++) {
            if (num.charAt(i) == '?') {
                rightQ++;
            } else {
                diff -= num.charAt(i) - '0';
            }
        }

        // Same number of '?' on both sides
        if (leftQ == rightQ) {
            return diff != 0;
        }

        // Make leftQ the larger count
        if (leftQ < rightQ) {
            diff = -diff;

            int temp = leftQ;
            leftQ = rightQ;
            rightQ = temp;
        }

        int extra = leftQ - rightQ;

        // Each pair of unmatched '?' can create a difference
        // of 0..9, while the extra move gives Alice control.
        return diff * 2 != extra * 9;
    }
}
