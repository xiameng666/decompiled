import android.content.Context;
import android.util.Base64;
import j..time.Instant;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Map;
import java.util.UUID;

public final class bcpz {
    public static final baun a;
    public bhnd b;
    private static final Charset c;
    private final String d;
    private String e;

    static {
        bcpz.a = bcrh.a("droidguard_provider");
        bcpz.c = Charset.forName("UTF-8");
    }

    public bcpz() {
        this(UUID.randomUUID().toString());
    }

    public bcpz(String s) {
        this.d = s;
    }

    public final String a(Context context0, String s, String s1) {
        return this.b(context0, hrfc.a.b().j(), ggeo.m("iidHash", bcpz.c(s), "rpc", s1));
    }

    public final String b(Context context0, String s, Map map0) {
        bhnd bhnd1;
        if(hrfc.a.b().z()) {
            bhnd bhnd0 = this.b;
            if(bhnd0 == null || this.e == null) {
                this.e = s;
                bhnd1 = this.d(context0, s);
                this.b = bhnd1;
            }
            else if(bhnd0.b() && (this.e == null || this.e.equals(s))) {
                bhnd1 = this.b;
            }
            else {
                bcpz.a.j("closing invalid handle", new Object[0]);
                bhnd bhnd2 = this.b;
                if(bhnd2 != null) {
                    bhnd2.close();
                    bcqx.a(context0).t(this.d, gmfz.aC);
                }
                this.e = s;
                bhnd1 = this.d(context0, s);
                this.b = bhnd1;
            }
            bcpz.a.j("getting snapshot", new Object[0]);
            long v = Instant.now().toEpochMilli();
            String s1 = bhnd1.a(map0);
            long v1 = Instant.now().toEpochMilli() - v;
            bcpz.e(context0, this.d, v1, gmfx.bL);
            return s1;
        }
        long v2 = Instant.now().toEpochMilli();
        bcpz.a.j("initializing for flow: %s", new Object[]{s});
        bhnd bhnd3 = bhnc.a(context0, s);
        bcpz.a.j("getting snapshot", new Object[0]);
        String s2 = bhnd3.a(map0);
        bhnd3.close();
        long v3 = Instant.now().toEpochMilli() - v2;
        bcpz.a.j("latency for snapshot: %d ms", new Object[]{v3});
        bcpz.e(context0, this.d, v3, gmfx.bJ);
        return s2;
    }

    static String c(String s) {
        MessageDigest messageDigest0;
        try {
            messageDigest0 = MessageDigest.getInstance("SHA-256");
        }
        catch(NoSuchAlgorithmException noSuchAlgorithmException0) {
            bcpz.a.n("NoSuchAlgorithmException", noSuchAlgorithmException0, new Object[0]);
            return "";
        }
        messageDigest0.update(s.getBytes(bcpz.c));
        return Base64.encodeToString(Arrays.copyOf(messageDigest0.digest(), 0x40), 3).substring(0, 0x20);
    }

    private final bhnd d(Context context0, String s) {
        bcpz.a.j("initializing handle for flow: %s", new Object[]{s});
        long v = Instant.now().toEpochMilli();
        bhnd bhnd0 = bhnc.a(context0, s);
        long v1 = Instant.now().toEpochMilli() - v;
        bcpz.e(context0, this.d, v1, gmfx.bK);
        return bhnd0;
    }

    private static void e(Context context0, String s, long v, gmfx gmfx0) {
        if(v < hrel.a.b().a()) {
            return;
        }
        bcqx.a(context0).i(s, gmfz.az, Long.toString(v), gmfx0);
    }
}

