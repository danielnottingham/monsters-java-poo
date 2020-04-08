package challengerCondenation;

import java.math.BigInteger;
import java.security.*;

public class Sha1 {
	
	public static void main(String[] argv){

		String valor = "nobody expects the spanish inquisition. monty python";

		String sha1 = "";
		
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-1");
	        digest.reset();
	        digest.update(valor.getBytes("utf8"));
	        sha1 = String.format("%040x", new BigInteger(1, digest.digest()));
		} catch (Exception e){
			e.printStackTrace();
		}

		System.out.println( "The sha1 of \""+ valor + "\" is:");
		System.out.println( sha1 );
		System.out.println();

     }
	
}
