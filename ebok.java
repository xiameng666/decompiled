import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import j..util.Optional;

final class ebok implements AndroidInjector {
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
    final Provider t;
    final Provider u;
    private final domv v;
    private final dola w;
    private final domw x;

    public ebok(dola dola0, domw domw0, domv domv0, edor edor0) {
        this.v = domv0;
        this.w = dola0;
        this.x = domw0;
        eboi eboi0 = new eboi(domv0);
        this.a = eboi0;
        eboh eboh0 = new eboh(domv0);
        this.b = eboh0;
        eczr eczr0 = new eczr(eboi0, eboh0);
        this.c = eczr0;
        this.d = new ecwg();
        ecwf ecwf0 = new ecwf(eboi0);
        this.e = ecwf0;
        this.f = ebol.a;
        ecwe ecwe0 = new ecwe(eboi0, ebol.a);
        this.g = ecwe0;
        ecwr ecwr0 = new ecwr(eboi0, eczr0, ecwf0, ecwe0, ebol.a);
        this.h = ecwr0;
        ecwd ecwd0 = new ecwd(ecwr0, ecwe0);
        this.i = ecwd0;
        dmgz dmgz0 = new dmgz();
        this.j = dmgz0;
        this.k = new ecvz(ecwd0, dmgz0, eczr0);
        edsf edsf0 = new edsf(eboi0);
        this.l = edsf0;
        dmkm dmkm0 = new dmkm(eboi0);
        this.m = dmkm0;
        eboj eboj0 = new eboj(edor0);
        this.n = eboj0;
        edrn edrn0 = new edrn(edsf0, dmkm0, eboj0);
        this.o = edrn0;
        this.p = DoubleCheck.b(new edrj(edrn0));
        this.q = DoubleCheck.b(edrh.a);
        dolc dolc0 = new dolc(dola0);
        this.r = dolc0;
        this.s = new dycc(eboi0, dolc0);
        cjkz cjkz0 = new cjkz(eboi0);
        this.t = cjkz0;
        this.u = new cjlw(eboi0, cjkz0);
    }

    final dmgi a() {
        this.v.a();
        return new dmgi(dolf.b(this.w), dmgy.a());
    }

    final dmhi b() {
        return dmhh.b(this.v.a(), dolf.b(this.w), dole.b(this.w), dmgy.a(), null, Optional.empty());
    }

    final dmue c() {
        return new dmue(this.m(), new dlmc(this.v.a(), dole.b(this.w), dmgy.a()), new dmtn(this.v.a(), dole.b(this.w), dmgy.a(), new earj(new earo(this.v.a(), dole.b(this.w), dmgy.a(), new earr(this.v.a(), dole.b(this.w), dmgy.a())))), new dmuj(this.b(), this.l(), new edmu(new dmkl(this.v.a()), ((edrk)this.p.get()), ((edrg)this.q.get()))), new bblp(1, 10), easp.a(), this.e(), this.h(), new dypr(this.e()), new dmuh(dolc.b(this.w), this.m(), new eeeg(this.v.a(), dolf.b(this.w), dmgy.a())), new dxzo(dolc.b(this.w), dmgy.a(), new bblp(0x7FFFFFFF, 9)));
    }

    final dypj d() {
        return new dypj(this.j(), new dypb(this.j(), this.i()), new edmh(this.v.a(), dmgy.a(), easm.a()), new dybv(), new bblp(0x7FFFFFFF, 10));
    }

    final dypo e() {
        return new dypo(this.v.a(), dole.b(this.w), dmgy.a());
    }

    final dypv f() {
        return new dypv(this.b(), new dlnm(new acqn(this.v.a()), dolf.b(this.w), dole.b(this.w)));
    }

    final dypx g() {
        return new dypx(this.v.a(), dole.b(this.w), dmgy.a());
    }

    final dypz h() {
        return new dypz(this.v.a(), dole.b(this.w), dmgy.a());
    }

    final dyre i() {
        return new dyre(dolc.b(this.w), this.e(), this.g(), this.h(), this.f(), this.a(), this.k(), this.c(), easp.a());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebxq ebxq0 = (ebxq)object0;
        ebxq0.p = eczo.b(this.v.a());
        ebxq0.d = this.g();
        ebxq0.e = this.e();
        ebxq0.f = new dytd(dolc.b(this.w), this.d(), this.f(), this.e(), this.g(), this.h(), new dycb(this.v.a(), dolc.b(this.w), dmgy.a()), this.i(), this.c(), easp.a(), new bblp(0x7FFFFFFF, 10), new bblp(0x7FFFFFFF, 9), this.k());
        ebxq0.g = this.d();
        ebxq0.h = this.h();
        ebxq0.i = new edfu(new edgf(this.b()), new edgi(this.v.a(), dole.b(this.w), dmgy.a()), eass.a(), new edgz(new edtj(dolc.b(this.w), this.l(), edtn.a(), ebok.n()), this.b(), new edig(this.a())), this.d(), this.g(), this.a(), this.v.a());
        ebxq0.j = this.a();
        ebxq0.k = DoubleCheck.a(this.s);
        ebxq0.l = DoubleCheck.a(this.u);
        ebxq0.m = new bblp(0x7FFFFFFF, 10);
        ebxq0.n = dolc.b(this.w);
    }

    final dyxt j() {
        gmcg gmcg0 = this.v.p();
        Preconditions.e(gmcg0);
        bblp bblp0 = new bblp(0x7FFFFFFF, 9);
        dykl dykl0 = this.v.c();
        Preconditions.e(dykl0);
        dyks dyks0 = this.v.e();
        Preconditions.e(dyks0);
        dyky dyky0 = this.v.f();
        Preconditions.e(dyky0);
        dyko dyko0 = this.v.d();
        Preconditions.e(dyko0);
        return new dyxt(gmcg0, bblp0, dykl0, dyks0, dyky0, dyko0, this.m(), ((ecvz)this.k).a(), dolf.b(this.w), this.a());
    }

    final ebst k() {
        return new ebst(this.v.h());
    }

    final fbio l() {
        return new fbio(this.v.a(), edtq.b(ebok.n(), dolc.b(this.w)));
    }

    final etgl m() {
        return new etgl(this.v.a());
    }

    static final int n() {
        return edtl.a(dmgv.e(dmgy.a()));
    }
}

