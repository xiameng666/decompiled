import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;

final class dwca implements AndroidInjector {
    private final domv a;
    private final dolg b;

    public dwca(dolg dolg0, domv domv0) {
        this.a = domv0;
        this.b = dolg0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dwat dwat0 = (dwat)object0;
        dwat0.b = new dsjx(edmj.a());
        this.a.a();
        dwat0.c = new dmgi(this.b.d(), dmgy.a());
        dwat0.d = dmgv.e(dmgy.a());
        fhwk fhwk0 = this.a.i();
        Preconditions.e(fhwk0);
        dwat0.ag = fhwk0;
        dwat0.ah = new dvlb(this.a.a());
        dwat0.ak = new dwrf(edox.a());
        dwat0.ai = new fuok();
    }
}

