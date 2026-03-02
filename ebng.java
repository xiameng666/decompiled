import android.accounts.Account;
import android.content.Context;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import j..util.Optional;

final class ebng implements AndroidInjector {
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

    public ebng(dola dola0, dmgr dmgr0, domw domw0, edor edor0, domv domv0) {
        this.h = dola0;
        this.i = domv0;
        this.j = dmgr0;
        this.k = domw0;
        ebne ebne0 = new ebne(domv0);
        this.a = ebne0;
        edsf edsf0 = new edsf(ebne0);
        this.b = edsf0;
        dmkm dmkm0 = new dmkm(ebne0);
        this.c = dmkm0;
        ebnf ebnf0 = new ebnf(edor0);
        this.d = ebnf0;
        edrn edrn0 = new edrn(edsf0, dmkm0, ebnf0);
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

    final dxzq c() {
        Context context0 = this.i.a();
        frii frii0 = this.i.n();
        Preconditions.e(frii0);
        return new dxzq(context0, frii0);
    }

    final dypo d() {
        return new dypo(this.i.a(), dole.b(this.h), dmgy.a());
    }

    final dypz e() {
        return new dypz(this.i.a(), dole.b(this.h), dmgy.a());
    }

    final fbio f() {
        return new fbio(this.i.a(), edtq.b(ebng.i(), dolc.b(this.h)));
    }

    final etgl g() {
        return new etgl(this.i.a());
    }

    static final boolean h() {
        return dmgv.e(dmgy.a());
    }

    static final int i() {
        return edtl.a(ebng.h());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebvh ebvh0 = (ebvh)object0;
        ebvh0.f = dolc.b(this.h);
        ebvh0.g = dmgy.a();
        Account account0 = dolc.b(this.h);
        dypo dypo0 = this.d();
        dypz dypz0 = this.e();
        fsgp fsgp0 = new fsgp(this.i.a(), new edsl(ebng.h()), new bblp(1, 9));
        fhwb fhwb0 = this.i.h();
        fich fich0 = this.i.k();
        Preconditions.e(fich0);
        fsge fsge0 = new fsge(fsgp0, fhwb0, fich0);
        easw easw0 = easp.a();
        edgd edgd0 = new edgd(new edgi(this.i.a(), dole.b(this.h), dmgy.a()), eass.a(), new edgz(new edtj(dolc.b(this.h), this.f(), edtn.a(), ebng.i()), this.b(), new edig(this.a())));
        dypv dypv0 = new dypv(this.b(), new dlnm(new acqn(this.i.a()), dolf.b(this.h), dole.b(this.h)));
        dmgi dmgi0 = this.a();
        Context context0 = this.i.a();
        bblp bblp0 = new bblp(0x7FFFFFFF, 9);
        String s = dmgy.a();
        dxzq dxzq0 = this.c();
        Context context1 = this.i.a();
        frii frii0 = this.i.n();
        Preconditions.e(frii0);
        dxzs dxzs0 = new dxzs(context1, frii0);
        dmue dmue0 = new dmue(this.g(), new dlmc(this.i.a(), dole.b(this.h), dmgy.a()), new dmtn(this.i.a(), dole.b(this.h), dmgy.a(), new earj(new earo(this.i.a(), dole.b(this.h), dmgy.a(), new earr(this.i.a(), dole.b(this.h), dmgy.a())))), new dmuj(this.b(), this.f(), new edmu(new dmkl(this.i.a()), ((edrk)this.f.get()), ((edrg)this.g.get()))), new bblp(1, 10), easp.a(), this.d(), this.e(), new dypr(this.d()), new dmuh(dolc.b(this.h), this.g(), new eeeg(this.i.a(), dolf.b(this.h), dmgy.a())), new dxzo(dolc.b(this.h), dmgy.a(), new bblp(0x7FFFFFFF, 9)));
        ebvh0.h = new dyra(account0, dypo0, dypz0, fsge0, easw0, edgd0, dypv0, bbnk.a, dmgi0, context0, bblp0, s, dxzq0, dxzs0, dmue0);
        ebvh0.i = this.c();
        ebvh0.j = new bblp(0x7FFFFFFF, 9);
        ebvh0.k = new ebst(this.i.h());
    }
}

