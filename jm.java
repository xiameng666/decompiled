import android.view.View;

final class jm extends kfu {
    final ka a;

    public jm(ka ka0) {
        this.a = ka0;
        super();
    }

    @Override  // kfu
    public final void a(View view0) {
        this.a.p.setAlpha(1.0f);
        this.a.s.h(null);
        this.a.s = null;
    }

    @Override  // kfu
    public final void b() {
        ka ka0 = this.a;
        ka0.p.setVisibility(0);
        if((ka0.p.getParent() instanceof View)) {
            ((View)ka0.p.getParent()).requestApplyInsets();
        }
    }
}

