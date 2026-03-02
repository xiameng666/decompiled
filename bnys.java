import android.content.Context;
import java.util.concurrent.Executor;

public final class bnys implements bnym {
    public static final bboh a;
    public final fqxf b;
    public final bpls c;
    public final bpam d;
    public final Context e;
    private final fquu f;
    private final Executor g;

    static {
        bnys.a = bboh.b("ProvisioningResultProc", bbcu.eD);
    }

    public bnys(Context context0, fquu fquu0, fqxf fqxf0, bpls bpls0, bpam bpam0, Executor executor0) {
        this.e = context0;
        this.f = fquu0;
        this.b = fqxf0;
        this.c = bpls0;
        this.d = bpam0;
        this.g = executor0;
    }

    @Override  // bnym
    public final gmcd a(fqra fqra0) {
        if(fqra0.a()) {
            gfsx gfsx0 = fqra0.g;
            if(gfsx0.i()) {
                gtbr gtbr0 = (gtbr)gfsx0.d();
                this.d.b(fqra0.a, fqra0.b, gtbr0);
            }
        }
        fquv fquv0 = new fquv(null);
        fquv0.c(fqra0.a);
        fquv0.e(fqra0.c);
        gfsx gfsx1 = fqra0.f;
        if(gfsx1 == null) {
            throw new NullPointerException("Null advertisingDeviceDetails");
        }
        fquv0.a = gfsx1;
        fquv0.d(fqra0.e);
        fquv0.b = gfsx.m(fqra0.d);
        fquw fquw0 = fquv0.a();
        gdta gdta0 = gdta.g(this.f.b(fqra0.b, fquw0));
        bnyn bnyn0 = new bnyn();
        return gdta0.e(Exception.class, bnyn0, gmap.a).i(new bnyo(this, fqra0), this.g).i(new bnyp(this), gmap.a).h(new bnyq(this, fqra0), this.g);
    }
}

