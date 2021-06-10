package Kriptografi;

import java.io.UnsupportedEncodingException;
import javax.xml.bind.DatatypeConverter;
public class Convert {
public static String byteArrayToHexString(byte[] bytesData) {
StringBuffer result = new StringBuffer();
for (byte byt : bytesData) {
result.append(Integer.toString((byt & 0xff) + 0x100, 16).substring(1));
}
return result.toString();
}
public static String hexStringToByteString(String hexStringData) throws UnsupportedEncodingException {
byte[] bytesData = DatatypeConverter.parseHexBinary(hexStringData);
String bytesString = new String(bytesData, "UTF8");
return bytesString;
}
public static String byteArrayToBytesString(byte[] bytesData) throws UnsupportedEncodingException {
String resultInBytesString = new String(bytesData, "UTF8");
return resultInBytesString;
}
public static byte[] hexStringToByteArray(String hexStringData) {
byte[] resultInByteArray = DatatypeConverter.parseHexBinary(hexStringData);
return resultInByteArray;
}
}
