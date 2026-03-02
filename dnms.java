import android.content.Context;
import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

final class dnms implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    final Provider e;
    final Provider f;
    final Provider g;
    private final dolg h;
    private final domv i;
    private final dxed j;
    private final domw k;

    public dnms(dolg dolg0, dxed dxed0, domw domw0, domv domv0) {
        this.h = dolg0;
        this.i = domv0;
        this.j = dxed0;
        this.k = domw0;
        dnmp dnmp0 = new dnmp(domv0);
        this.a = dnmp0;
        dnmq dnmq0 = new dnmq(dxed0);
        this.b = dnmq0;
        dnmo dnmo0 = new dnmo(dolg0);
        this.c = dnmo0;
        dnmn dnmn0 = new dnmn(dolg0);
        this.d = dnmn0;
        dnmr dnmr0 = new dnmr(domw0);
        this.e = dnmr0;
        dmeu dmeu0 = new dmeu(dnmp0, dnmo0, dnmn0, dnmr0);
        this.f = dmeu0;
        this.g = new dnld(dnmp0, dnmq0, dnmo0, dmeu0);
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dnlp dnlp0 = (dnlp)object0;
        dnlp0.a = this.h.a();
        Context context0 = this.i.a();
        this.i.a();
        dnlp0.b = new dnpp(context0, new dmgi(this.h.d(), dmgy.a()));
        dnlp0.al = this.j.a();
        dnlp0.c = new dmet(this.i.a(), this.h.a(), this.h.c(), new bblp(1, 10));
        dnlp0.d = new fuok();
        fhwk fhwk0 = this.i.i();
        Preconditions.e(fhwk0);
        dnlp0.ag = fhwk0;
        dnlp0.ah = this.g;
    }
}

