import android.os.SystemClock;
import j..util.Objects;

final class crpn extends crdj {
    final crpo b;

    public crpn(crpo crpo0, crlw crlw0) {
        Objects.requireNonNull(crpo0);
        this.b = crpo0;
        super(crlw0);
    }

    @Override  // crdj
    public final void b() {
        this.b.c.n();
        long v = SystemClock.elapsedRealtime();
        this.b.c(false, false, v);
        this.b.c.e().c(SystemClock.elapsedRealtime());
    }
}

