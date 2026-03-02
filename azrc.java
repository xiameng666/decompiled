import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;

public final class azrc {
    public final String a;
    public final byte[] b;
    public byte[] c;
    public final basd d;
    private byte[] e;

    public azrc(String s, basd basd0) {
        this.e = null;
        this.c = null;
        this.a = s;
        this.d = basd0;
        this.b = basd0.hy();
    }

    public static byte[] a(byte[] arr_b, String s) {
        byte[] arr_b1;
        MessageDigest messageDigest0 = bbms.g("SHA-256");
        gftb.check(messageDigest0);
        try {
            arr_b1 = s.getBytes("US-ASCII");
        }
        catch(UnsupportedEncodingException unsupportedEncodingException0) {
            throw new RuntimeException(unsupportedEncodingException0);
        }
        messageDigest0.update(arr_b1);
        messageDigest0.update(0x20);
        messageDigest0.update(arr_b);
        return messageDigest0.digest();
    }

    public final int b(azpa azpa0) {
        if(this.e == null) {
            this.e = azrc.a(this.b, this.a);
        }
        return azpa0.a.a(this.e);
    }

    public final boolean c(azpa azpa0) {
        if(this.e == null) {
            this.e = azrc.a(this.b, this.a);
        }
        return azpa0.a(this.e);
    }
}

