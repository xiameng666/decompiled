import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;

final class dvyp implements AndroidInjector {
    private final dolg a;
    private final domv b;
    private final doma c;

    public dvyp(doma doma0, dolg dolg0, domv domv0) {
        this.a = dolg0;
        this.b = domv0;
        this.c = doma0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dvyv dvyv0 = (dvyv)object0;
        dvyv0.ag = this.a.a();
        this.b.a();
        dvyv0.ah = new dvfu(new dmgi(this.a.d(), dmgy.a()), new dmgm(dmgy.a()));
        this.b.a();
        dvyv0.ai = new dvfw(new dmgk(dmgy.a()));
        dvyv0.am = new azts(domd.b(this.c));
        fhwk fhwk0 = this.b.i();
        Preconditions.e(fhwk0);
        dvyv0.aj = fhwk0;
        dvyv0.ak = this.b.g();
    }
}

