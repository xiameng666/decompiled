import java.util.concurrent.Callable;

public final class zlz implements Callable {
    public final zmi a;
    public final grxw b;

    public zlz(zmi zmi0, grxw grxw0) {
        this.a = zmi0;
        this.b = grxw0;
    }

    @Override
    public final Object call() {
        String s = aaus.a();
        boolean z = cchl.d();
        int v = ((zjt)this.a.g).f.a();
        zkx zkx0 = ((zjt)this.a.g).d.a(((zjt)this.a.g).c.b, s, this.b, z, this.a.d.a, v);
        return zkx0 == null ? gfsx.l(null) : gfsx.l(zkx0.g);
    }
}

