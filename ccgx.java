import android.os.IBinder.DeathRecipient;

public final class ccgx implements IBinder.DeathRecipient {
    public final cchb a;
    public final gmcu b;

    public ccgx(cchb cchb0, gmcu gmcu0) {
        this.a = cchb0;
        this.b = gmcu0;
    }

    @Override  // android.os.IBinder$DeathRecipient
    public final void binderDied() {
        this.a.b.i("Binder died");
        this.a.a.c(0x471);
        this.b.q(null);
    }
}

