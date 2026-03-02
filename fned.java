import android.content.Intent;

final class fned extends ibsl implements ibtw {
    int a;
    final fnem b;

    public fned(fnem fnem0, ibrl ibrl0) {
        this.b = fnem0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((fned)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new fned(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v != 0) {
            return object0;
        }
        fnem fnem0 = this.b;
        this.a = 1;
        icbk icbk0 = new icbk(ibsc.c(this), 1);
        icbk0.z();
        if(fnem0.c.get()) {
            icbk0.w(Boolean.valueOf(true));
        }
        else {
            try {
                Intent intent0 = new Intent().setPackage("com.android.vending").setAction("com.android.vending.setup.IPlaySetupServiceV2.BIND");
                fnee fnee0 = new fnee(fnem0, icbk0);
                if(!fnem0.a.bindService(intent0, fnee0, 1)) {
                    goto label_20;
                }
            }
            catch(Exception exception0) {
                sct.a("AobPlayController", "Unhandled exception when binding to PlaySetupService");
                icbk0.w(ibnx.a(exception0));
            }
            goto label_21;
        label_20:
            icbk0.w(Boolean.valueOf(false));
        }
    label_21:
        Object object2 = icbk0.k();
        if(object2 == ibrx.a) {
            ibsi.b(this);
        }
        return object2 == object1 ? object1 : object2;
    }
}

