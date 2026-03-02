// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class hnls extends Enum implements hnlx {
    public static final enum hnls a;
    private static final hnls[] c;

    static {
        hnls.a = new hnls();
        hnls.c = new hnls[]{hnls.a};
    }

    private hnls() {
        super("INSTANCE", 0);
    }

    @Override  // hnlx
    public final hnkw a(hnlk hnlk0, hnkt hnkt0) {
        if(hnkt0.c == -92) {
            return new hnlr(hnlk0);
        }
        throw new hnlw("Unknown command in PureIdleState");
    }

    @Override  // hnlx
    public final hnkx b(hnlk hnlk0, hnkt hnkt0) {
        return hnlv.a(this, hnlk0, hnkt0);
    }

    @Override  // hnlx
    public final boolean c(hnkt hnkt0) {
        return hnlv.b(hnkt0);
    }

    @Override  // hnlx
    public final boolean d(hnkt hnkt0) {
        return hnlv.c(hnkt0);
    }

    public static hnls[] values() {
        return (hnls[])hnls.c.clone();
    }
}

