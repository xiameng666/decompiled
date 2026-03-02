// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class hnlu extends Enum implements hnlx {
    public static final enum hnlu a;
    private static final hnlu[] c;

    static {
        hnlu.a = new hnlu();
        hnlu.c = new hnlu[]{hnlu.a};
    }

    private hnlu() {
        super("INSTANCE", 0);
    }

    @Override  // hnlx
    public final hnkw a(hnlk hnlk0, hnkt hnkt0) {
        switch(hnkt0.c) {
            case -92: {
                return new hnlr(hnlk0);
            }
            case -88: {
                return new hnlp(hnlk0);
            }
            default: {
                throw new hnlw("Unknown command in PureSelectedState");
            }
        }
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

    public static hnlu[] values() {
        return (hnlu[])hnlu.c.clone();
    }
}

