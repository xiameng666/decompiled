import android.content.Intent;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.ui.SignInChimeraActivity;
import com.google.android.gms.common.api.Status;
import j..util.Objects;

public final class aifn implements gmbg {
    final SignInChimeraActivity a;

    public aifn(SignInChimeraActivity signInChimeraActivity0) {
        Objects.requireNonNull(signInChimeraActivity0);
        this.a = signInChimeraActivity0;
        super();
    }

    @Override  // gmbg
    public final void a(Throwable throwable0) {
        Status status0 = aifo.b(aifo.a(throwable0));
        this.a.g(status0);
    }

    @Override  // gmbg
    public final void b(Object object0) {
        GoogleSignInAccount googleSignInAccount0 = (GoogleSignInAccount)((gfsx)object0).g();
        Intent intent0 = new Intent();
        SignInChimeraActivity signInChimeraActivity0 = this.a;
        signInChimeraActivity0.m = intent0;
        if(googleSignInAccount0 != null) {
            SignInAccount signInAccount0 = new SignInAccount("<<default account>>", googleSignInAccount0, "<<default user id>>");
            signInChimeraActivity0.m.putExtra("signInAccount", signInAccount0);
        }
        signInChimeraActivity0.a(-1, signInChimeraActivity0.m);
        signInChimeraActivity0.m(0);
        signInChimeraActivity0.l(-1, Status.b, googleSignInAccount0);
    }
}

