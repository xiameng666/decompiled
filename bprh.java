// PARTIAL FAILURE: ENUM SUGARING
// The enumeration is rendered as-is instead of being sugared into a Java 5 enum.
public final class bprh extends Enum {
    public static final enum bprh a;
    public static final enum bprh b;
    public static final enum bprh c;
    public final boolean d;
    public final gfsx e;
    public final gfsx f;
    public final int g;
    private static final bprh[] h;
    private final int i;

    static {
        bprh.a = new bprh("SIGN_IN", 0, 46500, 2, fqyi.Y, fqyi.W);
        bprh.b = new bprh("LSKF_CHALLENGE", 1, 46502, 3, fqyi.Z, fqyi.X);
        bprh.c = new bprh();
        bprh.h = new bprh[]{bprh.a, bprh.b, bprh.c};
    }

    private bprh() {
        super("LOCK_SCREEN_REQUIRED", 2);
        this.i = 46503;
        this.g = 4;
        this.d = false;
        this.e = gfqx.a;
        this.f = gfqx.a;
    }

    private bprh(String s, int v, int v1, int v2, fqyi fqyi0, fqyi fqyi1) {
        super(s, v);
        this.i = v1;
        this.g = v2;
        this.d = true;
        this.e = gfsx.m(fqyi0);
        this.f = gfsx.m(fqyi1);
    }

    public static bprh a(int v) {
        bprh[] arr_bprh = bprh.values();
        for(int v1 = 0; v1 < arr_bprh.length; ++v1) {
            bprh bprh0 = arr_bprh[v1];
            if(bprh0.i == v) {
                return bprh0;
            }
        }
        throw new IllegalStateException("Unexpected status code " + v);
    }

    public static bprh b(String s) {
        return (bprh)Enum.valueOf(bprh.class, s);
    }

    public static bprh[] values() {
        return (bprh[])bprh.h.clone();
    }
}

