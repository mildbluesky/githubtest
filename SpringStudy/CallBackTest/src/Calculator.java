import java.io.BufferedReader;
import java.io.IOException;

public class Calculator {

	public int sum(String filePath) {

		BufferedReaderCallback callback = new BufferedReaderCallback() {

			@Override
			public int doSometingWithReader(BufferedReader br) throws IOException {

				int sum = 0;
				String line = null;

				while((line = br.readLine()) != null) {
					sum += Integer.valueOf(line);
				}



				return sum;
			}
		};


		return new FileReadTemplate().FileRead(filePath, callback);
	}

	public int mulitiple() {
		return 0;
	}

}
