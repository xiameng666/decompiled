import android.accounts.Account;
import android.content.Context;
import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

final class dlqm implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    private final dolg d;
    private final doly e;
    private final dxed f;
    private final domv g;

    public dlqm(dolg dolg0, dxed dxed0, doly doly0, domv domv0) {
        this.d = dolg0;
        this.e = doly0;
        this.f = dxed0;
        this.g = domv0;
        dlql dlql0 = new dlql(domv0);
        this.a = dlql0;
        this.b = new edoc(dlql0);
        this.c = new edod(dlql0);
    }

    final faxq a() {
        return edtq.b(dlqm.b(), this.d.a());
    }

    static final int b() {
        return edtl.a(dmgv.e(dmgy.a()));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dlps dlps0 = (dlps)object0;
        dlps0.b = this.d.a();
        dlps0.c = this.e.c();
        dlps0.ar = this.f.a();
        this.g.a();
        dlps0.d = new dmgi(this.d.d(), dmgy.a());
        dlps0.ag = this.g.h();
        dlps0.ah = this.g.g();
        fich fich0 = this.g.k();
        Preconditions.e(fich0);
        dlps0.ai = fich0;
        domj domj0 = this.g.b();
        Preconditions.e(domj0);
        dlps0.aj = domj0;
        dlps0.ak = new edtj(this.d.a(), new fbio(this.g.a(), this.a()), edtn.a(), dlqm.b());
        fhwk fhwk0 = this.g.i();
        Preconditions.e(fhwk0);
        dlps0.al = fhwk0;
        dlps0.am = new ednx(edob.a(this.g.a()), this.b, this.c);
        azts azts0 = this.f.a();
        Account account0 = this.d.a();
        ibrt ibrt0 = donc.a();
        Context context0 = this.g.a();
        frii frii0 = this.g.n();
        Preconditions.e(frii0);
        dlps0.an = new dlqg(azts0, account0, new dlou(ibrt0, new dyac(context0, frii0)), new edon(this.g.a()), new azts(this.g.a(), this.a()));
        dlps0.ao = new fuok();
    }
}

