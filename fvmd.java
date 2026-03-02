import android.location.Location;
import android.os.SystemClock;
import j..util.Objects;

final class fvmd implements cmob {
    final fvme a;

    public fvmd(fvme fvme0) {
        Objects.requireNonNull(fvme0);
        this.a = fvme0;
        super();
    }

    @Override  // cmob
    public final void onLocationChanged(Location location0) {
        this.a.l.a();
        long v = SystemClock.elapsedRealtime();
        gftb.check(location0);
        this.a.m.a.q(location0, v);
        this.a.i(fvns.v, v, null);
    }
}

