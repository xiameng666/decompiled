import com.google.android.gms.signin.activity.ConsentChimeraActivity;

public final class epqs implements Runnable {
    public final String a;

    public epqs(String s) {
        this.a = s;
    }

    @Override
    public final void run() {
        ConsentChimeraActivity.j.m("Setting browser resolution cookie for domain: " + this.a, new Object[0]);
    }
}

