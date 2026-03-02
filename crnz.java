import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.measurement.api.internal.ScionActivityInfo;
import j..util.Objects;
import j..util.concurrent.ConcurrentHashMap;
import java.util.Map;

public final class crnz extends crbz {
    public volatile crns a;
    public volatile crns b;
    protected crns c;
    public final Map d;
    public ScionActivityInfo e;
    public volatile boolean f;
    public volatile crns g;
    public crns h;
    public boolean i;
    public final Object j;

    public crnz(crkt crkt0) {
        super(crkt0);
        this.j = new Object();
        this.d = new ConcurrentHashMap();
    }

    @Override  // crbz
    protected final boolean p() {
        return false;
    }

    public final crns q(ScionActivityInfo scionActivityInfo0) {
        Map map0 = this.d;
        Integer integer0 = (int)scionActivityInfo0.a;
        crns crns0 = (crns)map0.get(integer0);
        if(crns0 == null) {
            crns0 = new crns(null, this.x(scionActivityInfo0.b), this.aq().t());
            map0.put(integer0, crns0);
        }
        return this.g == null ? crns0 : this.g;
    }

    public final crns r() {
        this.m();
        return this.a;
    }

    public final crns s() {
        return this.t(false);
    }

    public final crns t(boolean z) {
        this.a();
        this.n();
        if(!z) {
            return this.c;
        }
        return this.c == null ? this.h : this.c;
    }

    final void u(crns crns0, crns crns1, long v, boolean z, Bundle bundle0) {
        long v4;
        this.n();
        boolean z1 = false;
        boolean z2 = crns1 == null || crns1.c != crns0.c || !Objects.equals(crns1.b, crns0.b) || !Objects.equals(crns1.a, crns0.a);
        if(z && this.c != null) {
            z1 = true;
        }
        if(z2) {
            Bundle bundle1 = bundle0 == null ? new Bundle() : new Bundle(bundle0);
            crqx.H(crns0, bundle1, true);
            if(crns1 != null) {
                String s = crns1.a;
                if(s != null) {
                    bundle1.putString("_pn", s);
                }
                String s1 = crns1.b;
                if(s1 != null) {
                    bundle1.putString("_pc", s1);
                }
                bundle1.putLong("_pi", crns1.c);
            }
            if(z1) {
                long v1 = this.l().d.a(v);
                if(v1 > 0L) {
                    this.aq().F(bundle1, v1);
                }
            }
            if(!this.am().w()) {
                bundle1.putLong("_mst", 1L);
            }
            boolean z3 = crns0.e;
            long v2 = System.currentTimeMillis();
            if(z3) {
                long v3 = crns0.f;
                v4 = v3 == 0L ? v2 : v3;
            }
            else {
                v4 = v2;
            }
            long v5 = this.am().t(crif.aT) ? SystemClock.elapsedRealtime() : 0L;
            if(z3) {
                long v6 = crns0.g;
                if(v6 != 0L) {
                    v5 = v6;
                }
            }
            this.h().x((z3 ? "app" : "auto"), "_vs", v4, v5, bundle1);
        }
        if(z1) {
            this.w(this.c, true, v);
        }
        this.c = crns0;
        if(crns0.e) {
            this.h = crns0;
        }
        this.k().A(crns0);
    }

    public final void v(ScionActivityInfo scionActivityInfo0, Bundle bundle0) {
        if(this.am().w() && bundle0 != null) {
            Bundle bundle1 = bundle0.getBundle("com.google.app_measurement.screen_service");
            if(bundle1 != null) {
                crns crns0 = new crns(bundle1.getString("name"), bundle1.getString("referrer_name"), bundle1.getLong("id"));
                this.d.put(Integer.valueOf(scionActivityInfo0.a), crns0);
            }
        }
    }

    public final void w(crns crns0, boolean z, long v) {
        this.e().c(SystemClock.elapsedRealtime());
        boolean z1 = crns0 != null && crns0.d;
        if(this.l().s(z1, z, v) && crns0 != null) {
            crns0.d = false;
        }
    }

    final String x(String s) {
        if(s == null) {
            return "Activity";
        }
        String[] arr_s = s.split("\\.");
        String s1 = arr_s.length <= 0 ? "" : arr_s[arr_s.length - 1];
        return s1.length() <= this.am().b(null, false) ? s1 : s1.substring(0, this.am().b(null, false));
    }
}

