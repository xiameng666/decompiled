import android.content.Intent;
import com.google.android.gms.signin.activity.SignInChimeraActivity;
import com.google.android.gms.signin.internal.AuthAccountResult;

public final class epsu implements gfsi {
    public final SignInChimeraActivity a;

    public epsu(SignInChimeraActivity signInChimeraActivity0) {
        this.a = signInChimeraActivity0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        if(((AuthAccountResult)object0).a().e()) {
            return gfsx.m(Integer.valueOf(6));
        }
        SignInChimeraActivity signInChimeraActivity0 = this.a;
        Intent intent0 = ((AuthAccountResult)object0).c;
        if(intent0 != null) {
            signInChimeraActivity0.s = intent0;
            return gfsx.m(Integer.valueOf(5));
        }
        Intent intent1 = new Intent();
        intent1.putExtra("<<ResolutionFailureErrorDetail>>", ((AuthAccountResult)object0).b);
        signInChimeraActivity0.a(0, intent1);
        return gfqx.a;
    }
}

