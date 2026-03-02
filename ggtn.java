import java.util.logging.Level;

public final class ggtn extends ggtl {
    public ggtn(ggtx ggtx0) {
        super(ggtx0);
    }

    public final ggtj a(Level level0) {
        boolean z = this.m(level0);
        gguv.n(this.k(), level0, z);
        return !z ? ggtn.c : new ggtm(this, level0);
    }

    public static ggtn b(String s) {
        return new ggtn(gguv.d(s));
    }

    public static ggtn c(String s) {
        return new ggtn(ggvo.c.a(s));
    }

    public static ggtn d() {
        return new ggtn(gguv.d(gguv.g().b(ggtn.class)));
    }

    @Override  // ggrv
    public final ggsu f(Level level0) {
        return this.a(level0);
    }
}

