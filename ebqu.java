import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import j..util.Optional;

final class ebqu implements AndroidInjector {
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

    public ebqu(dola dola0, dmgr dmgr0, domw domw0, domv domv0, edor edor0) {
        this.r = dola0;
        this.s = domv0;
        this.t = domw0;
        this.u = dmgr0;
        ebqs ebqs0 = new ebqs(domv0);
        this.a = ebqs0;
        ebqr ebqr0 = new ebqr(domv0);
        this.b = ebqr0;
        eczr eczr0 = new eczr(ebqs0, ebqr0);
        this.c = eczr0;
        this.d = new ecwg();
        ecwf ecwf0 = new ecwf(ebqs0);
        this.e = ecwf0;
        this.f = ebqv.a;
        ecwe ecwe0 = new ecwe(ebqs0, ebqv.a);
        this.g = ecwe0;
        ecwr ecwr0 = new ecwr(ebqs0, eczr0, ecwf0, ecwe0, ebqv.a);
        this.h = ecwr0;
        ecwd ecwd0 = new ecwd(ecwr0, ecwe0);
        this.i = ecwd0;
        dmgz dmgz0 = new dmgz();
        this.j = dmgz0;
        this.k = new ecvz(ecwd0, dmgz0, eczr0);
        edsf edsf0 = new edsf(ebqs0);
        this.l = edsf0;
        dmkm dmkm0 = new dmkm(ebqs0);
        this.m = dmkm0;
        ebqt ebqt0 = new ebqt(edor0);
        this.n = ebqt0;
        edrn edrn0 = new edrn(edsf0, dmkm0, ebqt0);
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
        return new dmue(this.m(), new dlmc(this.s.a(), dole.b(this.r), dmgy.a()), new dmtn(this.s.a(), dole.b(this.r), dmgy.a(), new earj(new earo(this.s.a(), dole.b(this.r), dmgy.a(), new earr(this.s.a(), dole.b(this.r), dmgy.a())))), new dmuj(this.b(), this.l(), new edmu(new dmkl(this.s.a()), ((edrk)this.p.get()), ((edrg)this.q.get()))), new bblp(1, 10), easp.a(), this.e(), this.h(), new dypr(this.e()), new dmuh(dolc.b(this.r), this.m(), new eeeg(this.s.a(), dolf.b(this.r), dmgy.a())), new dxzo(dolc.b(this.r), dmgy.a(), new bblp(0x7FFFFFFF, 9)));
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
        ebzf ebzf0 = (ebzf)object0;
        ebzf0.b = new dytd(dolc.b(this.r), this.d(), this.f(), this.e(), this.g(), this.h(), new dycb(this.s.a(), dolc.b(this.r), dmgy.a()), this.i(), this.c(), easp.a(), new bblp(0x7FFFFFFF, 10), new bblp(0x7FFFFFFF, 9), this.k());
        ebzf0.c = new ebwl(this.a(), gfug.c(ecwh.a()));
        ebzf0.d = new edfu(new edgf(this.b()), new edgi(this.s.a(), dole.b(this.r), dmgy.a()), eass.a(), new edgz(new edtj(dolc.b(this.r), this.l(), edtn.a(), ebqu.n()), this.b(), new edig(this.a())), this.d(), this.g(), this.a(), this.s.a());
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
        return new dyxt(gmcg0, bblp0, dykl0, dyks0, dyky0, dyko0, this.m(), ((ecvz)this.k).a(), dolf.b(this.r), this.a());
    }

    final ebst k() {
        return new ebst(this.s.h());
    }

    final fbio l() {
        return new fbio(this.s.a(), edtq.b(ebqu.n(), dolc.b(this.r)));
    }

    final etgl m() {
        return new etgl(this.s.a());
    }

    static final int n() {
        return edtl.a(dmgv.e(dmgy.a()));
    }
}

