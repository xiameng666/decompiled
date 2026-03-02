import android.content.Context;

public final class ckzm extends ckcq {
    public static final ckcr a;
    private final Context b;
    private final bbdu c;

    static {
        ckzm.a = new ckcr(bbed.a, -1);
    }

    public ckzm(Context context0, bbdu bbdu0) {
        ibuq.f(bbdu0, "networkFramework");
        super();
        this.b = context0;
        this.c = bbdu0;
    }

    @Override  // ckcq
    public final bbdz a() {
        return bbdz.a;
    }

    @Override  // ckcq
    public final ckcr b() {
        ibuq.e(ckzm.a, "EMPTY_UID");
        return ckzm.a;
    }

    @Override  // ckcq
    public final void d(ckdh ckdh0) {
        ckzo.a.a(ckdh0, this.b, this.c);
    }
}

