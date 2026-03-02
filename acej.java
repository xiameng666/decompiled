import android.view.ViewGroup.LayoutParams;
import j..util.Objects;

final class acej extends tm {
    final acek a;

    public acej(acek acek0) {
        Objects.requireNonNull(acek0);
        this.a = acek0;
        super();
    }

    @Override  // tm
    public final void a() {
        this.a.a();
    }

    @Override  // tm
    public final void b(int v, int v1) {
        for(int v2 = 0; v2 < v1; ++v2) {
            int v3 = v + v2;
            uq uq0 = (uq)this.a.b.get(v3);
            this.a.a.p(uq0, v3);
        }
    }

    @Override  // tm
    public final void d(int v, int v1) {
        for(int v2 = 0; v2 < v1; ++v2) {
            int v3 = v + v2;
            tk tk0 = this.a.a;
            uq uq0 = tk0.o(this.a, tk0.dx(v3));
            this.a.a.p(uq0, v3);
            ViewGroup.LayoutParams viewGroup$LayoutParams0 = new ViewGroup.LayoutParams(-1, -2);
            this.a.c.addView(uq0.a, v3, viewGroup$LayoutParams0);
            this.a.b.add(v3, uq0);
        }
    }

    @Override  // tm
    public final void e(int v, int v1) {
        for(int v2 = 0; v2 < v1; ++v2) {
            this.a.c.removeViewAt(v);
            this.a.b.remove(v);
        }
    }

    @Override  // tm
    public final void g(int v, int v1) {
        this.a.a();
    }
}

