// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class clbj extends Enum {
    public static final enum clbj a;
    private static final clbj[] b;

    static {
        clbj.a = new clbj();
        clbj.b = new clbj[]{clbj.a};
    }

    private clbj() {
        super("I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS", 0);
    }

    public static clbj[] values() {
        return (clbj[])clbj.b.clone();
    }
}

