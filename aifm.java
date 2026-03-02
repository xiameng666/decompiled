import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.ui.SignInChimeraActivity;

public final class aifm implements gful_cronetEngineProvider {
    public final SignInChimeraActivity a;

    public aifm(SignInChimeraActivity signInChimeraActivity0) {
        this.a = signInChimeraActivity0;
    }

    @Override  // gful_cronetEngineProvider
    public final Object mr() {
        GoogleSignInOptions googleSignInOptions0 = this.a.j;
        String s = this.a.k;
        return new aifv(this.a.getApplicationContext(), googleSignInOptions0, s, gfsx.m(this.a)).a();
    }
}

