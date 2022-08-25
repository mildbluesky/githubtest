import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class FileReadTemplate {

	public int FileRead(String filePath, BufferedReaderCallback callback)  {
		BufferedReader br = null;

		int ret = 0;

		try {
		br = new BufferedReader(new FileReader(filePath));
		ret = callback.doSometingWithReader(br);
		}catch(IOException ioe) {
			ioe.printStackTrace();

		}finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return ret;

	}

}
