// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class hnlt extends Enum implements hnlx {
    public static final enum hnlt a;
    private static final hnlt[] c;

    static {
        hnlt.a = new hnlt();
        hnlt.c = new hnlt[]{hnlt.a};
    }

    private hnlt() {
        super("INSTANCE", 0);
    }

    @Override  // hnlx
    public final hnkw a(hnlk hnlk0, hnkt hnkt0) {
        switch(hnkt0.c) {
            case -92: {
                return new hnlr(hnlk0);
            }
            case -82: {
                return new hnln(hnlk0);
            }
            case -78: {
                return new hnlq(hnlk0);
            }
            default: {
                throw new hnlw("Unknown command in PureInitializedState");
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

    public static hnlt[] values() {
        return (hnlt[])hnlt.c.clone();
    }
}

