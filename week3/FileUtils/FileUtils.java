import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FileUtils {

	private FileUtils() {
	}

	public static String readFrom(File file) {
		StringBuilder sb = new StringBuilder();
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {

			String currentLine;

			while ((currentLine = br.readLine()) != null) {
				sb.append(currentLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
		return sb.toString();

	}

	public static String readFrom(Path path) {
		return readFrom(path.toFile());
	}

	public void writeTo(File file, String content) {
		try {

			if (!file.exists()) {
				file.createNewFile();
			}

			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void writeTo(Path path, String content) {
		writeTo(path.toFile(), content);
	}

	public void fixEncoding(Path path) {
		String oldEncoding = readFrom(path);
		String fixed = "";
		try {
			fixed = new String(oldEncoding.getBytes("windows-1251"),
					Charset.forName("UTF8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		writeTo(path, fixed);
	}

	public static void findBrokenLinks(Path dir) {
		File[] files = new File(dir.toString()).listFiles();
		showBrokenLinks(files);
	}


	public static void showBrokenLinks(File[] files) {
		for (File file : files) {
			if (file.isDirectory()) {
				showBrokenLinks(file.listFiles());
			} else {
				try {
					if (Files.isSymbolicLink(file.toPath())
							&& Files.readSymbolicLink(file.toPath()).equals(
									file.toPath())) {
						System.out.println(file);
					}
				} catch (IOException e) {

					e.printStackTrace();
				}
			}
		}
	}
	
	public static void compress(Path filePath) throws FileNotFoundException {
	File f = filePath.toFile();
	String text;
	text =new Scanner(new File(f.toString())).useDelimiter("\\Z").next();
	String result = "";
	List<String> l = new ArrayList<String>();
	for (String word : text.split(" ")) {
		if (l.contains(word) == true){
			result += l.indexOf(word);
		}
		else{
			l.add(word);
			result += l.indexOf(word);
		}
		result += '~';
	}
	PrintWriter pw = new PrintWriter(f);
	pw.println(result);
	pw.close();
	}

	public static void main(String[] args) throws IOException {
//		Path path = Paths.get("/home/eli/workspace/week3/lq.txt");
//		System.out.println(readFrom(path));
		
		FileUtils.findBrokenLinks(Paths.get("/home/eli/workspace/week3/"));
		
		FileUtils.compress(Paths.get("/home/eli/workspace/week3/lqlq.txt"));
	}

}
