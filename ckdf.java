// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class ckdf extends Enum {
    public static final enum ckdf a;
    private static final ckdf[] b;

    static {
        ckdf.a = new ckdf();
        ckdf.b = new ckdf[]{ckdf.a};
    }

    private ckdf() {
        super("I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS", 0);
    }

    public static ckdf[] values() {
        return (ckdf[])ckdf.b.clone();
    }
}

