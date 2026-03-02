import android.app.usage.UsageStatsManager;
import android.os.UserHandle;
import com.google.android.gms.common.api.Status;

final class ebsz extends ibsl implements ibtw {
    int a;
    final ebtm b;
    private Object c;

    public ebsz(ebtm ebtm0, ibrl ibrl0) {
        this.b = ebtm0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ebsz)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new ebsz(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        icck icck0;
        icck icck2;
        ibrt ibrt1;
        dzah dzah1;
        Object object1 = ibrx.a;
        switch(this.a) {
            case 0: {
                ibnx.b(object0);
                icck icck1 = (icck)this.c;
                gmcg gmcg0 = this.b.c();
                dyjt dyjt0 = (gmcg0 instanceof dyjt) ? ((dyjt)gmcg0) : null;
                if(dyjt0 == null) {
                    ((ggtj)ebtm.a.j()).x("The global secure element executor cannot be paused");
                }
                else {
                    dyjt0.d.lock();
                    try {
                        dyjt0.c = true;
                        dyjt0.e.signalAll();
                    }
                    finally {
                        dyjt0.d.unlock();
                    }
                }
                ebtm ebtm0 = this.b;
                if(new edse(ebtm0.c).c() == edsd.b) {
                    dzah dzah0 = ebtm0.m;
                    if(dzah0 == null) {
                        ibuq.j("tapTimestampHelper");
                        dzah1 = null;
                    }
                    else {
                        dzah1 = dzah0;
                    }
                    long v1 = ebtm0.e;
                    String s = ebtm0.f;
                    ibrt ibrt0 = ebtm0.j;
                    if(ibrt0 == null) {
                        ibuq.j("highSpeedCoroutineContext");
                        ibrt1 = null;
                    }
                    else {
                        ibrt1 = ibrt0;
                    }
                    ebva ebva0 = new ebva(dzah1, v1, s, ibrt1);
                    this.c = icck1;
                    this.a = 1;
                    iccs iccs0 = icbb.a(iccl.b(ebva0.d), null, null, new ebuz(ebva0, null), 3);
                    if(iccs0 == object1) {
                        return object1;
                    }
                    icck2 = icck1;
                    object0 = iccs0;
                    goto label_45;
                }
                break;
            }
            case 1: {
                icck2 = (icck)this.c;
                ibnx.b(object0);
            label_45:
                ebtm.b.set(((iccs)object0));
                if(hwrz.c() > 0L) {
                    this.c = icck2;
                    this.a = 2;
                    object0 = ((iccs)object0).n(this);
                    if(object0 != object1) {
                        icck0 = icck2;
                    label_52:
                        if(((ebuy)object0) != null) {
                            ebtm ebtm1 = this.b;
                            ebtm1.m();
                            long v2 = hwrz.c();
                            long v3 = ((ebuy)object0).a + v2 - System.currentTimeMillis();
                            if(v3 >= 1L && v3 <= hwrz.c()) {
                                dyzq dyzq0 = ebtm1.r;
                                if(dyzq0 == null) {
                                    ibuq.j("powerExemptionHelper");
                                    dyzq0 = null;
                                }
                                ibuq.f(ebtm1.f, "callingPackageName");
                                Object object2 = dyzq0.a.getSystemService("usagestats");
                                ibuq.d(object2, "null cannot be cast to non-null type android.app.usage.UsageStatsManager");
                                UserHandle userHandle0 = UserHandle.getUserHandleForUid(dyzq0.a.getPackageManager().getPackageUid(ebtm1.f, 0));
                                ((UsageStatsManager)object2).whitelistAppTemporarily(ebtm1.f, v3, userHandle0);
                            }
                        }
                        icck2 = icck0;
                        goto label_70;
                    }
                    return object1;
                }
            label_70:
                if(hwrz.a.f().i()) {
                    icbb.b(icck2, this.b.j(), null, new ebsy(this.b, null), 2);
                    return Status.b;
                }
                break;
            }
            default: {
                icck0 = (icck)this.c;
                ibnx.b(object0);
                goto label_52;
            }
        }
        return Status.b;
    }
}

