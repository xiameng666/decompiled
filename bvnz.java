import android.content.Intent;
import dagger.assisted.Assisted;
import dagger.assisted.AssistedInject;

public final class bvnz implements ccrn {
    private static final bboh a;
    private final bvnu b;
    private final String c;
    private final cmfb d;

    static {
        bvnz.a = bboh.b("FeatureDrops", bbcu.eN);
    }

    @AssistedInject
    public bvnz(bvnu bvnu0, @Assisted String s, @Assisted cmfb cmfb0) {
        ibuq.f(s, "accountName");
        super();
        this.b = bvnu0;
        this.c = s;
        this.d = cmfb0;
    }

    public final Object b(ibrl ibrl0) {
        hgnr hgnr0;
        gdqb gdqb1;
        Throwable throwable1;
        Object object2;
        bvny bvny0;
        if((ibrl0 instanceof bvny)) {
            bvny0 = (bvny)ibrl0;
            int v = bvny0.c;
            if((v & 0x80000000) == 0) {
                bvny0 = new bvny(this, ibrl0);
            }
            else {
                bvny0.c = v - 0x80000000;
            }
        }
        else {
            bvny0 = new bvny(this, ibrl0);
        }
        Object object0 = bvny0.a;
        Object object1 = ibrx.a;
        switch(bvny0.c) {
            case 0: {
                ibnx.b(object0);
                if(htwh.c()) {
                    gdqb gdqb0 = gdsp.c("getCurrentDropsCampaignStatus");
                    try {
                        bvny0.d = gdqb0;
                        bvny0.c = 1;
                        object2 = this.b.d(this.c, bvny0);
                    }
                    catch(Throwable throwable0) {
                        throwable1 = throwable0;
                        gdqb1 = gdqb0;
                        throw throwable1;
                    }
                    if(object2 == object1) {
                        return object1;
                    }
                    try {
                        gdqb1 = gdqb0;
                        hgnr0 = (hgnr)object2;
                        goto label_44;
                    }
                    catch(Throwable throwable2) {
                        goto label_39;
                    }
                }
                else {
                    bvny0.c = 2;
                    object0 = this.b.d(this.c, bvny0);
                    if(object0 == object1) {
                        return object1;
                    }
                    hgnr0 = (hgnr)object0;
                }
                break;
            }
            case 1: {
                try {
                    gdqb1 = bvny0.d;
                    ibnx.b(object0);
                    hgnr0 = (hgnr)object0;
                    goto label_44;
                }
                catch(Throwable throwable2) {
                label_39:
                    throwable1 = throwable2;
                }
                try {
                    throw throwable1;
                }
                catch(Throwable throwable3) {
                    ibsx.a(gdqb1, throwable1);
                    throw throwable3;
                }
            label_44:
                ibsx.a(gdqb1, null);
                break;
            }
            case 2: {
                ibnx.b(object0);
                hgnr0 = (hgnr)object0;
                break;
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        if(hgnr0 != null && hgnr0.c) {
            Intent intent0 = new Intent("android.intent.action.VIEW").setClassName("com.google.android.gms", "com.google.android.gms.growth.featuredrops.activity.FeatureDropsActivity").putExtra("account", this.c).putExtra("entry_point", "GOOGLE_SETTINGS").putExtra("campaign_id", hgnr0.b).putExtra("session_id", hgnr0.d).setFlags(0);
            ibuq.e(intent0, "setFlags(...)");
            ccmy ccmy0 = ccmu.a(intent0, cmeu.w);
            String s = hgnr0.e;
            ibuq.e(s, "getCardTitle(...)");
            String s1 = hgnr0.f;
            ibuq.e(s1, "getCardDescription(...)");
            if(!hgnr0.g) {
                cmfb cmfb0 = this.d;
                if(cmfb0 != null && (cmfd.b(cmfb0.c) == null ? cmfd.a : cmfd.b(cmfb0.c)) == cmfd.b && (cmfa.b(cmfb0.d) == null ? cmfa.a : cmfa.b(cmfb0.d)) == cmfa.c) {
                    return (cmey.b(cmfb0.e) == null ? cmey.a : cmey.b(cmfb0.e)) == cmey.b ? new ccnh(s, s1, ccow.u, ccmy0, ccnd.a, null, 0x60) : new ccnh(s, s1, ccow.v, ccmy0, ccnd.a, null, 0x60);
                }
                return new ccnh(s, s1, ccow.v, ccmy0, ccnd.a, null, 0x60);
            }
            return new ccnh(s, s1, ccow.u, ccmy0, ccnd.a, null, 0x60);
        }
        return null;
    }

    @Override  // ccrn
    public final Object g(ibrl ibrl0) {
        long v2;
        bvnw bvnw0;
        if((ibrl0 instanceof bvnw)) {
            bvnw0 = (bvnw)ibrl0;
            int v = bvnw0.d;
            if((v & 0x80000000) == 0) {
                bvnw0 = new bvnw(this, ibrl0);
            }
            else {
                bvnw0.d = v - 0x80000000;
            }
        }
        else {
            bvnw0 = new bvnw(this, ibrl0);
        }
        Object object0 = bvnw0.b;
        Object object1 = ibrx.a;
        switch(bvnw0.d) {
            case 0: {
                ibnx.b(object0);
                long v1 = htwh.a.b().b();
                try {
                    bvnx bvnx0 = new bvnx(this, null);
                    bvnw0.a = v1;
                    bvnw0.d = 1;
                    object0 = icfo.a(v1, bvnx0, bvnw0);
                }
                catch(icfl icfl0) {
                    v2 = v1;
                    break;
                }
                if(object0 != object1) {
                    v2 = v1;
                    return (ccnh)object0;
                }
                return object1;
            }
            case 1: {
                try {
                    v2 = bvnw0.a;
                    ibnx.b(object0);
                    return (ccnh)object0;
                }
                catch(icfl icfl0) {
                    break;
                }
            }
            default: {
                throw new IllegalStateException("call to \'resume\' before \'invoke\' with coroutine");
            }
        }
        ((ggtj)((ggtj)bvnz.a.j()).s(icfl0)).A("fetchContextualCard timed out in %d ms", v2);
        return null;
    }
}

