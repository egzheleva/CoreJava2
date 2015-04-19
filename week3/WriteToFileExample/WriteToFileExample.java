import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;


public class WriteToFileExample {

	public static void main(String[] args) {
		try {
			String content = "Elka";
			File file = new File("/home/Eli/lq.txt");
			if(!file.exists()) {
				file.createNewFile();
			}
			
			FileWriter fw = new FileWriter(file.getAbsoluteFile());
			
		
			BufferedWriter bw = new BufferedWriter(fw);
			bw.write(content);
			bw.close();
			System.out.println("Done!");
		}
		catch(IOException e) {
			e.printStackTrace();
			
		}

	}
//	Charset charset = Charset.forName("US-ASCII");
//	String s = "lq";
//	try (BufferedWriter writer = File.newBufferedWriter(file, charset)) {
//	    writer.write(s, 0, s.length());
//	} catch (IOException x) {
//	    System.err.format("IOException: %s%n", x);
//	}
	
	
	//deleting file
	
//	try {
//	    Files.delete(path);
//	} catch (NoSuchFileException x) {
//	    System.err.format("%s: no such" + " file or directory%n", path);
//	} catch (DirectoryNotEmptyException x) {
//	    System.err.format("%s not empty%n", path);
//	} catch (IOException x) {
//	    // File permission problems are caught here.
//	    System.err.println(x);
//	}

	
	// chetene ot file DATASTREAM
//	in = new DataInputStream(new
//            BufferedInputStream(new FileInputStream(dataFile)));
//
//double price;
//int unit;
//String desc;
//double total = 0.0;
//
//
//
//try {
//    while (true) {
//        price = in.readDouble();
//        unit = in.readInt();
//        desc = in.readUTF();
//        System.out.format("You ordered %d" + " units of %s at $%.2f%n",
//            unit, desc, price);
//        total += unit * price;
//    }
//} catch (EOFException e) {
//}
	
	
	
	
	// ZAPIS VYV FAIL
//	static final String dataFile = "invoicedata";
//
//	static final double[] prices = { 19.99, 9.99, 15.99, 3.99, 4.99 };
//	static final int[] units = { 12, 8, 13, 29, 50 };
//	static final String[] descs = {
//	    "Java T-shirt",
//	    "Java Mug",
//	    "Duke Juggling Dolls",
//	    "Java Pin",
//	    "Java Key Chain"
//	};
//
//	Then DataStreams opens an output stream. Since a DataOutputStream can only be created as a wrapper for an existing byte stream object, DataStreams provides a buffered file output byte stream.
//
//	out = new DataOutputStream(new BufferedOutputStream(
//	              new FileOutputStream(dataFile)));
//
//	DataStreams writes out the records and closes the output stream.
//
//	for (int i = 0; i < prices.length; i ++) {
//	    out.writeDouble(prices[i]);
//	    out.writeInt(units[i]);
//	    out.writeUTF(descs[i]);
//	}


}
