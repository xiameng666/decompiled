import android.os.RemoteException;
import j..util.Objects;

public final class eqzn implements eqsk {
    final long a;
    final eqzp b;

    public eqzn(eqzp eqzp0, long v) {
        this.a = v;
        Objects.requireNonNull(eqzp0);
        this.b = eqzp0;
        super();
    }

    @Override  // eqsk
    public final void a() {
        this.b.k.n(10595, null);
        eqzp.f.m("Second advertising ran for %d millis but didn\'t connect, skipping to MinuteMaid", new Object[]{((long)this.a)});
        try {
            this.b.h.e(10595, null);
        }
        catch(RemoteException remoteException0) {
            eqzp.f.l(remoteException0);
        }
    }
}

