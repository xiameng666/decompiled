import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.pay.pass.valuable.view.detail.ValuableDetailUnifiedFragment;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

public final class dvqm implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    final Provider e;
    final Provider f;
    final Provider g;
    private final dolg h;
    private final dxed i;
    private final domv j;
    private final doly k;
    private final domw l;

    public dvqm(dolg dolg0, dxed dxed0, domw domw0, doly doly0, domv domv0) {
        this.h = dolg0;
        this.i = dxed0;
        this.j = domv0;
        this.k = doly0;
        this.l = domw0;
        dvql dvql0 = new dvql(domv0);
        this.a = dvql0;
        dmkm dmkm0 = new dmkm(dvql0);
        this.b = dmkm0;
        edrr edrr0 = new edrr(dmkm0);
        this.c = edrr0;
        this.d = DoubleCheck.b(new edrz(edrr0));
        edsk edsk0 = new edsk(dmkm0, dybw.a);
        this.e = edsk0;
        this.f = DoubleCheck.b(new edsc(edsk0));
        this.g = DoubleCheck.b(edsa.a);
    }

    final dmgi a() {
        this.j.a();
        return new dmgi(this.h.d(), dmgy.a());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ValuableDetailUnifiedFragment valuableDetailUnifiedFragment0 = (ValuableDetailUnifiedFragment)object0;
        valuableDetailUnifiedFragment0.b = this.h.a();
        valuableDetailUnifiedFragment0.c = dmgy.a();
        valuableDetailUnifiedFragment0.d = new fshk();
        valuableDetailUnifiedFragment0.aA = this.i.a();
        valuableDetailUnifiedFragment0.ag = new edon(this.j.a());
        valuableDetailUnifiedFragment0.ah = new efma(this.j.a());
        valuableDetailUnifiedFragment0.ai = new eeej(this.k.c(), new eeaw(new azts(this.k.e(), null), this.h.d(), this.h.c(), this.h.e(), new etgl(this.j.a()), new edse(this.j.a())), this.k.e(), ((edrp)this.d.get()), ((edsh)this.f.get()), this.a());
        valuableDetailUnifiedFragment0.aj = new dvfu(this.a(), new dmgm(dmgy.a()));
        fuot fuot0 = this.j.o();
        Preconditions.e(fuot0);
        valuableDetailUnifiedFragment0.ak = fuot0;
        Context context0 = this.j.a();
        Account account0 = this.h.a();
        String s = dmgy.a();
        frii frii0 = this.j.n();
        Preconditions.e(frii0);
        valuableDetailUnifiedFragment0.al = new dsio(dsiq.b(context0, account0, s, frii0));
        valuableDetailUnifiedFragment0.am = (Boolean)this.g.get();
        fhwk fhwk0 = this.j.i();
        Preconditions.e(fhwk0);
        valuableDetailUnifiedFragment0.an = fhwk0;
        valuableDetailUnifiedFragment0.ao = new fuok();
        valuableDetailUnifiedFragment0.ap = new dsor(this.h.a(), new dlnx(this.j.a(), new bblp(1, 10)), new hfid(null));
        valuableDetailUnifiedFragment0.aq = (edrp)this.d.get();
    }
}

