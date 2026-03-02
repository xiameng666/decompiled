import android.os.Bundle;
import com.google.android.libraries.onboarding.play.updates.models.PlaySetupServiceResultReceiver;

final class fneh extends ibsl implements ibtw {
    int a;
    final fnem b;
    private Object c;

    public fneh(fnem fnem0, ibrl ibrl0) {
        this.b = fnem0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((fneh)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        ibrl ibrl1 = new fneh(this.b, ibrl0);
        ibrl1.c = object0;
        return ibrl1;
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        String s;
        Object object1 = ibrx.a;
        if(this.a != 0) {
            icck icck0 = (icck)this.c;
            ibnx.b(object0);
            return object0;
        }
        ibnx.b(object0);
        fnem fnem0 = this.b;
        this.c = (icck)this.c;
        this.a = 1;
        icbk icbk0 = new icbk(ibsc.c(this), 1);
        icbk0.z();
        Bundle bundle0 = new Bundle();
        bundle0.putString("caller_id", ((String)fnem0.e.get()));
        bundle0.putInt("update_types", 0);
        try {
            PlaySetupServiceResultReceiver playSetupServiceResultReceiver0 = new PlaySetupServiceResultReceiver(icbk0, fnem0.d);
            sow sow0 = (sow)fnem0.b.get();
            if(sow0 == null) {
                icbk0.w(ibnx.a(new RuntimeException("PlayService is not bound")));
            }
            else {
                Bundle bundle1 = sow0.a(playSetupServiceResultReceiver0, bundle0);
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
                    sct.a("AobPlayController", "Unable to pause due to error-" + s);
                    if(ibuq.m(s, "pause_already_called")) {
                        icbk0.w(fneo.a);
                    }
                    else {
                        icbk0.w(fneo.e);
                    }
                }
            }
        }
        catch(SecurityException securityException0) {
            sct.a("AobPlayController", "Package -" + fnem0.a + ".packageName is not authorized to call PlaySetupService");
            icbk0.w(ibnx.a(securityException0));
        }
        catch(Exception exception0) {
            sct.a("AobPlayController", "Unhandled exception when calling PauseUpdates");
            icbk0.w(ibnx.a(exception0));
        }
        Object object2 = icbk0.k();
        if(object2 == ibrx.a) {
            ibsi.b(this);
        }
        return object2 == object1 ? object1 : object2;
    }
}

