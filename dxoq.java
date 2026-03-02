import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;
import j..util.Optional;

final class dxoq implements AndroidInjector {
    private final dolg a;
    private final domv b;
    private final doma c;
    private final dzpy d;

    public dxoq(doma doma0, dzpy dzpy0, dolg dolg0, domv domv0) {
        this.a = dolg0;
        this.b = domv0;
        this.c = doma0;
        this.d = dzpy0;
    }

    final fbio a() {
        return new fbio(this.b.a(), edtq.b(dxoq.b(), this.a.a()));
    }

    static final int b() {
        return edtl.a(dmgv.e(dmgy.a()));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dxrz dxrz0 = (dxrz)object0;
        dxrz0.b = new edtj(this.a.a(), this.a(), edtn.a(), dxoq.b());
        dxrz0.c = new efma(this.b.a());
        this.b.a();
        dxrz0.d = new dmgi(this.a.d(), dmgy.a());
        dxrz0.ag = new drub(efmh.b(domf.a(this.c)));
        dxrz0.ah = new dxte(dmhh.b(this.b.a(), this.a.d(), this.a.c(), dmgy.a(), null, Optional.empty()), this.a());
        domj domj0 = this.b.b();
        Preconditions.e(domj0);
        dxrz0.ai = domj0;
        fuot fuot0 = this.b.o();
        Preconditions.e(fuot0);
        dxrz0.aj = fuot0;
        dxrz0.ak = this.a.c();
        dxrz0.al = dmgy.a();
        fhwk fhwk0 = this.b.i();
        Preconditions.e(fhwk0);
        dxrz0.am = fhwk0;
        dxrz0.an = new eaca(domb.a(this.c), this.d.a());
    }
}

