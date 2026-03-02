import com.google.android.gms.signin.activity.ConsentChimeraActivity;

public final class eprt implements Runnable {
    public final int a;

    public eprt(int v) {
        this.a = v;
    }

    @Override
    public final void run() {
        ConsentChimeraActivity.j.m("consentStep=%d transitioned into empty step", new Object[]{((int)this.a)});
    }
}

