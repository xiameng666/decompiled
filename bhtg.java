import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;

public final class bhtg {
    public static String a(byte[] arr_b, String s) {
        MessageDigest messageDigest0 = bbms.g(s);
        return messageDigest0 == null ? "" : bboy.e(messageDigest0.digest(arr_b)).toLowerCase();
    }

    public static String b(File file0, String s) {
        String s1;
        FileInputStream fileInputStream0 = null;
        try {
            fileInputStream0 = new FileInputStream(file0);
            byte[] arr_b = new byte[((int)Math.min(0x400L, file0.length()))];
            fileInputStream0.read(arr_b);
            s1 = bhtg.a(arr_b, s);
            goto label_13;
        }
        catch(Exception unused_ex) {
            if(fileInputStream0 != null) {
                try {
                    fileInputStream0.close();
                }
                catch(IOException unused_ex) {
                }
            }
            return "";
        }
        catch(Throwable throwable0) {
            if(fileInputStream0 != null) {
                try {
                    fileInputStream0.close();
                }
                catch(IOException unused_ex) {
                }
            }
        }
        throw throwable0;
        try {
        label_13:
            fileInputStream0.close();
        }
        catch(IOException unused_ex) {
        }
        return s1;
    }
}

