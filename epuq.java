import java.nio.charset.Charset;
import java.security.MessageDigest;

public final class epuq {
    public static final bboh a;
    public static final epuq b;

    static {
        epuq.a = bboh.b("HashedUserIdHelper", bbcu.dQ);
        epuq.b = new epuq();
    }

    public static final String a(String s, String s1) {
        batl.s(s);
        batl.s(s1);
        MessageDigest messageDigest0 = bbms.g("MD5");
        if(messageDigest0 == null) {
            return null;
        }
        Charset charset0 = Charset.forName("UTF-8");
        messageDigest0.update(String.format("%s:%s", s, s1).getBytes(charset0));
        return bboy.e(messageDigest0.digest());
    }
}

