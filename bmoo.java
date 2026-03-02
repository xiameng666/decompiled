import com.google.android.gms.fido.fido2.ui.AuthenticateChimeraActivity;

public final class bmoo implements lqj {
    public final AuthenticateChimeraActivity a;

    public bmoo(AuthenticateChimeraActivity authenticateChimeraActivity0) {
        this.a = authenticateChimeraActivity0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        Integer integer0 = (Integer)object0;
        AuthenticateChimeraActivity authenticateChimeraActivity0 = this.a;
        bnae bnae0 = authenticateChimeraActivity0.m;
        if(authenticateChimeraActivity0.i == null) {
            authenticateChimeraActivity0.i = authenticateChimeraActivity0.gy();
        }
        if(authenticateChimeraActivity0.i.h("dialog") != null) {
            return;
        }
        bmqj.y(bnae0.a, -1).show(authenticateChimeraActivity0.i, "dialog");
    }
}

