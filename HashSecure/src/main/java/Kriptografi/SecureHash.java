package Kriptografi;


import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import org.bouncycastle.jce.provider.BouncyCastleProvider;
public class SecureHash {
private String algorithm;
public SecureHash() {
this.algorithm = "SHA";
}
public SecureHash(String algorithm) {
this.algorithm = algorithm;
}
public byte[] doHash(String data) throws NoSuchAlgorithmException, UnsupportedEncodingException {
Security.addProvider(new BouncyCastleProvider());
MessageDigest md = MessageDigest.getInstance(algorithm);
System.out.println("\n" + md.getProvider().getInfo());
byte[] bytesData = data.getBytes("UTF8");
md.update(bytesData);
return md.digest();
}
}

