import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;

final class dwda implements AndroidInjector {
    private final dolg a;
    private final domv b;

    public dwda(dolg dolg0, domv domv0) {
        this.a = dolg0;
        this.b = domv0;
    }

    final dmgi a() {
        this.b.a();
        return new dmgi(this.a.d(), dmgy.a());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dwgt dwgt0 = (dwgt)object0;
        dwgt0.ah = this.a.d();
        dwgt0.ai = new dvlp(this.a.a(), this.b.h(), this.a());
        dwgt0.aj = this.a();
        dwgt0.ak = this.b.h();
        dwgt0.al = bbnk.a;
        dwgt0.am = this.b.a();
        dwgt0.an = new dvlb(this.b.a());
        dwgt0.ao = dmgv.e(dmgy.a());
        dwgt0.ap = new dsjx(edmj.a());
        domj domj0 = this.b.b();
        Preconditions.e(domj0);
        dwgt0.aq = domj0;
    }
}

