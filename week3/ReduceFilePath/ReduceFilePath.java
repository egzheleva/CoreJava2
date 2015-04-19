import java.nio.file.Paths;

public class ReduceFilePath {

	public static String reducePath(String filename) {
		return Paths.get(filename).normalize().toString();
	}

	public static void main(String[] args) {
		System.out.println(ReduceFilePath.reducePath("/srv/www/htdocs/wtf/"));
	}

}
