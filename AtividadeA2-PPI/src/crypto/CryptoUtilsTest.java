/*
 Classe teste feita para saber como fica uma senha criptografada
 Dessa forma eu uso a senha criptografada no banco
 */


package crypto;

import java.io.UnsupportedEncodingException;

/**
 * A tester for the CryptoUtils class.
 * @author www.codejava.net
 *
 */
public class CryptoUtilsTest {
    public static void main(String[] args) {
    	/*A chave deve ter 16 bytes (128 bits) ou voc� ira ganhar uma 
    	 * java.security.InvalidKeyException. Se quiser chaves maiores,
    	 * use padding para ter multiplos de 128 bits. Veja a classe
    	 * Cipher no Javadoc
    	 */
			try {
				String key = "leonardoestevves";
				String texto = "leo";
				byte[] bTexto = texto.getBytes("ISO-8859-1");
				System.out.println("mensagem: " + texto);
				byte[] bCripto = CryptoUtils.encrypt(key, bTexto);
				String cripto = new String(bCripto, "ISO-8859-1");
				System.out.println("cripto: " + cripto);
				byte[] bDecripto = CryptoUtils.decrypt(key, bCripto);
				String decripto = new String(bDecripto, "ISO-8859-1");
				System.out.println("decripto: " + decripto);
				System.out.println("iguais? " + texto.equals(decripto));
			} catch (UnsupportedEncodingException | CryptoException e) {
				e.printStackTrace();
			}
    }
}