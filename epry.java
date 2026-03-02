import android.accounts.Account;
import android.content.Intent;
import com.google.android.gms.signin.activity.SignInChimeraActivity;

public final class epry implements gfsi {
    public final SignInChimeraActivity a;

    public epry(SignInChimeraActivity signInChimeraActivity0) {
        this.a = signInChimeraActivity0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        SignInChimeraActivity signInChimeraActivity0 = this.a;
        if(signInChimeraActivity0.getIntent().getBooleanExtra("complete_sign_in_process", false) && ((bxki)object0).a == -1) {
            Intent intent0 = ((bxki)object0).b;
            if(intent0 != null) {
                String s = intent0.getStringExtra("authAccount");
                gftb.check(s);
                String s1 = intent0.getStringExtra("accountType");
                gftb.check(s1);
                signInChimeraActivity0.o = new Account(s, s1);
                return gfsx.m(Integer.valueOf(3));
            }
        }
        signInChimeraActivity0.a(((bxki)object0).a, (signInChimeraActivity0.n ? ((bxki)object0).b : null));
        return gfqx.a;
    }
}

