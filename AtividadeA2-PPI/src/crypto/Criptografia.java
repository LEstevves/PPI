package crypto;

import java.io.UnsupportedEncodingException;

/**
 * A tester for the CryptoUtils class.
 * @author www.codejava.net
 *
 */
public class Criptografia {
    public String Criptografar(String texto) {
    	String cripto="";
			try {
				String key = "leonardoestevves";
				byte[] btexto = texto.getBytes("ISO-8859-1");
				System.out.println("senha: " + texto);
				byte[] bCripto = CryptoUtils.encrypt(key, btexto);
				cripto = new String(bCripto, "ISO-8859-1");
				System.out.println("senha criptografada: " + cripto);
			} catch (UnsupportedEncodingException | CryptoException e) {
				e.printStackTrace();
			}
			return cripto;
    }
}