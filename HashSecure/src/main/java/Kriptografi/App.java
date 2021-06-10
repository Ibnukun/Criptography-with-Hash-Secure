package Kriptografi;

import org.apache.commons.codec.binary.Base64;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.NoSuchAlgorithmException;

public class App {
public static void main(String[] args) throws IOException, NoSuchAlgorithmException {
BufferedReader bReader = new BufferedReader(new InputStreamReader(System.in));
System.out.println("Masukkan plainText : ");
String str = bReader.readLine();
SecureHash secureHash = new SecureHash("SHA512");
byte[] hashResult = secureHash.doHash(str);
String hashResultInHexString = Convert.byteArrayToHexString(hashResult);
String hashResultInByteString = Convert.byteArrayToBytesString(hashResult);
System.out.println("Digest dalam hexa : " + hashResultInHexString);
System.out.println("Digest dalam bytes : " + hashResultInByteString);
System.out.println("Digest dalam ascii : " + Base64.encodeBase64String(hashResult));
}
}