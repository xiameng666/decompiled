import android.accounts.Account;
import android.content.Context;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import j..util.Optional;

final class eboc implements AndroidInjector {
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

    public eboc(dola dola0, dmgr dmgr0, domw domw0, edor edor0, domv domv0) {
        this.j = dola0;
        this.k = domv0;
        this.l = dmgr0;
        this.m = domw0;
        eboa eboa0 = new eboa(domv0);
        this.a = eboa0;
        edsf edsf0 = new edsf(eboa0);
        this.b = edsf0;
        dmkm dmkm0 = new dmkm(eboa0);
        this.c = dmkm0;
        ebob ebob0 = new ebob(edor0);
        this.d = ebob0;
        edrn edrn0 = new edrn(edsf0, dmkm0, ebob0);
        this.e = edrn0;
        this.f = DoubleCheck.b(new edrj(edrn0));
        this.g = DoubleCheck.b(edrh.a);
        edra edra0 = new edra(eboa0, edsf0);
        this.h = edra0;
        this.i = DoubleCheck.b(new edrb(edra0));
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

    final edgd e() {
        return new edgd(new edgi(this.k.a(), dole.b(this.j), dmgy.a()), eass.a(), new edgz(new edtj(dolc.b(this.j), this.f(), edtn.a(), eboc.j()), this.b(), new edig(this.a())));
    }

    final fbio f() {
        return new fbio(this.k.a(), edtq.b(eboc.j(), dolc.b(this.j)));
    }

    final etgl g() {
        return new etgl(this.k.a());
    }

    static final boolean h() {
        return dmgv.e(dmgy.a());
    }

    static final edsl i() {
        return new edsl(eboc.h());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebwc ebwc0 = (ebwc)object0;
        Account account0 = dolc.b(this.j);
        dypo dypo0 = this.c();
        dypz dypz0 = this.d();
        fsgp fsgp0 = new fsgp(this.k.a(), eboc.i(), new bblp(1, 9));
        fhwb fhwb0 = this.k.h();
        fich fich0 = this.k.k();
        Preconditions.e(fich0);
        fsge fsge0 = new fsge(fsgp0, fhwb0, fich0);
        easw easw0 = easp.a();
        edgd edgd0 = this.e();
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
        dmue dmue0 = new dmue(this.g(), new dlmc(this.k.a(), dole.b(this.j), dmgy.a()), new dmtn(this.k.a(), dole.b(this.j), dmgy.a(), new earj(new earo(this.k.a(), dole.b(this.j), dmgy.a(), new earr(this.k.a(), dole.b(this.j), dmgy.a())))), new dmuj(this.b(), this.f(), new edmu(new dmkl(this.k.a()), ((edrk)this.f.get()), ((edrg)this.g.get()))), new bblp(1, 10), easp.a(), this.c(), this.d(), new dypr(this.c()), new dmuh(dolc.b(this.j), this.g(), new eeeg(this.k.a(), dolf.b(this.j), dmgy.a())), new dxzo(dolc.b(this.j), dmgy.a(), new bblp(0x7FFFFFFF, 9)));
        ebwc0.d = new dyra(account0, dypo0, dypz0, fsge0, easw0, edgd0, dypv0, bbnk.a, dmgi0, context0, bblp0, s, dxzq0, dxzs0, dmue0);
        ebwc0.e = this.e();
        ebwc0.k = eboc.i();
        ebwc0.f = (edqy)this.i.get();
        ebwc0.g = new ebst(this.k.h());
        ebwc0.h = bbnk.a;
        ebwc0.i = new edse(this.k.a());
    }

    static final int j() {
        return edtl.a(eboc.h());
    }
}

