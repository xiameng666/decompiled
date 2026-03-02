import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;

final class bljv {
    public static byte[] a(String s, PublicKey publicKey0) {
        try {
            MessageDigest messageDigest0 = MessageDigest.getInstance("SHA256");
            messageDigest0.update(s.getBytes("UTF-8"));
            messageDigest0.update(publicKey0.getEncoded());
            return messageDigest0.digest();
        }
        catch(NoSuchAlgorithmException | UnsupportedEncodingException exception0) {
            bxly bxly0 = new bxly();
            bxly0.a = 8;
            bxly0.c = exception0;
            bxly0.b = "Error creating rpId and public key hash";
            throw bxly0.a();
        }
    }

    public static final byte[] b(bmcs bmcs0, byte[] arr_b, byte[] arr_b1) {
        ByteBuffer byteBuffer0 = ByteBuffer.allocate(arr_b.length + 1 + arr_b1.length);
        byteBuffer0.put(((byte)bmcs0.f));
        byteBuffer0.put(arr_b);
        byteBuffer0.put(arr_b1);
        return byteBuffer0.array();
    }

    public static final String c(bmcs bmcs0, byte[] arr_b, String s) {
        gfss gfss0 = gfss.d('.');
        String s1 = ghjc.d.o(arr_b);
        return gfss0.g(Integer.valueOf(bmcs0.f), s1, new Object[]{s});
    }
}

