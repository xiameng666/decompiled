import android.content.Context;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import j..util.Optional;

final class ebks implements AndroidInjector {
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
    private final dola t;
    private final domv u;
    private final domw v;
    private final dmgr w;

    public ebks(dola dola0, dmgr dmgr0, domw domw0, domv domv0, edor edor0) {
        this.t = dola0;
        this.u = domv0;
        this.v = domw0;
        this.w = dmgr0;
        ebkq ebkq0 = new ebkq(domv0);
        this.a = ebkq0;
        ebkp ebkp0 = new ebkp(domv0);
        this.b = ebkp0;
        eczr eczr0 = new eczr(ebkq0, ebkp0);
        this.c = eczr0;
        this.d = new ecwg();
        ecwf ecwf0 = new ecwf(ebkq0);
        this.e = ecwf0;
        this.f = ebkt.a;
        ecwe ecwe0 = new ecwe(ebkq0, ebkt.a);
        this.g = ecwe0;
        ecwr ecwr0 = new ecwr(ebkq0, eczr0, ecwf0, ecwe0, ebkt.a);
        this.h = ecwr0;
        ecwd ecwd0 = new ecwd(ecwr0, ecwe0);
        this.i = ecwd0;
        dmgz dmgz0 = new dmgz();
        this.j = dmgz0;
        this.k = new ecvz(ecwd0, dmgz0, eczr0);
        edsf edsf0 = new edsf(ebkq0);
        this.l = edsf0;
        dmkm dmkm0 = new dmkm(ebkq0);
        this.m = dmkm0;
        ebkr ebkr0 = new ebkr(edor0);
        this.n = ebkr0;
        edrn edrn0 = new edrn(edsf0, dmkm0, ebkr0);
        this.o = edrn0;
        this.p = DoubleCheck.b(new edrj(edrn0));
        this.q = DoubleCheck.b(edrh.a);
        cjkz cjkz0 = new cjkz(ebkq0);
        this.r = cjkz0;
        this.s = new cjlw(ebkq0, cjkz0);
    }

    final dmgi a() {
        this.u.a();
        return new dmgi(dolf.b(this.t), dmgy.a());
    }

    final dmhi b() {
        return dmhh.b(this.u.a(), dolf.b(this.t), dole.b(this.t), dmgy.a(), this.w.a, Optional.empty());
    }

    final dmue c() {
        return new dmue(this.l(), new dlmc(this.u.a(), dole.b(this.t), dmgy.a()), new dmtn(this.u.a(), dole.b(this.t), dmgy.a(), new earj(new earo(this.u.a(), dole.b(this.t), dmgy.a(), new earr(this.u.a(), dole.b(this.t), dmgy.a())))), new dmuj(this.b(), new fbio(this.u.a(), edtq.b(edtl.a(dmgv.e(dmgy.a())), dolc.b(this.t))), new edmu(new dmkl(this.u.a()), ((edrk)this.p.get()), ((edrg)this.q.get()))), new bblp(1, 10), easp.a(), this.e(), this.h(), new dypr(this.e()), new dmuh(dolc.b(this.t), this.l(), new eeeg(this.u.a(), dolf.b(this.t), dmgy.a())), new dxzo(dolc.b(this.t), dmgy.a(), new bblp(0x7FFFFFFF, 9)));
    }

    final dypj d() {
        return new dypj(this.j(), new dypb(this.j(), this.i()), new edmh(this.u.a(), dmgy.a(), easm.a()), new dybv(), new bblp(0x7FFFFFFF, 10));
    }

    final dypo e() {
        return new dypo(this.u.a(), dole.b(this.t), dmgy.a());
    }

    final dypv f() {
        return new dypv(this.b(), new dlnm(new acqn(this.u.a()), dolf.b(this.t), dole.b(this.t)));
    }

    final dypx g() {
        return new dypx(this.u.a(), dole.b(this.t), dmgy.a());
    }

    final dypz h() {
        return new dypz(this.u.a(), dole.b(this.t), dmgy.a());
    }

    final dyre i() {
        return new dyre(dolc.b(this.t), this.e(), this.g(), this.h(), this.f(), this.a(), this.k(), this.c(), easp.a());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebsf ebsf0 = (ebsf)object0;
        ebsf0.f = dolc.b(this.t);
        ebsf0.g = this.d();
        ebsf0.h = this.f();
        ebsf0.w = this.l();
        ebsf0.i = new dytd(dolc.b(this.t), this.d(), this.f(), this.e(), this.g(), this.h(), new dycb(this.u.a(), dolc.b(this.t), dmgy.a()), this.i(), this.c(), easp.a(), new bblp(0x7FFFFFFF, 10), new bblp(0x7FFFFFFF, 9), this.k());
        ebsf0.j = new dyth(new dyow(this.b()), this.h(), this.e());
        Context context0 = this.u.a();
        frii frii0 = this.u.n();
        Preconditions.e(frii0);
        ebsf0.k = new dxyx(context0, frii0);
        ebsf0.l = dmgy.a();
        ebsf0.m = easl.a();
        ebsf0.n = new bblp(0x7FFFFFFF, 10);
        ebsf0.o = new bblp(0x7FFFFFFF, 9);
        ebsf0.p = new bbll(1, 9);
        ebsf0.q = this.a();
        ebsf0.r = bbnk.a;
        ebsf0.s = new ebwn(this.u.a(), new edse(this.u.a()), DoubleCheck.a(this.s));
        ebsf0.t = this.k();
    }

    final dyxt j() {
        gmcg gmcg0 = this.u.p();
        Preconditions.e(gmcg0);
        bblp bblp0 = new bblp(0x7FFFFFFF, 9);
        dykl dykl0 = this.u.c();
        Preconditions.e(dykl0);
        dyks dyks0 = this.u.e();
        Preconditions.e(dyks0);
        dyky dyky0 = this.u.f();
        Preconditions.e(dyky0);
        dyko dyko0 = this.u.d();
        Preconditions.e(dyko0);
        return new dyxt(gmcg0, bblp0, dykl0, dyks0, dyky0, dyko0, this.l(), ((ecvz)this.k).a(), dolf.b(this.t), this.a());
    }

    final ebst k() {
        return new ebst(this.u.h());
    }

    final etgl l() {
        return new etgl(this.u.a());
    }
}

