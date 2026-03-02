import android.content.Context;

public final class ebfj extends ebhb {
    public static final ebfi a;
    private final Context b;
    private final fsxg c;

    static {
        ebfj.a = new ebfi();
    }

    public ebfj(Context context0, fsxg fsxg0) {
        this.b = context0;
        this.c = fsxg0;
    }

    @Override  // ebhb
    public final ftcg a() {
        gftb.g(((boolean)(bbqr.d(this.c.b) ^ 1)), "ProvisioningId is required", new Object[0]);
        cjky cjky0 = new cjky(this.b);
        cjlv.n(new cjlv(this.b, cjky0), null, this.c.b.hashCode(), 5);
        return ftch.a(((ProtoLiteMessage)ftcg.a).v_newBuilder()).a();
    }
}

