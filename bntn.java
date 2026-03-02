import com.google.android.gms.common.api.Status;

public final class bntn implements glzn {
    public final bntq a;
    public final bnzj b;
    public final gfsx c;
    public final boolean d;
    public final gfsx e;

    public bntn(bntq bntq0, bnzj bnzj0, gfsx gfsx0, boolean z, gfsx gfsx1) {
        this.a = bntq0;
        this.b = bnzj0;
        this.c = gfsx0;
        this.d = z;
        this.e = gfsx1;
    }

    @Override  // glzn
    public final gmcd a(Object object0) {
        int v1;
        int v = ((bnzo)object0).b;
        boolean z = true;
        switch(v - 1) {
            case 1: {
                v1 = 46503;
                goto label_8;
            }
            case 2: 
            case 4: 
            case 6: {
                gftb.q(((bnzo)object0).a.i());
                v1 = ((Status)((bnzo)object0).a.d()).i;
            label_8:
                gfsx gfsx0 = this.e;
                boolean z1 = this.d;
                gfsx gfsx1 = this.c;
                bnzj bnzj0 = this.b;
                bntq bntq0 = this.a;
                if(v1 <= 0) {
                    z = false;
                }
                gftb.q(z);
                bprh bprh0 = bprh.a(v1);
                int v2 = bogc.b(gfsx0);
                return gmbu.h(new bnyt(new Status(v1, "User input required to initialize Keychain", bogd.a(bntq0.e, bnzj0, bntq0.d, gfsx1, bprh0, z1, v2)), bntq0.d, bnzj0, gfsx1, gfsx0));
            }
            case 8: 
            case 9: {
                return gmbx.a;
            }
            default: {
                return gmbu.h(new IllegalStateException("syncOwnerKey arrived at unexpected state " + bnzn.a(v)));
            }
        }
    }
}

