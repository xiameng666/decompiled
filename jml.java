import java.util.List;

public final class jml implements iau {
    final jmw a;
    final ify b;

    public jml(jmw jmw0, ify ify0) {
        this.a = jmw0;
        this.b = ify0;
        super();
    }

    @Override  // iau
    public final int a(hzg hzg0, List list0, int v) {
        return this.f(v);
    }

    @Override  // iau
    public final int b(hzg hzg0, List list0, int v) {
        return this.g(v);
    }

    @Override  // iau
    public final int c(hzg hzg0, List list0, int v) {
        return this.f(v);
    }

    @Override  // iau
    public final int d(hzg hzg0, List list0, int v) {
        return this.g(v);
    }

    @Override  // iau
    public final iav e(iax iax0, List list0, long v) {
        jmw jmw0 = this.a;
        if(jmw0.getChildCount() == 0) {
            return iaw.b(iax0, jkp.d(v), jkp.c(v), jmj.a);
        }
        if(jkp.d(v) != 0) {
            jmw0.getChildAt(0).setMinimumWidth(jkp.d(v));
        }
        if(jkp.c(v) != 0) {
            jmw0.getChildAt(0).setMinimumHeight(jkp.c(v));
        }
        jmw0.measure(jmw.n(jkp.d(v), jkp.b(v), jmw0.getLayoutParams().width), jmw.n(jkp.c(v), jkp.a(v), jmw0.getLayoutParams().height));
        return iaw.b(iax0, jmw0.getMeasuredWidth(), jmw0.getMeasuredHeight(), new jmk(jmw0, this.b));
    }

    private final int f(int v) {
        int v1 = jmw.n(0, v, this.a.getLayoutParams().width);
        this.a.measure(v1, 0);
        return this.a.getMeasuredHeight();
    }

    private final int g(int v) {
        int v1 = jmw.n(0, v, this.a.getLayoutParams().height);
        this.a.measure(0, v1);
        return this.a.getMeasuredWidth();
    }
}

