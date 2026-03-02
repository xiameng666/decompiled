import android.view.View;
import android.view.WindowInsets;

final class jmo extends ibur implements ibts {
    final jmw a;
    final ify b;

    public jmo(jmw jmw0, ify ify0) {
        this.a = jmw0;
        this.b = ify0;
        super(1);
    }

    @Override  // ibts
    public final Object a(Object object0) {
        jmw jmw0 = this.a;
        jmy.d(jmw0, this.b);
        jmw0.d.A();
        View view0 = jmw0.c;
        int v = jmw0.n[0];
        int v1 = jmw0.n[1];
        view0.getLocationOnScreen(jmw0.n);
        long v2 = jmw0.o;
        long v3 = ((hzk)object0).g();
        jmw0.o = v3;
        kgq kgq0 = jmw0.p;
        if(kgq0 != null && (v != jmw0.n[0] || v1 != jmw0.n[1] || !jlk.c(v2, v3))) {
            WindowInsets windowInsets0 = jmw0.k(kgq0).e();
            if(windowInsets0 != null) {
                view0.dispatchApplyWindowInsets(windowInsets0);
            }
        }
        return ibom.a;
    }
}

