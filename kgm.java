import android.view.WindowInsets;

final class kgm extends kgl {
    static final kgq e;

    static {
        kgm.e = kgq.r(WindowInsets.CONSUMED);
    }

    public kgm(kgq kgq0, WindowInsets windowInsets0) {
        super(kgq0, windowInsets0);
    }

    public kgm(kgq kgq0, kgm kgm0) {
        super(kgq0, kgm0);
    }

    @Override  // kgk
    public jxn a(int v) {
        return jxn.f(this.a.getInsets(kgp.a(v)));
    }

    @Override  // kgk
    public jxn c(int v) {
        return jxn.f(this.a.getInsetsIgnoringVisibility(kgp.a(v)));
    }

    @Override  // kgk
    public boolean n(int v) {
        return this.a.isVisible(kgp.a(v));
    }
}

