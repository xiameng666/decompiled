import java.util.logging.Level;

public final class ggsf extends ggrv {
    public static final ggse a;

    static {
        ggsf.a = new ggse();
    }

    public ggsf(ggtx ggtx0) {
        super(ggtx0);
    }

    public final ggsc a(Level level0) {
        boolean z = this.m(level0);
        gguv.n(this.k(), level0, z);
        return !z ? ggsf.a : new ggsd(this, level0);
    }

    @Deprecated
    public static ggsf b(String s) {
        ggwv.a(((boolean)(s.isEmpty() ^ 1)), "injected class name is empty");
        return new ggsf(gguv.d(s.replace('/', '.')));
    }

    @Override  // ggrv
    public final ggsu f(Level level0) {
        return this.a(level0);
    }
}

