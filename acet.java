import android.support.v7.widget.RecyclerView;
import j..util.Objects;

final class acet extends uc {
    final aceu a;

    public acet(aceu aceu0) {
        Objects.requireNonNull(aceu0);
        this.a = aceu0;
        super();
    }

    @Override  // uc
    public final void a(RecyclerView recyclerView0, int v, int v1) {
        aceu aceu0 = this.a;
        int v2 = Math.max(0, aceu0.c(aceu0.getChildAt(0)));
        int v3 = aceu0.getChildCount();
        int v4 = aceu0.m.b();
        aces aces0 = aceu0.ag;
        if(aces0 != null) {
            if(aces0.j()) {
                if(v4 - v3 > 0 && aces0.d != 2) {
                    aces0.g(aces0.a(v2, v3, v4));
                }
                long v5 = aces0.e == null ? ((long)v2) : aces0.e.dy(v2);
                if(aces0.c != v5) {
                    aces0.c = v5;
                    if(aces0.d != 2) {
                        aces0.f(1);
                        aces0.c();
                    }
                }
            }
            else {
                aces0.f(0);
            }
        }
        aceu0.ac.b();
        uc uc0 = aceu0.ad;
        if(uc0 != null) {
            uc0.a(recyclerView0, v, v1);
        }
    }

    @Override  // uc
    public final void b(int v) {
        this.a.a(v);
    }
}

