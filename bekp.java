import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Locale;

public final class bekp {
    public static final String a(String s) {
        ibuq.f(s, "<this>");
        int v = s.length() - 1;
        int v1 = 0;
        int v2 = 0;
        while(v1 <= v) {
            int v3 = ibuq.a(s.charAt((1 == v2 ? v : v1)), 0x20);
            if(v2 == 0) {
                if(v3 > 0) {
                    v2 = 1;
                }
                else {
                    ++v1;
                }
                continue;
            }
            else if(v3 <= 0) {
                --v;
                continue;
            }
            break;
        }
        String s1 = s.subSequence(v1, v + 1).toString();
        return ibzk.G(s1, "://") ? s1 : "https://" + s1;
    }

    public static final bekn b(URI uRI0) {
        try {
            String s = uRI0.getScheme();
            String s1 = uRI0.getAuthority();
            String s2 = uRI0.getPath();
            if(s2 == null) {
                s2 = "/";
            }
            return new bekn(new URI(s, s1, s2, null, null));
        }
        catch(URISyntaxException unused_ex) {
            return null;
        }
    }

    public static final beko c(URI uRI0) {
        try {
            return new beko(new URI(uRI0.getScheme(), uRI0.getAuthority(), "/", null, null));
        }
        catch(URISyntaxException unused_ex) {
            return null;
        }
    }

    public static final boolean d(String s) {
        ibuq.f(s, "<this>");
        try {
            new URL(s);
            URI uRI0 = new URI(s);
            String s1 = uRI0.getHost();
            if(uRI0.getScheme() != null) {
                return s1 == null ? false : ibzk.G(s1, ".") && !ibzk.W(s1, ".") && !ibzk.J(s1, ".");
            }
        }
        catch(URISyntaxException | MalformedURLException unused_ex) {
        }
        return false;
    }

    public static final URI e(URI uRI0) {
        String s4;
        String s1;
        try {
            String s = uRI0.getScheme();
            if(s == null) {
                s1 = null;
            }
            else {
                s1 = s.toLowerCase(Locale.ROOT);
                ibuq.e(s1, "toLowerCase(...)");
            }
            String s2 = uRI0.getUserInfo();
            String s3 = uRI0.getHost();
            if(s3 == null) {
                s4 = null;
            }
            else {
                s4 = s3.toLowerCase(Locale.ROOT);
                ibuq.e(s4, "toLowerCase(...)");
            }
            int v = uRI0.getPort();
            String s5 = uRI0.getPath();
            return new URI(s1, s2, s4, v, (s5 == null || s5.length() == 0 ? "/" : uRI0.getPath()), null, null);
        }
        catch(URISyntaxException uRISyntaxException0) {
            a.ae(bekz.b.j(), "Unexpected exception while normalizing already validated URI", uRISyntaxException0);
            return null;
        }
    }

    public static final URI f(String s) {
        ibuq.f(s, "<this>");
        try {
            return new URI(s);
        }
        catch(URISyntaxException unused_ex) {
            return null;
        }
    }

    public static final URI g(beku beku0, String s, bglj bglj0) {
        switch(beku0.ordinal()) {
            case 0: {
                String s1 = bekp.a(s);
                if(bekp.d(s1)) {
                    URI uRI0 = bekp.f(s1);
                    return uRI0 == null ? null : bekp.e(uRI0);
                }
                break;
            }
            case 1: {
                if(bglj0 != null) {
                    return bglj0.a == null ? null : bekp.f(bglj0.a);
                }
                break;
            }
            default: {
                throw new ibnq();
            }
        }
        return null;
    }

    public static final beko h(beku beku0, String s, bglj bglj0) {
        URI uRI0 = bekp.g(beku0, s, bglj0);
        return uRI0 == null ? null : bekp.c(uRI0);
    }
}

