import j..util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

public final class fkqw implements glzm {
    public final fkre a;
    public final fkua b;
    public final flae c;
    public final Executor d;
    public final int e;

    public fkqw(fkre fkre0, fkua fkua0, int v, flae flae0, Executor executor0) {
        this.a = fkre0;
        this.b = fkua0;
        this.e = v;
        this.c = flae0;
        this.d = executor0;
    }

    @Override  // glzm
    public final gmcd a() {
        cmbk cmbk0 = new cmbk(this.a.e.b.a, null, true, this.a.e.b.c);
        flae flae0 = this.a.e.a.b(cmbk0);
        gmcd gmcd0 = glzd.f(gmbt.h(glzd.f(((gmcd)this.a.e.a.c.mr()), new cmbe(), gmap.a)), new cmbh(this.a.e.a, this.a.e.b.a, this.a.e.b.c), gmap.a);
        Objects.requireNonNull(flae0);
        gmcd gmcd1 = gdtf.k(glzd.g(gmcd0, new cmat(flae0), gmap.a), new fkqy(this.c), gmap.a);
        fkqz fkqz0 = new fkqz(this.a);
        gmcd gmcd2 = gdtf.e(gmcd1, Exception.class, fkqz0, gmap.a);
        AtomicReference atomicReference0 = new AtomicReference();
        gmcd gmcd3 = gdtf.k(gdtf.j(gmcd2, new fkra(atomicReference0), gmap.a), new fkrb(this.a, atomicReference0, this.b, this.e), this.d);
        gmcd gmcd4 = gdtf.k(gmcd3, new fkrc(this.a, atomicReference0, this.e), gmap.a);
        fkqr fkqr0 = new fkqr(this.a, atomicReference0, this.e);
        return gdtf.b(new gmcd[]{gmcd4, gdtf.f(gmcd3, Exception.class, fkqr0, gmap.a)}).b(new fkqs(gmcd3), gmap.a);
    }
}

