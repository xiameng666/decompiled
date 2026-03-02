// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class aset extends Enum {
    public static final enum aset a;
    private static final aset[] b;

    static {
        aset.a = new aset();
        aset[] arr_aset = {aset.a};
        aset.b = arr_aset;
        ibsn.a(arr_aset);
    }

    private aset() {
        super("PHOTOS_BACKUP_OPT_OUT_ALERT", 0);
    }

    public static aset[] values() {
        return (aset[])aset.b.clone();
    }
}

