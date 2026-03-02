// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class clbk extends Enum {
    public static final enum clbk a;
    private static final clbk[] b;

    static {
        clbk.a = new clbk();
        clbk.b = new clbk[]{clbk.a};
    }

    private clbk() {
        super("I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS", 0);
    }

    public static clbk[] values() {
        return (clbk[])clbk.b.clone();
    }
}

