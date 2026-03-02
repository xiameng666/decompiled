import android.content.Context;

public final class govb extends goua {
    private final String e;
    private final String f;

    public govb(String s, String s1, goxi goxi0, String s2, String s3, goxg goxg0) {
        super(s, s1, goxi0, goxg0, "UnlinkFederatedCredential");
        this.e = s2;
        this.f = s3;
    }

    @Override  // goua
    protected final void b(Context context0, gowy gowy0) {
        batl.q(this.e);
        batl.q(this.f);
        gowc gowc0 = new gowc(gowy0, this.e, this.a);
        gowy0.a(this.f, gowc0);
    }
}

