class Solution {
	public int reverseBits(int n) {
		int res = 0;
		int i = 0;
		while (i < 32) {
			res <<= 1;
			res += n & 1
			n >>= 1;
			i++;
		}
		return res;
	}
}
