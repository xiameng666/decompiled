import android.accounts.Account;
import android.content.Context;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import j..util.Optional;

final class ebnz implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    final Provider e;
    final Provider f;
    final Provider g;
    final Provider h;
    final Provider i;
    private final dola j;
    private final domv k;
    private final dmgr l;
    private final domw m;

    public ebnz(dola dola0, dmgr dmgr0, domw domw0, edor edor0, domv domv0) {
        this.j = dola0;
        this.k = domv0;
        this.l = dmgr0;
        this.m = domw0;
        ebnx ebnx0 = new ebnx(domv0);
        this.a = ebnx0;
        edsf edsf0 = new edsf(ebnx0);
        this.b = edsf0;
        edra edra0 = new edra(ebnx0, edsf0);
        this.c = edra0;
        this.d = DoubleCheck.b(new edrb(edra0));
        dmkm dmkm0 = new dmkm(ebnx0);
        this.e = dmkm0;
        ebny ebny0 = new ebny(edor0);
        this.f = ebny0;
        edrn edrn0 = new edrn(edsf0, dmkm0, ebny0);
        this.g = edrn0;
        this.h = DoubleCheck.b(new edrj(edrn0));
        this.i = DoubleCheck.b(edrh.a);
    }

    final dmgi a() {
        this.k.a();
        return new dmgi(dolf.b(this.j), dmgy.a());
    }

    final dmhi b() {
        return dmhh.b(this.k.a(), dolf.b(this.j), dole.b(this.j), dmgy.a(), this.l.a, Optional.empty());
    }

    final dypo c() {
        return new dypo(this.k.a(), dole.b(this.j), dmgy.a());
    }

    final dypz d() {
        return new dypz(this.k.a(), dole.b(this.j), dmgy.a());
    }

    final fbio e() {
        return new fbio(this.k.a(), edtq.b(ebnz.h(), dolc.b(this.j)));
    }

    final etgl f() {
        return new etgl(this.k.a());
    }

    static final boolean g() {
        return dmgv.e(dmgy.a());
    }

    static final int h() {
        return edtl.a(ebnz.g());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebvy ebvy0 = (ebvy)object0;
        ebvy0.a = (edqy)this.d.get();
        Account account0 = dolc.b(this.j);
        dypo dypo0 = this.c();
        dypz dypz0 = this.d();
        fsgp fsgp0 = new fsgp(this.k.a(), new edsl(ebnz.g()), new bblp(1, 9));
        fhwb fhwb0 = this.k.h();
        fich fich0 = this.k.k();
        Preconditions.e(fich0);
        fsge fsge0 = new fsge(fsgp0, fhwb0, fich0);
        easw easw0 = easp.a();
        edgd edgd0 = new edgd(new edgi(this.k.a(), dole.b(this.j), dmgy.a()), eass.a(), new edgz(new edtj(dolc.b(this.j), this.e(), edtn.a(), ebnz.h()), this.b(), new edig(this.a())));
        dypv dypv0 = new dypv(this.b(), new dlnm(new acqn(this.k.a()), dolf.b(this.j), dole.b(this.j)));
        dmgi dmgi0 = this.a();
        Context context0 = this.k.a();
        bblp bblp0 = new bblp(0x7FFFFFFF, 9);
        String s = dmgy.a();
        Context context1 = this.k.a();
        frii frii0 = this.k.n();
        Preconditions.e(frii0);
        dxzq dxzq0 = new dxzq(context1, frii0);
        Context context2 = this.k.a();
        frii frii1 = this.k.n();
        Preconditions.e(frii1);
        dxzs dxzs0 = new dxzs(context2, frii1);
        dmue dmue0 = new dmue(this.f(), new dlmc(this.k.a(), dole.b(this.j), dmgy.a()), new dmtn(this.k.a(), dole.b(this.j), dmgy.a(), new earj(new earo(this.k.a(), dole.b(this.j), dmgy.a(), new earr(this.k.a(), dole.b(this.j), dmgy.a())))), new dmuj(this.b(), this.e(), new edmu(new dmkl(this.k.a()), ((edrk)this.h.get()), ((edrg)this.i.get()))), new bblp(1, 10), easp.a(), this.c(), this.d(), new dypr(this.c()), new dmuh(dolc.b(this.j), this.f(), new eeeg(this.k.a(), dolf.b(this.j), dmgy.a())), new dxzo(dolc.b(this.j), dmgy.a(), new bblp(0x7FFFFFFF, 9)));
        ebvy0.b = new dyra(account0, dypo0, dypz0, fsge0, easw0, edgd0, dypv0, bbnk.a, dmgi0, context0, bblp0, s, dxzq0, dxzs0, dmue0);
        ebvy0.c = bbnk.a;
        ebvy0.d = new ebst(this.k.h());
        ebvy0.e = new edse(this.k.a());
        ebvy0.f = ebnz.g();
    }
}

