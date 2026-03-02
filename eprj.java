import com.google.android.gms.signin.activity.ConsentChimeraActivity;

public final class eprj implements Runnable {
    public final String a;

    public eprj(String s) {
        this.a = s;
    }

    @Override
    public final void run() {
        ConsentChimeraActivity.j.m("starting webivew with resolution url=%s", new Object[]{this.a});
    }
}

