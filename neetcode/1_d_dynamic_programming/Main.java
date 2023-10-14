import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;
import java.io.File;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(new File("input.txt"));
		int n = scanner.nextInt();
		Solution solution = new Solution();
		int result = solution.climbStairs(n);
		Files.write(Paths.get("output.txt"), (result + "").getBytes());
	}
}

class Solution {
	public int climbStairs(int n) {
		int[] dp = new int[n + 1];
		dp[0] = 1;
		dp[1] = 1;
	
		int i = 2;
		while (i <= n) {
			dp[i] = dp[i - 1] + dp[i - 2]
			i++;
		}	
		return dp[n];
	}
}

