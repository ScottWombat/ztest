package ztest;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.Inflater;
import java.util.zip.InflaterOutputStream;

public class StringCompress {
	
	
	public static void main(String[] str){
		String mystr ="Firefox has prvented the outdate plugin adobe flashgqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqqq44444444444444444444444444444444";
		System.out.println("String length:" +mystr.length());
		 byte[] Str2 = mystr.getBytes();
         System.out.println("Returned  Value " + Str2 + " size:" + Str2.length);
         byte[] compressed =compress(Str2);
         System.out.println("Compress:" + compressed.length);
         System.out.println("DeCompress:" + decompress(compressed).length);
	}
	
	public static byte[] decompress(byte[] input){
		 ByteArrayOutputStream stream2 = new ByteArrayOutputStream();
		    Inflater decompresser = new Inflater(true);
		    InflaterOutputStream inflaterOutputStream = new InflaterOutputStream(stream2, decompresser);
		    try {
				inflaterOutputStream.write(input);
				 inflaterOutputStream.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		   
		    byte[] output2 = stream2.toByteArray();
		    return output2;
	}
	
	public static byte[] compress(byte[] input){
		ByteArrayOutputStream stream = new ByteArrayOutputStream();
		Deflater compresser = new Deflater(Deflater.BEST_COMPRESSION, true);
		DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(stream, compresser);
		try {
			deflaterOutputStream.write(input);
			deflaterOutputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		byte[] output = stream.toByteArray();
		return output;
	}

}
