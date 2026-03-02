import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public final class goxe {
    public static void a(goxf goxf0, String s) {
        goxf0.f(s, null);
    }

    public static String b(String s) {
        try {
            return gfqz.c(new String(MessageDigest.getInstance("SHA-256").digest(s.getBytes())));
        }
        catch(NoSuchAlgorithmException unused_ex) {
            goxf.VZ.f("Failed to get SHA-256 MessageDigest", new Object[0]);
            return null;
        }
    }
}

