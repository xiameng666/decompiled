import com.google.android.gms.signin.activity.ConsentChimeraActivity;

public final class epqj implements Runnable {
    public final String a;

    public epqj(String s) {
        this.a = s;
    }

    @Override
    public final void run() {
        ConsentChimeraActivity.j.m("Finishing ConsentChimeraActivity with errorMessage=%s", new Object[]{this.a});
    }
}

