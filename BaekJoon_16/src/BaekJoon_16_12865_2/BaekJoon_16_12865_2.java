package BaekJoon_16_12865_2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_16_12865_2 {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(reader.readLine());
		int N = Integer.parseInt(st.nextToken()); // 1 ~ 100
		int K = Integer.parseInt(st.nextToken()); // 1 ~ 100,000

		int[][] dp = new int[N + 1][K + 1]; // 0:W(무게), 1:V(가치)
		int[] W = new int[N + 1];
		int[] V = new int[N + 1];

		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(reader.readLine());
			W[i] = Integer.parseInt(st.nextToken());
			V[i] = Integer.parseInt(st.nextToken());
		}

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= K; j++) {
				dp[i][j] = dp[i - 1][j]; // 기본적으로 이전 아이템의 가치를 저장한다.
				if (j - W[i] >= 0) { // 무게에서 자신의 무게를 뺐을 때 남는 무게가 존재하면,
					dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - W[i]] + V[i]); // 이전 아이템에서 구한 가치와 남은 무게의 가치 + 자신의 가치
																					// 중 큰 값을 취한다.
				}
			}
		}

		for (int i = 1; i <= N; i++) {
			for (int j = 1; j <= K; j++) {
				System.out.print(dp[i][j] + "\t");
			}
			System.out.println();
		}

		writer.write(dp[N][K] + "");

		writer.flush();
		reader.close();
		writer.close();
	}

}
