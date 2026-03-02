import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import j..util.Optional;

final class ebmq implements AndroidInjector {
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
    private final dola r;
    private final domv s;
    private final domw t;
    private final dmgr u;

    public ebmq(dola dola0, dmgr dmgr0, domw domw0, domv domv0, edor edor0) {
        this.r = dola0;
        this.s = domv0;
        this.t = domw0;
        this.u = dmgr0;
        ebmo ebmo0 = new ebmo(domv0);
        this.a = ebmo0;
        ebmn ebmn0 = new ebmn(domv0);
        this.b = ebmn0;
        eczr eczr0 = new eczr(ebmo0, ebmn0);
        this.c = eczr0;
        this.d = new ecwg();
        ecwf ecwf0 = new ecwf(ebmo0);
        this.e = ecwf0;
        this.f = ebmr.a;
        ecwe ecwe0 = new ecwe(ebmo0, ebmr.a);
        this.g = ecwe0;
        ecwr ecwr0 = new ecwr(ebmo0, eczr0, ecwf0, ecwe0, ebmr.a);
        this.h = ecwr0;
        ecwd ecwd0 = new ecwd(ecwr0, ecwe0);
        this.i = ecwd0;
        dmgz dmgz0 = new dmgz();
        this.j = dmgz0;
        this.k = new ecvz(ecwd0, dmgz0, eczr0);
        edsf edsf0 = new edsf(ebmo0);
        this.l = edsf0;
        dmkm dmkm0 = new dmkm(ebmo0);
        this.m = dmkm0;
        ebmp ebmp0 = new ebmp(edor0);
        this.n = ebmp0;
        edrn edrn0 = new edrn(edsf0, dmkm0, ebmp0);
        this.o = edrn0;
        this.p = DoubleCheck.b(new edrj(edrn0));
        this.q = DoubleCheck.b(edrh.a);
    }

    final dmgi a() {
        this.s.a();
        return new dmgi(dolf.b(this.r), dmgy.a());
    }

    final dmhi b() {
        return dmhh.b(this.s.a(), dolf.b(this.r), dole.b(this.r), dmgy.a(), this.u.a, Optional.empty());
    }

    final dmue c() {
        return new dmue(this.l(), new dlmc(this.s.a(), dole.b(this.r), dmgy.a()), new dmtn(this.s.a(), dole.b(this.r), dmgy.a(), new earj(new earo(this.s.a(), dole.b(this.r), dmgy.a(), new earr(this.s.a(), dole.b(this.r), dmgy.a())))), new dmuj(this.b(), new fbio(this.s.a(), edtq.b(edtl.a(dmgv.e(dmgy.a())), dolc.b(this.r))), new edmu(new dmkl(this.s.a()), ((edrk)this.p.get()), ((edrg)this.q.get()))), new bblp(1, 10), easp.a(), this.e(), this.h(), new dypr(this.e()), new dmuh(dolc.b(this.r), this.l(), new eeeg(this.s.a(), dolf.b(this.r), dmgy.a())), new dxzo(dolc.b(this.r), dmgy.a(), new bblp(0x7FFFFFFF, 9)));
    }

    final dypj d() {
        return new dypj(this.j(), new dypb(this.j(), this.i()), new edmh(this.s.a(), dmgy.a(), easm.a()), new dybv(), new bblp(0x7FFFFFFF, 10));
    }

    final dypo e() {
        return new dypo(this.s.a(), dole.b(this.r), dmgy.a());
    }

    final dypv f() {
        return new dypv(this.b(), new dlnm(new acqn(this.s.a()), dolf.b(this.r), dole.b(this.r)));
    }

    final dypx g() {
        return new dypx(this.s.a(), dole.b(this.r), dmgy.a());
    }

    final dypz h() {
        return new dypz(this.s.a(), dole.b(this.r), dmgy.a());
    }

    final dyre i() {
        return new dyre(dolc.b(this.r), this.e(), this.g(), this.h(), this.f(), this.a(), this.k(), this.c(), easp.a());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebus ebus0 = (ebus)object0;
        ebus0.f = new dytd(dolc.b(this.r), this.d(), this.f(), this.e(), this.g(), this.h(), new dycb(this.s.a(), dolc.b(this.r), dmgy.a()), this.i(), this.c(), easp.a(), new bblp(0x7FFFFFFF, 10), new bblp(0x7FFFFFFF, 9), this.k());
        ebus0.g = this.d();
        ebus0.h = new ebwl(this.a(), gfug.c(ecwh.a()));
    }

    final dyxt j() {
        gmcg gmcg0 = this.s.p();
        Preconditions.e(gmcg0);
        bblp bblp0 = new bblp(0x7FFFFFFF, 9);
        dykl dykl0 = this.s.c();
        Preconditions.e(dykl0);
        dyks dyks0 = this.s.e();
        Preconditions.e(dyks0);
        dyky dyky0 = this.s.f();
        Preconditions.e(dyky0);
        dyko dyko0 = this.s.d();
        Preconditions.e(dyko0);
        return new dyxt(gmcg0, bblp0, dykl0, dyks0, dyky0, dyko0, this.l(), ((ecvz)this.k).a(), dolf.b(this.r), this.a());
    }

    final ebst k() {
        return new ebst(this.s.h());
    }

    final etgl l() {
        return new etgl(this.s.a());
    }
}

