import java.security.Key;
import java.util.Iterator;
import javax.crypto.spec.SecretKeySpec;

public final class ghgf {
    static final int a;
    public static final int b;

    static {
        ghgf.a = (int)System.currentTimeMillis();
    }

    public static ghfy a(Iterable iterable0) {
        Iterator iterator0 = iterable0.iterator();
        gftb.b(iterator0.hasNext(), "Must be at least 1 hash code to combine.");
        Object object0 = iterator0.next();
        int v = ((ghfy)object0).b() / 8;
        byte[] arr_b = new byte[v];
        for(Object object1: iterable0) {
            byte[] arr_b1 = ((ghfy)object1).e();
            gftb.b(arr_b1.length == v, "All hashcodes must have the same bit length.");
            for(int v1 = 0; v1 < arr_b1.length; ++v1) {
                arr_b[v1] = (byte)(arr_b[v1] + arr_b1[v1]);
            }
        }
        return new ghfv(arr_b);
    }

    public static ghfz b(byte[] arr_b) {
        gftb.check(arr_b);
        SecretKeySpec secretKeySpec0 = new SecretKeySpec(arr_b, "HmacSHA1");
        return new ghgt("HmacSHA1", secretKeySpec0, ghgf.f("hmacSha1", secretKeySpec0));
    }

    public static ghfz c(Key key0) {
        return new ghgt("HmacSHA256", key0, ghgf.f("hmacSha256", key0));
    }

    public static ghfz d(byte[] arr_b) {
        gftb.check(arr_b);
        return ghgf.c(new SecretKeySpec(arr_b, "HmacSHA256"));
    }

    public static ghfz e() {
        return ghhb.c;
    }

    private static String f(String s, Key key0) {
        return "Hashing." + s + "(Key[algorithm=" + key0.getAlgorithm() + ", format=" + key0.getFormat() + "])";
    }
}

