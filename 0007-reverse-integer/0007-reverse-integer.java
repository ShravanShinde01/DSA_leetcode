class Solution {
    public int reverse(int x) {
        int rp = 0;

        while (x != 0) {
            int lastDig = x % 10;
            x = x / 10;

            if (rp > Integer.MAX_VALUE / 10 ||
                (rp == Integer.MAX_VALUE / 10 && lastDig > 7)) {
                return 0;
            }

            if (rp < Integer.MIN_VALUE / 10 ||
                (rp == Integer.MIN_VALUE / 10 && lastDig < -8)) {
                return 0;
            }

            rp = rp * 10 + lastDig;
        }

        return rp;
    }
}