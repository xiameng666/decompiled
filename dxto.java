import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;
import j..util.Optional;

final class dxto implements AndroidInjector {
    private final domv a;
    private final dolg b;
    private final doly c;

    public dxto(dolg dolg0, doly doly0, domv domv0) {
        this.a = domv0;
        this.b = dolg0;
        this.c = doly0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dxuc dxuc0 = (dxuc)object0;
        dxuc0.b = new dxte(dmhh.b(this.a.a(), this.b.d(), this.b.c(), dmgy.a(), null, Optional.empty()), new fbio(this.a.a(), edtq.b(edtl.a(dmgv.e(dmgy.a())), this.b.a())));
        dxuc0.c = efmh.b(this.c.c());
        fhwk fhwk0 = this.a.i();
        Preconditions.e(fhwk0);
        dxuc0.d = fhwk0;
    }
}

