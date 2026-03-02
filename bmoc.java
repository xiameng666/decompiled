import com.google.android.gms.fido.fido2.api.common.ErrorCode;
import com.google.android.gms.fido.fido2.ui.AuthenticateChimeraActivity;

public final class bmoc implements lqj {
    public final AuthenticateChimeraActivity a;

    public bmoc(AuthenticateChimeraActivity authenticateChimeraActivity0) {
        this.a = authenticateChimeraActivity0;
    }

    @Override  // lqj
    public final void jS(Object object0) {
        if(bata.b(((Boolean)object0), Boolean.valueOf(true))) {
            this.a.o.q(this.a.m, ErrorCode.i.m, this.a.x);
            this.a.setResult(this.a.w.a, this.a.w.b);
            this.a.finish();
        }
    }
}

