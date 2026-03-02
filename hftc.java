import j..util.DesugarCollections;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class hftc {
    public static final hftc a = null;
    private static volatile boolean b = false;
    private static volatile hftc c;
    private final Map d;

    static {
        hftc.a = new hftc(null);
    }

    public hftc() {
        this.d = new HashMap();
    }

    public hftc(hftc hftc0) {
        if(hftc0 == hftc.a) {
            this.d = Collections.EMPTY_MAP;
            return;
        }
        this.d = DesugarCollections.unmodifiableMap(hftc0.d);
    }

    public hftc(byte[] arr_b) {
        this.d = Collections.EMPTY_MAP;
    }

    public static hftc a() {
        hftc hftc2;
        hftc hftc0 = hftc.c;
        if(hftc0 != null) {
            return hftc0;
        }
        synchronized(hftc.class) {
            hftc hftc1 = hftc.c;
            if(hftc1 != null) {
                return hftc1;
            }
            hftc2 = hftn.b(hftc.class);
            hftc.c = hftc2;
        }
        return hftc2;
    }

    public hfta b(MessageLite hfvm0, int v) {
        hftb hftb0 = new hftb(hfvm0, v);
        return (hfta)this.d.get(hftb0);
    }

    public final void c(hfta hfta0) {
        this.d.put(new hftb(hfta0.a, hfta0.a()), hfta0);
    }
}

