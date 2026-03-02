import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

final class dlsb implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    final Provider e;
    final Provider f;
    private final dolg g;
    private final domv h;

    public dlsb(dolg dolg0, domv domv0) {
        this.g = dolg0;
        this.h = domv0;
        dlry dlry0 = new dlry(dolg0);
        this.a = dlry0;
        dlrz dlrz0 = new dlrz(domv0);
        this.b = dlrz0;
        dlsa dlsa0 = new dlsa(domv0);
        this.c = dlsa0;
        dyad dyad0 = new dyad(dlrz0, dlsa0);
        this.d = dyad0;
        dlov dlov0 = new dlov(dyad0);
        this.e = dlov0;
        this.f = new dltj(dlry0, dlov0);
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dlte dlte0 = (dlte)object0;
        dlte0.a = this.g.a();
        this.h.a();
        dlte0.b = new dmgi(this.g.d(), dmgy.a());
        dlte0.c = this.f;
        fhwk fhwk0 = this.h.i();
        Preconditions.e(fhwk0);
        dlte0.d = fhwk0;
        dlte0.ag = this.h.g();
        dlte0.ah = new fuok();
        dlte0.ai = this.h.j();
    }
}

