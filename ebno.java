import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import j..util.Optional;

final class ebno implements AndroidInjector {
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
    private final domv r;
    private final dola s;
    private final dmgr t;
    private final domw u;

    public ebno(dola dola0, dmgr dmgr0, domw domw0, domv domv0, edor edor0) {
        this.r = domv0;
        this.s = dola0;
        this.t = dmgr0;
        this.u = domw0;
        ebnm ebnm0 = new ebnm(domv0);
        this.a = ebnm0;
        ebnl ebnl0 = new ebnl(domv0);
        this.b = ebnl0;
        eczr eczr0 = new eczr(ebnm0, ebnl0);
        this.c = eczr0;
        this.d = new ecwg();
        ecwf ecwf0 = new ecwf(ebnm0);
        this.e = ecwf0;
        this.f = ebnp.a;
        ecwe ecwe0 = new ecwe(ebnm0, ebnp.a);
        this.g = ecwe0;
        ecwr ecwr0 = new ecwr(ebnm0, eczr0, ecwf0, ecwe0, ebnp.a);
        this.h = ecwr0;
        ecwd ecwd0 = new ecwd(ecwr0, ecwe0);
        this.i = ecwd0;
        dmgz dmgz0 = new dmgz();
        this.j = dmgz0;
        this.k = new ecvz(ecwd0, dmgz0, eczr0);
        edsf edsf0 = new edsf(ebnm0);
        this.l = edsf0;
        dmkm dmkm0 = new dmkm(ebnm0);
        this.m = dmkm0;
        ebnn ebnn0 = new ebnn(edor0);
        this.n = ebnn0;
        edrn edrn0 = new edrn(edsf0, dmkm0, ebnn0);
        this.o = edrn0;
        this.p = DoubleCheck.b(new edrj(edrn0));
        this.q = DoubleCheck.b(edrh.a);
    }

    final dmgi a() {
        this.r.a();
        return new dmgi(dolf.b(this.s), dmgy.a());
    }

    final dmhi b() {
        return dmhh.b(this.r.a(), dolf.b(this.s), dole.b(this.s), dmgy.a(), this.t.a, Optional.empty());
    }

    final dmue c() {
        return new dmue(this.k(), new dlmc(this.r.a(), dole.b(this.s), dmgy.a()), new dmtn(this.r.a(), dole.b(this.s), dmgy.a(), new earj(new earo(this.r.a(), dole.b(this.s), dmgy.a(), new earr(this.r.a(), dole.b(this.s), dmgy.a())))), new dmuj(this.b(), new fbio(this.r.a(), edtq.b(edtl.a(dmgv.e(dmgy.a())), dolc.b(this.s))), new edmu(new dmkl(this.r.a()), ((edrk)this.p.get()), ((edrg)this.q.get()))), new bblp(1, 10), easp.a(), this.d(), this.g(), new dypr(this.d()), new dmuh(dolc.b(this.s), this.k(), new eeeg(this.r.a(), dolf.b(this.s), dmgy.a())), new dxzo(dolc.b(this.s), dmgy.a(), new bblp(0x7FFFFFFF, 9)));
    }

    final dypo d() {
        return new dypo(this.r.a(), dole.b(this.s), dmgy.a());
    }

    final dypv e() {
        return new dypv(this.b(), new dlnm(new acqn(this.r.a()), dolf.b(this.s), dole.b(this.s)));
    }

    final dypx f() {
        return new dypx(this.r.a(), dole.b(this.s), dmgy.a());
    }

    final dypz g() {
        return new dypz(this.r.a(), dole.b(this.s), dmgy.a());
    }

    final dyre h() {
        return new dyre(dolc.b(this.s), this.d(), this.f(), this.g(), this.e(), this.a(), this.j(), this.c(), easp.a());
    }

    final dyxt i() {
        gmcg gmcg0 = this.r.p();
        Preconditions.e(gmcg0);
        bblp bblp0 = new bblp(0x7FFFFFFF, 9);
        dykl dykl0 = this.r.c();
        Preconditions.e(dykl0);
        dyks dyks0 = this.r.e();
        Preconditions.e(dyks0);
        dyky dyky0 = this.r.f();
        Preconditions.e(dyky0);
        dyko dyko0 = this.r.d();
        Preconditions.e(dyko0);
        return new dyxt(gmcg0, bblp0, dykl0, dyks0, dyky0, dyko0, this.k(), ((ecvz)this.k).a(), dolf.b(this.s), this.a());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebvo ebvo0 = (ebvo)object0;
        ebvo0.b = new dyth(new dyow(this.b()), this.g(), this.d());
        ebvo0.c = new dytd(dolc.b(this.s), new dypj(this.i(), new dypb(this.i(), this.h()), new edmh(this.r.a(), dmgy.a(), easm.a()), new dybv(), new bblp(0x7FFFFFFF, 10)), this.e(), this.d(), this.f(), this.g(), new dycb(this.r.a(), dolc.b(this.s), dmgy.a()), this.h(), this.c(), easp.a(), new bblp(0x7FFFFFFF, 10), new bblp(0x7FFFFFFF, 9), this.j());
        ebvo0.d = new ebwl(this.a(), gfug.c(ecwh.a()));
    }

    final ebst j() {
        return new ebst(this.r.h());
    }

    final etgl k() {
        return new etgl(this.r.a());
    }
}

