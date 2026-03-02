// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
final class cbpv extends Enum {
    public static final enum cbpv a;
    private static final cbpv[] b;

    static {
        cbpv.a = new cbpv();
        cbpv[] arr_cbpv = {cbpv.a};
        cbpv.b = arr_cbpv;
        ibsn.a(arr_cbpv);
    }

    private cbpv() {
        super("CREATE_CHILD", 0);
    }

    public static cbpv[] values() {
        return (cbpv[])cbpv.b.clone();
    }
}

