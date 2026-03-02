// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class cjes extends Enum {
    public static final enum cjes a;
    private static final cjes[] b;

    static {
        cjes.a = new cjes();
        cjes.b = new cjes[]{cjes.a};
    }

    private cjes() {
        super("ALLOWED", 0);
    }

    public static cjes[] values() {
        return (cjes[])cjes.b.clone();
    }
}

