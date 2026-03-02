// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class cywp extends Enum {
    public static final enum cywp a;
    public final String b;
    private static final cywp[] c;

    static {
        cywp.a = new cywp();
        cywp[] arr_cywp = {cywp.a};
        cywp.c = arr_cywp;
        ibsn.a(arr_cywp);
    }

    private cywp() {
        super("LE_AUDIO_SHARING", 0);
        this.b = "le_audio_sharing";
    }

    public static cywp[] values() {
        return (cywp[])cywp.c.clone();
    }
}

