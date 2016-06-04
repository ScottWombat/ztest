package ztest;
/* File Output */
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;

public class FileOutput {

	public static void main(String[] args) throws IOException {
		//File file =new File(".").getAbsolutePath() + "INSERT _PAX_TRACKING.sql";
		//File file = new File("C:\\INSERT _PAX_TRACKING.sql");
		FileOutputStream writer= new FileOutputStream("abc.txt");

		byte[] contentInBytes = "HEllo1".getBytes();
		writer.write(contentInBytes);
		writer.flush();
		writer.close();
	}

}
