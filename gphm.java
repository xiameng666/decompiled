// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class gphm extends Enum {
    public static final enum gphm a;
    private static final gphm[] b;

    static {
        gphm.a = new gphm();
        gphm.b = new gphm[]{gphm.a};
    }

    private gphm() {
        super("I_AM_THE_RPC_LIB", 0);
    }

    public static gphm[] values() {
        return (gphm[])gphm.b.clone();
    }
}

