import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCountResult {
	private String filename;

	public WordCountResult(String filename) {
		this.filename = filename;
	}

	public int getLineCount() throws IOException {
		int count = 0;
		try (BufferedReader reader = new BufferedReader(
				new FileReader(filename))) {

			while (reader.readLine() != null) {
				count++;
			}
		}
		return count;
	}

	public int getWordCount() throws IOException {
		int count = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {

			String line = br.readLine();
			while (line != null) {
				String[] parts = line.split(" ");
				count += parts.length;
				line = br.readLine();
			}
		}
		return count;

	}

	public int getCharacterCount() throws IOException {
		int count = 0;
		try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
			String line = br.readLine();
			while (line != null) {
				String replaced = line.replaceAll("//s+", "");
				count += replaced.length();
				line = br.readLine();
			}
		}
		return count;
	}

	public static void main(String[] args) throws IOException {
		WordCountResult wc = new WordCountResult("lq.txt");
		System.out.println(wc.getCharacterCount());

	}

}
