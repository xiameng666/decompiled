import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import j..util.Optional;

final class ebpp implements AndroidInjector {
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
    private final dmgr v;
    private final domw w;

    public ebpp(dola dola0, dmgr dmgr0, domw domw0, domv domv0, edor edor0) {
        this.t = domv0;
        this.u = dola0;
        this.v = dmgr0;
        this.w = domw0;
        ebpn ebpn0 = new ebpn(domv0);
        this.a = ebpn0;
        ebpm ebpm0 = new ebpm(domv0);
        this.b = ebpm0;
        eczr eczr0 = new eczr(ebpn0, ebpm0);
        this.c = eczr0;
        this.d = new ecwg();
        ecwf ecwf0 = new ecwf(ebpn0);
        this.e = ecwf0;
        this.f = ebpq.a;
        ecwe ecwe0 = new ecwe(ebpn0, ebpq.a);
        this.g = ecwe0;
        ecwr ecwr0 = new ecwr(ebpn0, eczr0, ecwf0, ecwe0, ebpq.a);
        this.h = ecwr0;
        ecwd ecwd0 = new ecwd(ecwr0, ecwe0);
        this.i = ecwd0;
        dmgz dmgz0 = new dmgz();
        this.j = dmgz0;
        this.k = new ecvz(ecwd0, dmgz0, eczr0);
        edsf edsf0 = new edsf(ebpn0);
        this.l = edsf0;
        dmkm dmkm0 = new dmkm(ebpn0);
        this.m = dmkm0;
        ebpo ebpo0 = new ebpo(edor0);
        this.n = ebpo0;
        edrn edrn0 = new edrn(edsf0, dmkm0, ebpo0);
        this.o = edrn0;
        this.p = DoubleCheck.b(new edrj(edrn0));
        this.q = DoubleCheck.b(edrh.a);
        edre edre0 = new edre(dmkm0);
        this.r = edre0;
        this.s = DoubleCheck.b(new edrf(edre0));
    }

    final dlmc a() {
        return new dlmc(this.t.a(), dole.b(this.u), dmgy.a());
    }

    final dmgi b() {
        this.t.a();
        return new dmgi(dolf.b(this.u), dmgy.a());
    }

    final dmhi c() {
        return dmhh.b(this.t.a(), dolf.b(this.u), dole.b(this.u), dmgy.a(), this.v.a, Optional.empty());
    }

    final dmue d() {
        return new dmue(this.m(), this.a(), ((dmtn)this.l()), this.e(), new bblp(1, 10), easp.a(), this.g(), this.i(), new dypr(this.g()), new dmuh(dolc.b(this.u), this.m(), new eeeg(this.t.a(), dolf.b(this.u), dmgy.a())), new dxzo(dolc.b(this.u), dmgy.a(), new bblp(0x7FFFFFFF, 9)));
    }

    final dmuj e() {
        return new dmuj(this.c(), this.k(), new edmu(new dmkl(this.t.a()), ((edrk)this.p.get()), ((edrg)this.q.get())));
    }

    final dypj f() {
        return new dypj(this.j(), new dypb(this.j(), new dyre(dolc.b(this.u), this.g(), this.h(), this.i(), new dypv(this.c(), new dlnm(new acqn(this.t.a()), dolf.b(this.u), dole.b(this.u))), this.b(), new ebst(this.t.h()), this.d(), easp.a())), new edmh(this.t.a(), dmgy.a(), easm.a()), new dybv(), new bblp(0x7FFFFFFF, 10));
    }

    final dypo g() {
        return new dypo(this.t.a(), dole.b(this.u), dmgy.a());
    }

    final dypx h() {
        return new dypx(this.t.a(), dole.b(this.u), dmgy.a());
    }

    final dypz i() {
        return new dypz(this.t.a(), dole.b(this.u), dmgy.a());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebyi ebyi0 = (ebyi)object0;
        ebyi0.a = new edfu(new edgf(this.c()), new edgi(this.t.a(), dole.b(this.u), dmgy.a()), eass.a(), new edgz(new edtj(dolc.b(this.u), this.k(), edtn.a(), ebpp.n()), this.c(), new edig(this.b())), this.f(), this.h(), this.b(), this.t.a());
        ebyi0.b = new dmtv(this.a(), ((dmtn)this.l()), this.e(), new bblp(1, 10), easp.a(), this.f(), this.g(), this.d(), ((edrc)this.s.get()));
        ebyi0.c = this.g();
        ebyi0.d = new ebwl(this.b(), gfug.c(ecwh.a()));
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
        return new dyxt(gmcg0, bblp0, dykl0, dyks0, dyky0, dyko0, this.m(), ((ecvz)this.k).a(), dolf.b(this.u), this.b());
    }

    final fbio k() {
        return new fbio(this.t.a(), edtq.b(ebpp.n(), dolc.b(this.u)));
    }

    final Object l() {
        return new dmtn(this.t.a(), dole.b(this.u), dmgy.a(), new earj(new earo(this.t.a(), dole.b(this.u), dmgy.a(), new earr(this.t.a(), dole.b(this.u), dmgy.a()))));
    }

    final etgl m() {
        return new etgl(this.t.a());
    }

    static final int n() {
        return edtl.a(dmgv.e(dmgy.a()));
    }
}

