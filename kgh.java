import android.view.WindowInsets;

class kgh extends kgg {
    private jxn d;

    public kgh(kgq kgq0, WindowInsets windowInsets0) {
        super(kgq0, windowInsets0);
        this.d = null;
    }

    public kgh(kgq kgq0, kgh kgh0) {
        super(kgq0, kgh0);
        this.d = null;
        this.d = kgh0.d;
    }

    @Override  // kgn
    public final jxn p() {
        if(this.d == null) {
            WindowInsets windowInsets0 = this.a;
            this.d = jxn.e(windowInsets0.getStableInsetLeft(), windowInsets0.getStableInsetTop(), windowInsets0.getStableInsetRight(), windowInsets0.getStableInsetBottom());
        }
        return this.d;
    }

    @Override  // kgn
    public kgq q() {
        return kgq.r(this.a.consumeStableInsets());
    }

    @Override  // kgn
    public kgq r() {
        return kgq.r(this.a.consumeSystemWindowInsets());
    }

    @Override  // kgn
    public boolean s() {
        return this.a.isConsumed();
    }
}

