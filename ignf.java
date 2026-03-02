import java.util.HashMap;

public final class ignf extends ignj {
    private final String a;

    static {
        new HashMap();
    }

    public ignf(ignf ignf0, String s) {
        if(!ignf.c(s, 0)) {
            throw new IllegalArgumentException(a.a(s, "string ", " not a valid OID branch"));
        }
        this.a = ignf0.a + "." + s;
    }

    public ignf(String s) {
        if(s.length() >= 3 && s.charAt(1) == 46) {
            int v = s.charAt(0);
            if(v >= 0x30 && v <= 50 && ignf.c(s, 2)) {
                this.a = s;
                return;
            }
        }
        throw new IllegalArgumentException(a.a(s, "string ", " not an OID"));
    }

    @Override  // ignj
    public final boolean b(ignj ignj0) {
        if(ignj0 == this) {
            return true;
        }
        return (ignj0 instanceof ignf) ? this.a.equals(((ignf)ignj0).a) : false;
    }

    private static boolean c(String s, int v) {
        boolean z;
        int v1 = s.length();
    alab1:
        while(true) {
            for(z = false; true; z = true) {
                --v1;
                if(v1 < v) {
                    break alab1;
                }
                int v2 = s.charAt(v1);
                if(v2 < 0x30 || v2 > 57) {
                    if(v2 != 46 || !z) {
                        return false;
                    }
                    break;
                }
            }
        }
        return z;
    }

    @Override  // igne
    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override
    public final String toString() {
        return this.a;
    }
}

