// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class clcb extends Enum {
    public static final enum clcb a;
    private static final clcb[] b;

    static {
        clcb.a = new clcb();
        clcb.b = new clcb[]{clcb.a};
    }

    private clcb() {
        super("I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS", 0);
    }

    public static clcb[] values() {
        return (clcb[])clcb.b.clone();
    }
}

