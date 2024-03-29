package BaekJoon_09_1011;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BaekJoon_09_1011 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

		long t = Integer.parseInt(reader.readLine());

		for (int i = 0; i < t; i++) {
			StringTokenizer st = new StringTokenizer(reader.readLine());
			long start = Integer.parseInt(st.nextToken());
			long end = Integer.parseInt(st.nextToken());

			long dis = end - start;
			long max = (int) Math.sqrt(dis);

			if (max == Math.sqrt(dis))
				writer.write(2 * max - 1 + "\n");
			else if (Math.sqrt(dis) - max <= 0.5)
				writer.write(2 * max + "\n");
			else
				writer.write(2 * max + 1 + "\n");
		}

		writer.flush();
		writer.close();
		reader.close();
	}

}
