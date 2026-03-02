import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import j..util.Optional;

final class ebju implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    final Provider e;
    final Provider f;
    final Provider g;
    final Provider h;
    final Provider i;
    final Provider j;
    final Provider k;
    final Provider l;
    final Provider m;
    final Provider n;
    final Provider o;
    final Provider p;
    final Provider q;
    final Provider r;
    final Provider s;
    private final domv t;
    private final dola u;
    private final domw v;
    private final dmgr w;

    public ebju(dola dola0, dmgr dmgr0, domw domw0, domv domv0, edor edor0) {
        this.t = domv0;
        this.u = dola0;
        this.v = domw0;
        this.w = dmgr0;
        ebjs ebjs0 = new ebjs(domv0);
        this.a = ebjs0;
        ebjr ebjr0 = new ebjr(domv0);
        this.b = ebjr0;
        eczr eczr0 = new eczr(ebjs0, ebjr0);
        this.c = eczr0;
        this.d = new ecwg();
        ecwf ecwf0 = new ecwf(ebjs0);
        this.e = ecwf0;
        this.f = ebjv.a;
        ecwe ecwe0 = new ecwe(ebjs0, ebjv.a);
        this.g = ecwe0;
        ecwr ecwr0 = new ecwr(ebjs0, eczr0, ecwf0, ecwe0, ebjv.a);
        this.h = ecwr0;
        ecwd ecwd0 = new ecwd(ecwr0, ecwe0);
        this.i = ecwd0;
        dmgz dmgz0 = new dmgz();
        this.j = dmgz0;
        this.k = new ecvz(ecwd0, dmgz0, eczr0);
        edsf edsf0 = new edsf(ebjs0);
        this.l = edsf0;
        dmkm dmkm0 = new dmkm(ebjs0);
        this.m = dmkm0;
        ebjt ebjt0 = new ebjt(edor0);
        this.n = ebjt0;
        edrn edrn0 = new edrn(edsf0, dmkm0, ebjt0);
        this.o = edrn0;
        this.p = DoubleCheck.b(new edrj(edrn0));
        this.q = DoubleCheck.b(edrh.a);
        cjkz cjkz0 = new cjkz(ebjs0);
        this.r = cjkz0;
        this.s = new cjlw(ebjs0, cjkz0);
    }

    final dmgi a() {
        this.t.a();
        return new dmgi(dolf.b(this.u), dmgy.a());
    }

    final dmhi b() {
        return dmhh.b(this.t.a(), dolf.b(this.u), dole.b(this.u), dmgy.a(), this.w.a, Optional.empty());
    }

    final dmue c() {
        return new dmue(this.l(), new dlmc(this.t.a(), dole.b(this.u), dmgy.a()), new dmtn(this.t.a(), dole.b(this.u), dmgy.a(), new earj(new earo(this.t.a(), dole.b(this.u), dmgy.a(), new earr(this.t.a(), dole.b(this.u), dmgy.a())))), new dmuj(this.b(), new fbio(this.t.a(), edtq.b(edtl.a(dmgv.e(dmgy.a())), dolc.b(this.u))), new edmu(new dmkl(this.t.a()), ((edrk)this.p.get()), ((edrg)this.q.get()))), new bblp(1, 10), easp.a(), this.e(), this.h(), new dypr(this.e()), new dmuh(dolc.b(this.u), this.l(), new eeeg(this.t.a(), dolf.b(this.u), dmgy.a())), new dxzo(dolc.b(this.u), dmgy.a(), new bblp(0x7FFFFFFF, 9)));
    }

    final dycb d() {
        return new dycb(this.t.a(), dolc.b(this.u), dmgy.a());
    }

    final dypo e() {
        return new dypo(this.t.a(), dole.b(this.u), dmgy.a());
    }

    final dypv f() {
        return new dypv(this.b(), new dlnm(new acqn(this.t.a()), dolf.b(this.u), dole.b(this.u)));
    }

    final dypx g() {
        return new dypx(this.t.a(), dole.b(this.u), dmgy.a());
    }

    final dypz h() {
        return new dypz(this.t.a(), dole.b(this.u), dmgy.a());
    }

    final dyre i() {
        return new dyre(dolc.b(this.u), this.e(), this.g(), this.h(), this.f(), this.a(), this.k(), this.c(), easp.a());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebjb ebjb0 = (ebjb)object0;
        ebjb0.b = this.d();
        ebjb0.c = this.e();
        ebjb0.d = this.h();
        ebjb0.e = new dytd(dolc.b(this.u), new dypj(this.j(), new dypb(this.j(), this.i()), new edmh(this.t.a(), dmgy.a(), easm.a()), new dybv(), new bblp(0x7FFFFFFF, 10)), this.f(), this.e(), this.g(), this.h(), this.d(), this.i(), this.c(), easp.a(), new bblp(0x7FFFFFFF, 10), new bblp(0x7FFFFFFF, 9), this.k());
        ebjb0.f = bbnk.a;
        ebjb0.g = new bblp(0x7FFFFFFF, 9);
        ebjb0.h = this.t.h();
        fich fich0 = this.t.k();
        Preconditions.e(fich0);
        ebjb0.i = fich0;
        ebjb0.j = DoubleCheck.a(this.s);
        ebjb0.k = dolc.b(this.u);
    }

    final dyxt j() {
        gmcg gmcg0 = this.t.p();
        Preconditions.e(gmcg0);
        bblp bblp0 = new bblp(0x7FFFFFFF, 9);
        dykl dykl0 = this.t.c();
        Preconditions.e(dykl0);
        dyks dyks0 = this.t.e();
        Preconditions.e(dyks0);
        dyky dyky0 = this.t.f();
        Preconditions.e(dyky0);
        dyko dyko0 = this.t.d();
        Preconditions.e(dyko0);
        return new dyxt(gmcg0, bblp0, dykl0, dyks0, dyky0, dyko0, this.l(), ((ecvz)this.k).a(), dolf.b(this.u), this.a());
    }

    final ebst k() {
        return new ebst(this.t.h());
    }

    final etgl l() {
        return new etgl(this.t.a());
    }
}

