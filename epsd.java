import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.activity.SignInChimeraActivity;

public final class epsd implements gfsi {
    public final SignInChimeraActivity a;

    public epsd(SignInChimeraActivity signInChimeraActivity0) {
        this.a = signInChimeraActivity0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        if(!((Status)object0).e()) {
            SignInChimeraActivity.j.m("Saving selected account failed. User probably need to re-select.", new Object[0]);
        }
        this.a.a(-1, null);
        return gfqx.a;
    }
}

