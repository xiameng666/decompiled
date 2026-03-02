import com.google.android.gms.signin.activity.ConsentChimeraActivity;

public final class eprs implements Runnable {
    public final eprv a;
    public final int b;

    public eprs(eprv eprv0, int v) {
        this.a = eprv0;
        this.b = v;
    }

    @Override
    public final void run() {
        ConsentChimeraActivity.j.m("consentStep=%d transitioned into step=%d", new Object[]{((int)this.b), ((int)this.a.b.r)});
    }
}

