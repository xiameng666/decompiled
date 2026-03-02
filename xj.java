import java.util.List;

final class xj implements Runnable {
    final xp a;
    final xr b;

    public xj(xr xr0, xp xp0) {
        this.b = xr0;
        this.a = xp0;
        super();
    }

    @Override
    public final void run() {
        xr xr0 = this.b;
        if(xr0.m != null && xr0.m.q && (!this.a.n && this.a.h.fp() != -1)) {
            tr tr0 = xr0.m.D;
            if(tr0 == null || !tr0.i()) {
                List list0 = xr0.l;
                int v = list0.size();
                int v1 = 0;
                while(v1 < v) {
                    if(!((xp)list0.get(v1)).o) {
                        goto label_13;
                    }
                    ++v1;
                }
                xr0.j.n();
                return;
            }
        label_13:
            xr0.m.post(this);
        }
    }
}

