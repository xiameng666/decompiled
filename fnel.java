import android.os.Bundle;

final class fnel extends ibsl implements ibtw {
    int a;
    final fnem b;

    public fnel(fnem fnem0, ibrl ibrl0) {
        this.b = fnem0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((fnel)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new fnel(this.b, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        String s;
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
        Bundle bundle0 = new Bundle();
        bundle0.putString("caller_id", ((String)fnem0.e.get()));
        try {
            sow sow0 = (sow)fnem0.b.get();
            if(sow0 == null) {
                goto label_32;
            }
            else {
                Bundle bundle1 = sow0.b(bundle0);
                if((bundle1 == null ? null : bundle1.getBundle("error")) != null) {
                    Bundle bundle2 = bundle1.getBundle("error");
                    if(bundle2 == null) {
                        s = "MISSING_ERROR_CODE";
                    }
                    else {
                        s = bundle2.getString("error");
                        if(s == null) {
                            s = "MISSING_ERROR_CODE";
                        }
                    }
                    sct.a("AobPlayController", "Unable to resume due to error-" + s);
                    icbk0.w(fnep.c);
                    goto label_37;
                }
                goto label_25;
            }
            goto label_37;
        }
        catch(Exception exception0) {
            goto label_35;
        }
        try {
        label_25:
            fneq.a(new fnej(fnem0), fnek.a);
            icbk0.w(fnep.a);
        }
        catch(Exception exception1) {
            sct.a("AobPlayController", "Received exception when retrying to wait for resume to be completed-" + exception1.toString());
            icbk0.w(fnep.c);
        }
        goto label_37;
        try {
        label_32:
            icbk0.w(ibnx.a(new RuntimeException("PlayService is not bound")));
        }
        catch(Exception exception0) {
        label_35:
            sct.a("AobPlayController", "Unhandled exception when calling resumeUpdates");
            icbk0.w(ibnx.a(exception0));
        }
    label_37:
        Object object2 = icbk0.k();
        if(object2 == ibrx.a) {
            ibsi.b(this);
        }
        return object2 == object1 ? object1 : object2;
    }
}

