import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import j..util.Optional;

final class ebml implements AndroidInjector {
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

    public ebml(dola dola0, dmgr dmgr0, domw domw0, domv domv0, edor edor0) {
        this.r = dola0;
        this.s = domv0;
        this.t = domw0;
        this.u = dmgr0;
        ebmj ebmj0 = new ebmj(domv0);
        this.a = ebmj0;
        ebmi ebmi0 = new ebmi(domv0);
        this.b = ebmi0;
        eczr eczr0 = new eczr(ebmj0, ebmi0);
        this.c = eczr0;
        this.d = new ecwg();
        ecwf ecwf0 = new ecwf(ebmj0);
        this.e = ecwf0;
        this.f = ebmm.a;
        ecwe ecwe0 = new ecwe(ebmj0, ebmm.a);
        this.g = ecwe0;
        ecwr ecwr0 = new ecwr(ebmj0, eczr0, ecwf0, ecwe0, ebmm.a);
        this.h = ecwr0;
        ecwd ecwd0 = new ecwd(ecwr0, ecwe0);
        this.i = ecwd0;
        dmgz dmgz0 = new dmgz();
        this.j = dmgz0;
        this.k = new ecvz(ecwd0, dmgz0, eczr0);
        edsf edsf0 = new edsf(ebmj0);
        this.l = edsf0;
        dmkm dmkm0 = new dmkm(ebmj0);
        this.m = dmkm0;
        ebmk ebmk0 = new ebmk(edor0);
        this.n = ebmk0;
        edrn edrn0 = new edrn(edsf0, dmkm0, ebmk0);
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
        return new dmue(this.m(), new dlmc(this.s.a(), dole.b(this.r), dmgy.a()), new dmtn(this.s.a(), dole.b(this.r), dmgy.a(), new earj(new earo(this.s.a(), dole.b(this.r), dmgy.a(), new earr(this.s.a(), dole.b(this.r), dmgy.a())))), new dmuj(this.b(), new fbio(this.s.a(), edtq.b(edtl.a(dmgv.e(dmgy.a())), dolc.b(this.r))), new edmu(new dmkl(this.s.a()), ((edrk)this.p.get()), ((edrg)this.q.get()))), new bblp(1, 10), easp.a(), this.f(), this.i(), new dypr(this.f()), new dmuh(dolc.b(this.r), this.m(), new eeeg(this.s.a(), dolf.b(this.r), dmgy.a())), new dxzo(dolc.b(this.r), dmgy.a(), new bblp(0x7FFFFFFF, 9)));
    }

    final dycb d() {
        return new dycb(this.s.a(), dolc.b(this.r), dmgy.a());
    }

    final dypj e() {
        return new dypj(this.k(), new dypb(this.k(), this.j()), new edmh(this.s.a(), dmgy.a(), easm.a()), new dybv(), new bblp(0x7FFFFFFF, 10));
    }

    final dypo f() {
        return new dypo(this.s.a(), dole.b(this.r), dmgy.a());
    }

    final dypv g() {
        return new dypv(this.b(), new dlnm(new acqn(this.s.a()), dolf.b(this.r), dole.b(this.r)));
    }

    final dypx h() {
        return new dypx(this.s.a(), dole.b(this.r), dmgy.a());
    }

    final dypz i() {
        return new dypz(this.s.a(), dole.b(this.r), dmgy.a());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebup ebup0 = (ebup)object0;
        ebup0.a = new dytd(dolc.b(this.r), this.e(), this.g(), this.f(), this.h(), this.i(), this.d(), this.j(), this.c(), easp.a(), new bblp(0x7FFFFFFF, 10), new bblp(0x7FFFFFFF, 9), this.l());
        ebup0.b = this.d();
        ebup0.c = this.e();
        ebup0.d = new ebwl(this.a(), gfug.c(ecwh.a()));
    }

    final dyre j() {
        return new dyre(dolc.b(this.r), this.f(), this.h(), this.i(), this.g(), this.a(), this.l(), this.c(), easp.a());
    }

    final dyxt k() {
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
        return new dyxt(gmcg0, bblp0, dykl0, dyks0, dyky0, dyko0, this.m(), ((ecvz)this.k).a(), dolf.b(this.r), this.a());
    }

    final ebst l() {
        return new ebst(this.s.h());
    }

    final etgl m() {
        return new etgl(this.s.a());
    }
}

