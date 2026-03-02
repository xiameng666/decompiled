import android.accounts.Account;
import android.content.Context;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import j..util.Optional;

final class ebpt implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    final Provider e;
    final Provider f;
    final Provider g;
    private final dola h;
    private final domv i;
    private final dmgr j;
    private final domw k;

    public ebpt(dola dola0, dmgr dmgr0, domw domw0, edor edor0, domv domv0) {
        this.h = dola0;
        this.i = domv0;
        this.j = dmgr0;
        this.k = domw0;
        ebpr ebpr0 = new ebpr(domv0);
        this.a = ebpr0;
        edsf edsf0 = new edsf(ebpr0);
        this.b = edsf0;
        dmkm dmkm0 = new dmkm(ebpr0);
        this.c = dmkm0;
        ebps ebps0 = new ebps(edor0);
        this.d = ebps0;
        edrn edrn0 = new edrn(edsf0, dmkm0, ebps0);
        this.e = edrn0;
        this.f = DoubleCheck.b(new edrj(edrn0));
        this.g = DoubleCheck.b(edrh.a);
    }

    final dmgi a() {
        this.i.a();
        return new dmgi(dolf.b(this.h), dmgy.a());
    }

    final dmhi b() {
        return dmhh.b(this.i.a(), dolf.b(this.h), dole.b(this.h), dmgy.a(), this.j.a, Optional.empty());
    }

    final dypo c() {
        return new dypo(this.i.a(), dole.b(this.h), dmgy.a());
    }

    final dypz d() {
        return new dypz(this.i.a(), dole.b(this.h), dmgy.a());
    }

    final fbio e() {
        return new fbio(this.i.a(), edtq.b(ebpt.h(), dolc.b(this.h)));
    }

    final etgl f() {
        return new etgl(this.i.a());
    }

    static final boolean g() {
        return dmgv.e(dmgy.a());
    }

    static final int h() {
        return edtl.a(ebpt.g());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebyk ebyk0 = (ebyk)object0;
        ebyk0.f = dond.a();
        Account account0 = dolc.b(this.h);
        dypo dypo0 = this.c();
        dypz dypz0 = this.d();
        fsgp fsgp0 = new fsgp(this.i.a(), new edsl(ebpt.g()), new bblp(1, 9));
        fhwb fhwb0 = this.i.h();
        fich fich0 = this.i.k();
        Preconditions.e(fich0);
        fsge fsge0 = new fsge(fsgp0, fhwb0, fich0);
        easw easw0 = easp.a();
        edgd edgd0 = new edgd(new edgi(this.i.a(), dole.b(this.h), dmgy.a()), eass.a(), new edgz(new edtj(dolc.b(this.h), this.e(), edtn.a(), ebpt.h()), this.b(), new edig(this.a())));
        dypv dypv0 = new dypv(this.b(), new dlnm(new acqn(this.i.a()), dolf.b(this.h), dole.b(this.h)));
        dmgi dmgi0 = this.a();
        Context context0 = this.i.a();
        bblp bblp0 = new bblp(0x7FFFFFFF, 9);
        String s = dmgy.a();
        Context context1 = this.i.a();
        frii frii0 = this.i.n();
        Preconditions.e(frii0);
        dxzq dxzq0 = new dxzq(context1, frii0);
        Context context2 = this.i.a();
        frii frii1 = this.i.n();
        Preconditions.e(frii1);
        dxzs dxzs0 = new dxzs(context2, frii1);
        dmue dmue0 = new dmue(this.f(), new dlmc(this.i.a(), dole.b(this.h), dmgy.a()), new dmtn(this.i.a(), dole.b(this.h), dmgy.a(), new earj(new earo(this.i.a(), dole.b(this.h), dmgy.a(), new earr(this.i.a(), dole.b(this.h), dmgy.a())))), new dmuj(this.b(), this.e(), new edmu(new dmkl(this.i.a()), ((edrk)this.f.get()), ((edrg)this.g.get()))), new bblp(1, 10), easp.a(), this.c(), this.d(), new dypr(this.c()), new dmuh(dolc.b(this.h), this.f(), new eeeg(this.i.a(), dolf.b(this.h), dmgy.a())), new dxzo(dolc.b(this.h), dmgy.a(), new bblp(0x7FFFFFFF, 9)));
        ebyk0.g = new dyra(account0, dypo0, dypz0, fsge0, easw0, edgd0, dypv0, bbnk.a, dmgi0, context0, bblp0, s, dxzq0, dxzs0, dmue0);
    }
}

