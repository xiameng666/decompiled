import androidx.activity.result.ActivityResult;

public final class cagm implements ibts {
    public final fm a;
    public final String b;

    public cagm(fm fm0, String s) {
        this.a = fm0;
        this.b = s;
    }

    @Override  // ibts
    public final Object a(Object object0) {
        ibuq.f(((ActivityResult)object0), "activityResult");
        if(((ActivityResult)object0).a == -1) {
            fm fm0 = this.a;
            if(fm0 != null && fm0.h("biometric_auth_dialog") == null) {
                caja.a(this.b).showNow(fm0, "biometric_auth_dialog");
            }
        }
        return ibom.a;
    }
}

