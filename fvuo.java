import java.util.ArrayList;
import java.util.List;

public final class fvuo implements fvtd {
    public final List a;
    public final int b;
    public boolean c;

    public fvuo() {
        this(((int)huvd.c()));
    }

    public fvuo(int v) {
        this.c = false;
        int v1 = Math.min(v, ((int)huvd.c()));
        this.b = v1;
        this.a = new ArrayList(v1);
    }

    public fvuo(fvta fvta0) {
        this.c = false;
        this.b = 1;
        ArrayList arrayList0 = new ArrayList(1);
        this.a = arrayList0;
        arrayList0.add(fvta0);
    }

    @Override  // fvtd
    public final long a(long v, fvwz fvwz0) {
        return fvsz.a(this, v, fvwz0);
    }

    @Override  // fvtd
    public final gged_interceptors b(long v, fvwz fvwz0) {
        return this.c();
    }

    public final gged_interceptors c() {
        return gged_interceptors.i(this.a);
    }

    public final void d(List list0, List list1, fvwz fvwz0, long v) {
        if(list0.size() == list1.size()) {
            for(int v1 = 0; v1 < list0.size(); ++v1) {
                fvtm fvtm0 = (fvtm)list0.get(v1);
                fvtc fvtc0 = (fvtc)list1.get(v1);
                fvta fvta0 = new fvta(fvtc0, fvtm0);
                this.a.add(fvta0);
                fvvj fvvj0 = fvtc0.a;
                int v2 = -1;
                int v3 = fvtm0.c() ? ((int)(v - fvtm0.f)) : -1;
                if(fvvj0 != null && fvvj0.m() != 0L) {
                    v2 = (int)(v - fvvj0.m());
                }
                fwrm.c(fvwz0, 9, v3, v2);
            }
            return;
        }
        this.c = true;
        fwrm.c(fvwz0, 22, list0.size(), list1.size());
    }

    public final void e(fvta fvta0) {
        this.a.add(fvta0);
    }

    public final boolean f() {
        return this.a.size() >= this.b;
    }

    @Override
    public final String toString() {
        return "SimpleBatchScanData: batchSlotCount is " + this.b + ", currentScans has " + this.a.size() + " entries";
    }
}

