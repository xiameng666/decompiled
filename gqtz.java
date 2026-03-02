import java.io.Serializable;

public final class gqtz implements gqtw, gqty, hfub, Serializable {
    public static final gqtz sm;
    public final String sn;
    private final int so;

    static {
        gqtz.sm = new gqtz(-1, "UNRECOGNIZED");
    }

    public gqtz(int v, String s) {
        this.so = v;
        this.sn = s;
    }

    @Override  // hfub
    public final int a() {
        if(this != gqtz.sm) {
            return this.so;
        }
        throw new IllegalArgumentException("Can\'t get the number of an unknown enum value.");
    }

    public static gqtz b(int v) {
        if(gqtv.a(v) != null) {
            return gqtv.a(v);
        }
        return gqtx.a(v) == null ? null : gqtx.a(v);
    }

    @Override
    public final String toString() {
        return Integer.toString(this.so);
    }
}

