class Solution {
    private int getLength(String str, int index) {
        int cur = index, size = str.length();
        while (cur < size && str.charAt(index) == str.charAt(cur)) {
            cur++;
        }
        return cur - index;
    }

    public boolean isStretchy(String str1, String str2) {
        int src = 0, dst = 0;
        while (src < str1.length() && dst < str2.length()) {
            if (str1.charAt(src) != str2.charAt(dst)) {
                return false;
            }
            int sLen = getLength(str1, src);
            int dLen = getLength(str2, dst);
            if (sLen < dLen) {
                return false;
            }
            if (sLen != dLen && sLen < 3) {
                return false;
            }
            src += sLen;
            dst += dLen;
        }
        return src == str1.length() && dst == str2.length();
    }

    public int expressiveWords(String str, String[] wds) {
        int count = 0;
        for (String each : wds) {
            if (isStretchy(str, each)) {
                count++;
            }
        }
        return count;
    }
}
