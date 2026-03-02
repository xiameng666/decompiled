import android.os.Bundle;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Locale;

public class gaxs {
    private static final clht a;
    private final boolean b;
    public int u;
    public boolean v;
    public byi w;
    public boolean x;
    gged_interceptors y;
    ArrayList z;

    static {
        gaxs.a = new clht(Looper.getMainLooper());
    }

    public gaxs() {
        this.u = 0;
        this.x = false;
        this.y = ggna.a;
        gaxl.a();
        this.b = hzkj.a.b().a();
    }

    public final int aP() {
        return this.w == null ? 0 : this.w.b();
    }

    public static Bundle aQ(long v, Bundle bundle0) {
        return bundle0 == null ? null : bundle0.getBundle(gaxs.ny(v));
    }

    public final gaxs aR(long v) {
        return this.w == null ? null : ((gaxs)this.w.d(v));
    }

    public final gaxs aS(long v, Class class0) {
        gaxs gaxs0 = this.aR(v);
        gftb.m(gaxs0 == null || class0.isAssignableFrom(gaxs0.getClass()), "DataComponent not of expected class. Expected %s, Actual %s", class0, gaxs0);
        return (gaxs)class0.cast(gaxs0);
    }

    public final gaxs aT(int v) {
        return this.w == null ? null : ((gaxs)this.w.f(v));
    }

    public final void aU(long v, gaxs gaxs0) {
        if(this.w == null) {
            this.w = new byi();
        }
        this.w.h(v, gaxs0);
        gaxs0.bh(this.v);
        this.x = true;
        gaxt.a(gaxs0, this.u);
    }

    protected void aV() {
    }

    protected void aW() {
    }

    // Detected as a lambda impl.
    final void aX() {
        ArrayList arrayList0 = this.z;
        if(arrayList0 != null && this.u == 3) {
            int v = arrayList0.size();
            for(int v1 = 0; v1 < v; ++v1) {
                ((Runnable)arrayList0.get(v1)).run();
            }
            this.z.clear();
        }
    }

    public void aY() {
        this.bi(6);
        gged_interceptors gged0 = this.nk();
        int v = ((ggna)gged0).c;
        for(int v1 = 0; v1 < v; ++v1) {
            ((gaxs)gged0.get(v1)).aY();
        }
        this.x = true;
        byi byi0 = this.w;
        if(byi0 != null) {
            byi0.g();
        }
        this.nb();
    }

    public void aZ() {
        this.bi(4);
        gged_interceptors gged0 = this.nk();
        int v = ((ggna)gged0).c;
        for(int v1 = 0; v1 < v; ++v1) {
            ((gaxs)gged0.get(v1)).aZ();
        }
        this.lv();
    }

    public final void ba() {
        this.bi(1);
        gged_interceptors gged0 = this.nk();
        int v = ((ggna)gged0).c;
        for(int v1 = 0; v1 < v; ++v1) {
            ((gaxs)gged0.get(v1)).ba();
        }
    }

    public void bb() {
        this.bi(3);
        this.lw();
        gged_interceptors gged0 = this.nk();
        int v = ((ggna)gged0).c;
        for(int v1 = 0; v1 < v; ++v1) {
            ((gaxs)gged0.get(v1)).bb();
        }
        if(this.b && bbqt.a()) {
            this.aX();
            return;
        }
        if(this.z != null && !this.z.isEmpty()) {
            gaxr gaxr0 = () -> {
                ArrayList arrayList0 = this.z;
                if(arrayList0 != null && this.u == 3) {
                    int v = arrayList0.size();
                    for(int v1 = 0; v1 < v; ++v1) {
                        ((Runnable)arrayList0.get(v1)).run();
                    }
                    this.z.clear();
                }
            };
            gaxs.a.post(gaxr0);
        }
    }

    public final void bc(Bundle bundle0) {
        if(this.u != 5) {
            this.bi(4);
        }
        this.lv();
        this.lx(bundle0);
        int v = this.aP();
        for(int v1 = 0; v1 < v; ++v1) {
            gaxs gaxs0 = this.aT(v1);
            if(gaxs0 != null) {
                Bundle bundle1 = new Bundle();
                gaxs0.bc(bundle1);
                bundle0.putBundle(gaxs.ny((this.w == null ? -1L : this.w.c(v1))), bundle1);
            }
        }
    }

    public final void bd() {
        this.bi(2);
        this.aV();
        gged_interceptors gged0 = this.nk();
        int v = ((ggna)gged0).c;
        for(int v1 = 0; v1 < v; ++v1) {
            ((gaxs)gged0.get(v1)).bd();
        }
    }

    public final void be() {
        this.bi(5);
        gged_interceptors gged0 = this.nk();
        int v = ((ggna)gged0).c;
        for(int v1 = 0; v1 < v; ++v1) {
            ((gaxs)gged0.get(v1)).be();
        }
        this.aW();
    }

    public final void bf(long v) {
        byi byi0 = this.w;
        if(byi0 != null) {
            gaxs gaxs0 = (gaxs)byi0.d(v);
            if(gaxs0 != null) {
                gaxt.a(gaxs0, 6);
                this.w.i(v);
                this.x = true;
            }
        }
    }

    protected final void bg(Runnable runnable0) {
        if(this.u == 3) {
            runnable0.run();
            return;
        }
        if(this.z == null) {
            this.z = new ArrayList(1);
        }
        this.z.add(runnable0);
    }

    public final void bh(boolean z) {
        this.v = z;
        gged_interceptors gged0 = this.nk();
        if(gged0 != null) {
            for(int v = 0; v < ((ggna)gged0).c; ++v) {
                ((gaxs)gged0.get(v)).bh(z);
            }
        }
    }

    final void bi(int v) {
        this.u = v;
        this.nc(v);
    }

    protected void lv() {
    }

    protected void lw() {
    }

    protected void lx(Bundle bundle0) {
    }

    protected void nb() {
    }

    protected void nc(int v) {
    }

    private final gged_interceptors nk() {
        if(this.x) {
            ggdy ggdy0 = new ggdy();
            int v = this.aP();
            for(int v1 = 0; v1 < v; ++v1) {
                gaxs gaxs0 = this.aT(v1);
                if(gaxs0 != null) {
                    ggdy0.i(gaxs0);
                }
            }
            this.y = ggdy0.h();
            this.x = false;
        }
        return this.y;
    }

    private static String ny(long v) {
        return String.format(Locale.US, "lifeCycleChild:%d", v);
    }
}

