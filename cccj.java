import android.os.IBinder.DeathRecipient;

public final class cccj implements IBinder.DeathRecipient {
    public final ccco a;
    public final gmcu b;

    public cccj(ccco ccco0, gmcu gmcu0) {
        this.a = ccco0;
        this.b = gmcu0;
    }

    @Override  // android.os.IBinder$DeathRecipient
    public final void binderDied() {
        ccco.a.i("Binder died");
        this.a.i.c(0x4A2);
        this.b.q(new gfsz(null, ((int)1)));
    }
}

