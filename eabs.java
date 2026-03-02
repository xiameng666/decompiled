import android.content.Context;
import android.content.Intent;

final class eabs extends eabu {
    @Override  // eabu
    public final gfsx a(eagu eagu0, Context context0) {
        dyna dyna0 = dyna.b(eagu0.c) == null ? dyna.k : dyna.b(eagu0.c);
        if(dzau.k(dyna0)) {
            return gfsx.m(dlnf.ah(context0, eagu0, gfqx.a, false));
        }
        if(!dylv.c.contains(dyna0) && !dylv.b.contains(dyna0)) {
            return gfqx.a;
        }
        gfsx gfsx0 = this.a;
        boolean z = this.c();
        switch((eagt.b(eagu0.d) == null ? eagt.k : eagt.b(eagu0.d)).ordinal()) {
            case 4: {
                return (dyna.b(eagu0.c) == null ? dyna.k : dyna.b(eagu0.c)).equals(dyna.h) ? gfsx.m(eaca.b(eagu0, context0, gfsx0, z)) : gfsx.m(new Intent("com.google.android.gms.pay.secard.view.provision.PROVISION_OPEN_EXTERNAL_APP_FRAGMENT").setClassName(context0, "com.google.android.gms.pay.main.PayActivity").putExtra("SecureElementProvisionData", eagu0.toBytesArray()));
            }
            case 5: {
                return gfsx.m(eaca.b(eagu0, context0, gfsx0, z));
            }
            case 1: 
            case 2: 
            case 3: 
            case 6: 
            case 7: {
                return gfsx.m(eaca.b(eagu0, context0, gfsx0, z));
            }
            default: {
                return gfqx.a;
            }
        }
    }

    @Override  // eabu
    public final void b(eagu eagu0) {
        super.b(eagu0);
        dyna dyna0 = dyna.b(eagu0.c) == null ? dyna.k : dyna.b(eagu0.c);
        if(!dylv.c.contains(dyna0)) {
            dyna dyna1 = dyna.b(eagu0.c) == null ? dyna.k : dyna.b(eagu0.c);
            if(!dylv.b.contains(dyna1)) {
                return;
            }
        }
        gftb.b(((boolean)((eagt.b(eagu0.d) == null ? eagt.k : eagt.b(eagu0.d)).equals(eagt.a) ^ 1)), "Purpose must populated back from Provision onboard fragment.");
    }
}

