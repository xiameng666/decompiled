import android.os.Bundle;
import java.util.Map;

public final class crbw extends crby {
    public final Map a;
    public final Map b;
    public long c;

    public crbw(crkt crkt0) {
        super(crkt0);
        this.b = new bxd();
        this.a = new bxd();
    }

    public final void a(long v, crns crns0) {
        if(crns0 == null) {
            this.aJ().k.a("Not logging ad exposure. No active activity");
            return;
        }
        if(v < 1000L) {
            this.aJ().k.b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(v));
            return;
        }
        Bundle bundle0 = new Bundle();
        bundle0.putLong("_xt", v);
        crqx.H(crns0, bundle0, true);
        this.h().w("am", "_xa", bundle0);
    }

    public final void b(String s, long v, crns crns0) {
        if(crns0 == null) {
            this.aJ().k.a("Not logging ad unit exposure. No active activity");
            return;
        }
        if(v < 1000L) {
            this.aJ().k.b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(v));
            return;
        }
        Bundle bundle0 = new Bundle();
        bundle0.putString("_ai", s);
        bundle0.putLong("_xt", v);
        crqx.H(crns0, bundle0, true);
        this.h().w("am", "_xu", bundle0);
    }

    public final void c(long v) {
        crns crns0 = this.j().s();
        Map map0 = this.a;
        for(Object object0: map0.keySet()) {
            this.b(((String)object0), v - ((long)(((Long)map0.get(((String)object0))))), crns0);
        }
        if(!map0.isEmpty()) {
            this.a(v - this.c, crns0);
        }
        this.d(v);
    }

    public final void d(long v) {
        Map map0 = this.a;
        for(Object object0: map0.keySet()) {
            map0.put(((String)object0), Long.valueOf(v));
        }
        if(!map0.isEmpty()) {
            this.c = v;
        }
    }
}

