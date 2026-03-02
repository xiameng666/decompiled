import android.view.View;
import android.view.WindowInsets;

class kgk extends kgj {
    static final kgq d;

    static {
        kgk.d = kgq.r(WindowInsets.CONSUMED);
    }

    public kgk(kgq kgq0, WindowInsets windowInsets0) {
        super(kgq0, windowInsets0);
    }

    public kgk(kgq kgq0, kgk kgk0) {
        super(kgq0, kgk0);
    }

    @Override  // kgg
    public jxn a(int v) {
        return jxn.f(this.a.getInsets(kgo.a(v)));
    }

    @Override  // kgg
    public jxn c(int v) {
        return jxn.f(this.a.getInsetsIgnoringVisibility(kgo.a(v)));
    }

    @Override  // kgg
    public final void f(View view0) {
    }

    @Override  // kgg
    public boolean n(int v) {
        return this.a.isVisible(kgo.a(v));
    }
}

