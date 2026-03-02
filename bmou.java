import com.google.android.gms.fido.fido2.ui.AuthenticateChimeraActivity;
import j..util.Objects;

final class bmou implements lqj {
    final AuthenticateChimeraActivity a;

    public bmou(AuthenticateChimeraActivity authenticateChimeraActivity0) {
        Objects.requireNonNull(authenticateChimeraActivity0);
        this.a = authenticateChimeraActivity0;
        super();
    }

    @Override  // lqj
    public final void jS(Object object0) {
        if(((bmql)object0).a.equals(bmqk.c)) {
            AuthenticateChimeraActivity authenticateChimeraActivity0 = this.a;
            String s = authenticateChimeraActivity0.s.b;
            synchronized(authenticateChimeraActivity0) {
                gmcu gmcu0 = authenticateChimeraActivity0.y;
                if(gmcu0 != null) {
                    gmcu0.q(s);
                    authenticateChimeraActivity0.s.a(null);
                    if(!bmcn.b) {
                        authenticateChimeraActivity0.s.b(bmqk.e);
                    }
                }
            }
        }
    }
}

