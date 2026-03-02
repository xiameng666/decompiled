import java.security.MessageDigest;

public final class eqng {
    public static String a(String s, gjpi gjpi0) {
        if(gjpi0 == gjpi.d || gjpi0 == gjpi.e) {
            byte[] arr_b = eqng.b(s);
            return arr_b == null ? s : bboy.e(arr_b).substring(0, 4);
        }
        return s;
    }

    public static byte[] b(String s) {
        MessageDigest messageDigest0 = bbms.g("SHA1");
        return messageDigest0 == null ? null : messageDigest0.digest(s.getBytes());
    }
}

