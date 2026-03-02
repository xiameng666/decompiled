import android.content.Context;

public final class ebgn extends ebhb {
    public static final ebgm a;
    private final Context b;
    private final String c;

    static {
        ebgn.a = new ebgm();
    }

    public ebgn(Context context0, String s) {
        this.b = context0;
        this.c = s;
    }

    @Override  // ebhb
    public final ftcg a() {
        long v = hwmp.e();
        dtyp.a(this.b, this.c, 0L, v);
        ibuq.e(ftcg.a, "getDefaultInstance(...)");
        return ftcg.a;
    }
}

