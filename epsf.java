import com.google.android.gms.signin.activity.SignInChimeraActivity;
import java.io.IOException;

public final class epsf implements gfsi {
    public final SignInChimeraActivity a;

    public epsf(SignInChimeraActivity signInChimeraActivity0) {
        this.a = signInChimeraActivity0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        if(hyfg.a.b().e()) {
            SignInChimeraActivity.j.h("Couldn\'t fetch app\'s branding information, but continuing without it.", new Object[0]);
            return gfsx.m(Integer.valueOf(2));
        }
        SignInChimeraActivity.j.g("Errors encountered when trying to fetch app\'s branding information", ((IOException)object0), new Object[0]);
        this.a.a(0, null);
        return gfqx.a;
    }
}

