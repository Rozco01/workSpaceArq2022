/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patrones.estructurales.facadepractica1.apis;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
/**
 *
 * @author Jefferson
 */
public class SHA256EncryptorAPI {
    	public SHA256EncryptorAPI() {
		super();
	}

	public String encrypt(String text) {
		String hash = "";
		try {
			MessageDigest digest = MessageDigest.getInstance("SHA-256");
			byte[] textBytes = digest.digest(text.getBytes(StandardCharsets.UTF_8));
			
			StringBuffer buffer = new StringBuffer();
	        for (int i = 0; i < textBytes.length; i++) {
	         buffer.append(Integer.toString((textBytes[i] & 0xff) + 0x100, 16).substring(1));
	        }
	    	hash = buffer.toString();
		}
		catch(NoSuchAlgorithmException e) {
			e.printStackTrace();
		}
                return hash;
		
            }
}
