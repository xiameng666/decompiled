import com.google.android.gms.cast.ApplicationMetadata;
import com.google.android.gms.cast.internal.ApplicationStatus;
import com.google.android.gms.cast.internal.DeviceStatus;
import j..util.Objects;
import java.util.ArrayList;

final class aucq implements aubh {
    final aucs a;

    public aucq(aucs aucs0) {
        Objects.requireNonNull(aucs0);
        this.a = aucs0;
        super();
    }

    @Override  // aubh
    public final void h(int v) {
        ArrayList arrayList0 = new ArrayList(this.a.n);
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            ((aubj)arrayList0.get(v2)).e.h(v);
        }
    }

    @Override  // aubh
    public final void hh(ApplicationMetadata applicationMetadata0, String s, String s1, boolean z) {
        this.a.i.h(s1, this.a, this.a.j);
        ArrayList arrayList0 = new ArrayList(this.a.n);
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((aubj)arrayList0.get(v1)).e.hh(applicationMetadata0, s, s1, z);
        }
    }

    @Override  // aubh
    public final void hi(int v) {
        ArrayList arrayList0 = new ArrayList(this.a.n);
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            ((aubj)arrayList0.get(v2)).e.hi(v);
        }
    }

    @Override  // aubh
    public final void hj(int v, String s) {
        this.a.i.m(s, this.a);
        ArrayList arrayList0 = new ArrayList(this.a.n);
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            ((aubj)arrayList0.get(v2)).e.hj(v, s);
        }
    }

    @Override  // aubh
    public final void hk(ApplicationStatus applicationStatus0) {
        ArrayList arrayList0 = new ArrayList(this.a.n);
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((aubj)arrayList0.get(v1)).e.hk(applicationStatus0);
        }
    }

    @Override  // aubh
    public final void hl(int v, String s) {
        ArrayList arrayList0 = new ArrayList(this.a.n);
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            ((aubj)arrayList0.get(v2)).e.hl(v, s);
        }
    }

    @Override  // aubh
    public final void hm(String s, byte[] arr_b) {
        ArrayList arrayList0 = new ArrayList(this.a.n);
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((aubj)arrayList0.get(v1)).e.hm(s, arr_b);
        }
    }

    @Override  // aubh
    public final void hn(boolean z) {
        ArrayList arrayList0 = new ArrayList(this.a.n);
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((aubj)arrayList0.get(v1)).e.hn(z);
        }
    }

    @Override  // aubh
    public final void hw() {
        ArrayList arrayList0 = new ArrayList(this.a.n);
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((aubj)arrayList0.get(v1)).e.hw();
        }
    }

    @Override  // aubh
    public final void i(int v) {
    }

    @Override  // aubh
    public final void j(DeviceStatus deviceStatus0) {
        ArrayList arrayList0 = new ArrayList(this.a.n);
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((aubj)arrayList0.get(v1)).e.j(deviceStatus0);
        }
    }

    @Override  // aubh
    public final void k(int v) {
        this.a.i.m(this.a.k, this.a);
        ArrayList arrayList0 = new ArrayList(this.a.n);
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            ((aubj)arrayList0.get(v2)).e.k(v);
        }
    }

    @Override  // aubh
    public final void l(String s, long v) {
        ArrayList arrayList0 = new ArrayList(this.a.n);
        int v1 = arrayList0.size();
        for(int v2 = 0; v2 < v1; ++v2) {
            ((aubj)arrayList0.get(v2)).e.l(s, v);
        }
    }

    @Override  // aubh
    public final void m(String s, long v, int v1) {
        ArrayList arrayList0 = new ArrayList(this.a.n);
        int v2 = arrayList0.size();
        for(int v3 = 0; v3 < v2; ++v3) {
            ((aubj)arrayList0.get(v3)).e.m(s, v, v1);
        }
    }

    @Override  // aubh
    public final void n(String s, double f, boolean z) {
        ArrayList arrayList0 = new ArrayList(this.a.n);
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((aubj)arrayList0.get(v1)).e.n(s, f, z);
        }
    }

    @Override  // aubh
    public final void o(String s, String s1) {
        ArrayList arrayList0 = new ArrayList(this.a.n);
        int v = arrayList0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            ((aubj)arrayList0.get(v1)).e.o(s, s1);
        }
    }
}

