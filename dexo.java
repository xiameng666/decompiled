// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class dexo extends Enum {
    public static final enum dexo a;
    private static final dexo[] b;

    static {
        dexo.a = new dexo();
        dexo[] arr_dexo = {dexo.a};
        dexo.b = arr_dexo;
        ibsn.a(arr_dexo);
    }

    private dexo() {
        super("LOG_IN", 0);
    }

    public static dexo[] values() {
        return (dexo[])dexo.b.clone();
    }
}

