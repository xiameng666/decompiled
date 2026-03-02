import java.util.concurrent.Executor;

public final class cyoj extends cyoi {
    public cyoj(cyqx cyqx0, cynb cynb0, cylu cylu0, kba kba0, bbqb bbqb0, cyom cyom0, Executor executor0) {
        super(cyqx0, cynb0, cylu0, kba0, bbqb0, cyom0, executor0);
    }

    @Override  // cyoi
    public final gmcd a(int v, boolean z, boolean z1) {
        if(this.s(v)) {
            ggtj ggtj0 = (ggtj)this.o.g().ar(7970);
            String s = fgjo.c(this.c.a);
            ggtj0.B("SinglePointConnectionHelper: Ignore connectAndSetActive to %s since it is already connected and active", gxyf.b(gxye.a, s));
            return gmbu.i(new cyql(cyqm.a, 1));
        }
        return this.i(v, z, z1);
    }

    @Override  // cyoi
    protected final gmcd b(boolean z, boolean z1, boolean z2) {
        return this.j(z1, z2);
    }

    @Override  // cyoi
    public final boolean d(int v) {
        return this.s(v);
    }

    @Override  // cyoi
    public final boolean e() {
        return false;
    }
}

