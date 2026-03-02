import android.view.WindowInsets;

class kgj extends kgi {
    private jxn d;
    private jxn e;
    private jxn h;

    public kgj(kgq kgq0, WindowInsets windowInsets0) {
        super(kgq0, windowInsets0);
        this.d = null;
        this.e = null;
        this.h = null;
    }

    public kgj(kgq kgq0, kgj kgj0) {
        super(kgq0, kgj0);
        this.d = null;
        this.e = null;
        this.h = null;
    }

    @Override  // kgg
    public kgq e(int v, int v1, int v2, int v3) {
        return kgq.r(this.a.inset(v, v1, v2, v3));
    }

    @Override  // kgn
    public jxn v() {
        if(this.e == null) {
            this.e = jxn.f(this.a.getMandatorySystemGestureInsets());
        }
        return this.e;
    }

    @Override  // kgn
    public jxn w() {
        if(this.d == null) {
            this.d = jxn.f(this.a.getSystemGestureInsets());
        }
        return this.d;
    }

    @Override  // kgn
    public jxn x() {
        if(this.h == null) {
            this.h = jxn.f(this.a.getTappableElementInsets());
        }
        return this.h;
    }
}

