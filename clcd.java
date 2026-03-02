// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class clcd extends Enum {
    public static final enum clcd a;
    private static final clcd[] b;

    static {
        clcd.a = new clcd();
        clcd.b = new clcd[]{clcd.a};
    }

    private clcd() {
        super("I_HAVE_PERMISSION_TO_USE_RESTRICTED_APIS", 0);
    }

    public static clcd[] values() {
        return (clcd[])clcd.b.clone();
    }
}

