import java.util.HashMap;
import java.util.Map;

public final class eklt {
    public final ekln a;
    public final ekku b;
    public final ejze c;
    public final gmcg d;
    public final Map e;
    private static eklt f;

    private eklt(ekln ekln0, ekku ekku0, ejze ejze0) {
        this.a = ekln0;
        this.b = ekku0;
        this.c = ejze0;
        this.e = new HashMap();
        this.d = new bblp(0x7FFFFFFF, 9);
    }

    public final ejyy a(String s) {
        return (ejyy)this.e.get(s);
    }

    public static eklt b(ekln ekln0, ekku ekku0, ejze ejze0) {
        synchronized(eklt.class) {
            if(eklt.f == null) {
                eklt.f = new eklt(ekln0, ekku0, ejze0);
            }
        }
        return eklt.f;
    }
}

