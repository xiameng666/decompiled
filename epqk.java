import com.google.android.gms.signin.activity.ConsentChimeraActivity;

public final class epqk implements Runnable {
    public final ConsentChimeraActivity a;

    public epqk(ConsentChimeraActivity consentChimeraActivity0) {
        this.a = consentChimeraActivity0;
    }

    @Override
    public final void run() {
        ConsentChimeraActivity.j.m("startNextStep() is called, consentStep=%d.", new Object[]{((int)this.a.r)});
    }
}

