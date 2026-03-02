// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class clca extends Enum {
    public static final enum clca a;
    private static final clca[] b;

    static {
        clca.a = new clca();
        clca.b = new clca[]{clca.a};
    }

    private clca() {
        super("I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS", 0);
    }

    public static clca[] values() {
        return (clca[])clca.b.clone();
    }
}

