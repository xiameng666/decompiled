import com.google.android.gms.signin.activity.ConsentChimeraActivity;

public final class epru implements Runnable {
    public final eprv a;
    public final Throwable b;

    public epru(eprv eprv0, Throwable throwable0) {
        this.a = eprv0;
        this.b = throwable0;
    }

    @Override
    public final void run() {
        ConsentChimeraActivity.j.n("Exception performing consentStep=%d", this.b, new Object[]{((int)this.a.b.r)});
    }
}

