import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import j..util.Optional;

final class ebqf implements AndroidInjector {
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

    public ebqf(dola dola0, dmgr dmgr0, domw domw0, domv domv0, edor edor0) {
        this.r = dola0;
        this.s = domv0;
        this.t = domw0;
        this.u = dmgr0;
        ebqd ebqd0 = new ebqd(domv0);
        this.a = ebqd0;
        ebqc ebqc0 = new ebqc(domv0);
        this.b = ebqc0;
        eczr eczr0 = new eczr(ebqd0, ebqc0);
        this.c = eczr0;
        this.d = new ecwg();
        ecwf ecwf0 = new ecwf(ebqd0);
        this.e = ecwf0;
        this.f = ebqg.a;
        ecwe ecwe0 = new ecwe(ebqd0, ebqg.a);
        this.g = ecwe0;
        ecwr ecwr0 = new ecwr(ebqd0, eczr0, ecwf0, ecwe0, ebqg.a);
        this.h = ecwr0;
        ecwd ecwd0 = new ecwd(ecwr0, ecwe0);
        this.i = ecwd0;
        dmgz dmgz0 = new dmgz();
        this.j = dmgz0;
        this.k = new ecvz(ecwd0, dmgz0, eczr0);
        edsf edsf0 = new edsf(ebqd0);
        this.l = edsf0;
        dmkm dmkm0 = new dmkm(ebqd0);
        this.m = dmkm0;
        ebqe ebqe0 = new ebqe(edor0);
        this.n = ebqe0;
        edrn edrn0 = new edrn(edsf0, dmkm0, ebqe0);
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
        return new dmue(this.k(), new dlmc(this.s.a(), dole.b(this.r), dmgy.a()), new dmtn(this.s.a(), dole.b(this.r), dmgy.a(), new earj(new earo(this.s.a(), dole.b(this.r), dmgy.a(), new earr(this.s.a(), dole.b(this.r), dmgy.a())))), new dmuj(this.b(), new fbio(this.s.a(), edtq.b(edtl.a(dmgv.e(dmgy.a())), dolc.b(this.r))), new edmu(new dmkl(this.s.a()), ((edrk)this.p.get()), ((edrg)this.q.get()))), new bblp(1, 10), easp.a(), this.d(), this.g(), new dypr(this.d()), new dmuh(dolc.b(this.r), this.k(), new eeeg(this.s.a(), dolf.b(this.r), dmgy.a())), new dxzo(dolc.b(this.r), dmgy.a(), new bblp(0x7FFFFFFF, 9)));
    }

    final dypo d() {
        return new dypo(this.s.a(), dole.b(this.r), dmgy.a());
    }

    final dypv e() {
        return new dypv(this.b(), new dlnm(new acqn(this.s.a()), dolf.b(this.r), dole.b(this.r)));
    }

    final dypx f() {
        return new dypx(this.s.a(), dole.b(this.r), dmgy.a());
    }

    final dypz g() {
        return new dypz(this.s.a(), dole.b(this.r), dmgy.a());
    }

    final dyre h() {
        return new dyre(dolc.b(this.r), this.d(), this.f(), this.g(), this.e(), this.a(), this.j(), this.c(), easp.a());
    }

    final dyxt i() {
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
        return new dyxt(gmcg0, bblp0, dykl0, dyks0, dyky0, dyko0, this.k(), ((ecvz)this.k).a(), dolf.b(this.r), this.a());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebyu ebyu0 = (ebyu)object0;
        ebyu0.d = new dytd(dolc.b(this.r), new dypj(this.i(), new dypb(this.i(), this.h()), new edmh(this.s.a(), dmgy.a(), easm.a()), new dybv(), new bblp(0x7FFFFFFF, 10)), this.e(), this.d(), this.f(), this.g(), new dycb(this.s.a(), dolc.b(this.r), dmgy.a()), this.h(), this.c(), easp.a(), new bblp(0x7FFFFFFF, 10), new bblp(0x7FFFFFFF, 9), this.j());
        ebyu0.e = new ebwl(this.a(), gfug.c(ecwh.a()));
    }

    final ebst j() {
        return new ebst(this.s.h());
    }

    final etgl k() {
        return new etgl(this.s.a());
    }
}

