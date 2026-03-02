import j..util.Objects;
import java.util.logging.Level;

final class crzg implements Runnable {
    final crzj a;

    public crzg(crzj crzj0) {
        Objects.requireNonNull(crzj0);
        this.a = crzj0;
        super();
    }

    @Override
    public final void run() {
        boolean z = true;
        if(hvko.C()) {
            hfys hfys0 = !hvjw.n() || crvw.c().l() == null ? crvw.c().j(this.a.g) : crvw.c().l();
            if(hfys0 == null || (hhcr.b(hfys0.g) == null ? hhcr.k : hhcr.b(hfys0.g)) != hhcr.b && (!hvjw.n() || (hhcr.b(hfys0.g) == null ? hhcr.k : hhcr.b(hfys0.g)) != hhcr.i)) {
                Level level0 = cslm.h();
                crzj.a.g(level0).x("User has not consented yet. Will register with dummy data.");
                z = false;
            }
        }
        String s = z ? this.a.f : "dummy_cpid_before_consent";
        crzd crzd0 = new crzd();
        crzd0.a = this.a.d;
        crzd0.b = this.a.c.a;
        crzd0.c = (long)this.a.e.c;
        crzd0.d = s;
        crzd0.e = z;
        crzd0.h = 4;
        crzd0.f = this.a.c.c;
        crzd0.a().c();
    }
}

