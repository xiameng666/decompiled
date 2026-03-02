import android.util.Base64;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.List;
import java.util.Locale;

public final class bgmt {
    public static final int a;
    private static final ibzd b;

    static {
        bgmt.b = new ibzd("^[a-z][a-z0-9_]*(\\.[a-z_][a-z0-9_]*)*$");
    }

    public static final bedo a(String s) {
        ibuq.f(s, "uri");
        Integer integer0 = null;
        if(ibzk.m(s, "android://", true)) {
            URI uRI0 = bgmt.c(s);
            if(uRI0 == null) {
                return null;
            }
            String s1 = uRI0.getScheme();
            if(s1 != null) {
                String s2 = s1.toLowerCase(Locale.ROOT);
                ibuq.e(s2, "toLowerCase(...)");
                if(s2 == null) {
                    return null;
                }
                String s3 = uRI0.getAuthority();
                if(s3 == null) {
                    return null;
                }
                if(!ibzk.k(s2, "android", true)) {
                    return null;
                }
                List list0 = ibzk.S(s3, new char[]{'@'}, 0, 6);
                if(list0.size() != 2) {
                    return null;
                }
                String s4 = (String)list0.get(0);
                String s5 = ((String)list0.get(1)).toLowerCase(Locale.ROOT);
                ibuq.e(s5, "toLowerCase(...)");
                if(s4.length() == 0) {
                    return null;
                }
                if(s5.length() == 0) {
                    return null;
                }
                try {
                    Base64.decode(s4, 10);
                }
                catch(IllegalArgumentException unused_ex) {
                    return null;
                }
                return !bgmt.b.g(s5) ? null : new bedm(s4, s5);
            }
            return null;
        }
        if(bgmt.d(s) == null) {
            return null;
        }
        URI uRI1 = bgmt.c(s);
        if(uRI1 == null) {
            return null;
        }
        String s6 = uRI1.getScheme();
        if(s6 != null) {
            String s7 = s6.toLowerCase(Locale.ROOT);
            ibuq.e(s7, "toLowerCase(...)");
            if(s7 == null) {
                return null;
            }
            String s8 = uRI1.getHost();
            if(s8 != null) {
                String s9 = s8.toLowerCase(Locale.ROOT);
                ibuq.e(s9, "toLowerCase(...)");
                if(s9 == null) {
                    return null;
                }
                if(ibzk.G(s9, ".") && !ibzk.W(s9, ".") && !ibzk.J(s9, ".")) {
                    String s10 = uRI1.getPath();
                    if(s10 == null || s10.length() == 0) {
                        s10 = "/";
                    }
                    Integer integer1 = uRI1.getPort();
                    if(integer1.intValue() != -1) {
                        integer0 = integer1;
                    }
                    return new bedn(s7, s9, integer0, s10);
                }
            }
        }
        return null;
    }

    public static final bedz b(String s) {
        ibuq.f(s, "uri");
        bedo bedo0 = bgmt.a(s);
        return bedo0 == null ? null : bedx.a(bedo0);
    }

    private static final URI c(String s) {
        try {
            return new URI(s);
        }
        catch(URISyntaxException unused_ex) {
            return null;
        }
    }

    private static final URL d(String s) {
        try {
            return new URL(s);
        }
        catch(MalformedURLException unused_ex) {
            return null;
        }
    }
}

