// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class dokb extends Enum {
    public static final enum dokb a;
    private static final dokb[] b;

    static {
        dokb.a = new dokb();
        dokb[] arr_dokb = {dokb.a};
        dokb.b = arr_dokb;
        ibsn.a(arr_dokb);
    }

    private dokb() {
        super("LEGIC", 0);
    }

    public static dokb[] values() {
        return (dokb[])dokb.b.clone();
    }
}

