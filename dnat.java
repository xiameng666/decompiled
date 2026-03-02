import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import j..util.Optional;

final class dnat implements AndroidInjector {
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
    private final dxed o;
    private final dolg p;
    private final doly q;
    private final edor r;
    private final domv s;
    private final domw t;
    private final eefy u;
    private final dmdk v;
    private final edlf w;

    public dnat(dmdk dmdk0, eefy eefy0, dolg dolg0, dxed dxed0, domw domw0, edlf edlf0, doly doly0, edor edor0, domv domv0) {
        this.o = dxed0;
        this.p = dolg0;
        this.q = doly0;
        this.r = edor0;
        this.s = domv0;
        this.t = domw0;
        this.u = eefy0;
        this.v = dmdk0;
        this.w = edlf0;
        dnap dnap0 = new dnap(domv0);
        this.a = dnap0;
        dmkm dmkm0 = new dmkm(dnap0);
        this.b = dmkm0;
        edsk edsk0 = new edsk(dmkm0, dybw.a);
        this.c = edsk0;
        this.d = DoubleCheck.b(new edsc(edsk0));
        this.e = DoubleCheck.b(edmr.a);
        dnao dnao0 = new dnao(dolg0);
        this.f = dnao0;
        dnas dnas0 = new dnas(doly0);
        this.g = dnas0;
        dnar dnar0 = new dnar(dxed0);
        this.h = dnar0;
        this.i = DoubleCheck.b(new dmsw(dnao0, dnas0, dnar0));
        edsf edsf0 = new edsf(dnap0);
        this.j = edsf0;
        dnaq dnaq0 = new dnaq(edor0);
        this.k = dnaq0;
        edrn edrn0 = new edrn(edsf0, dmkm0, dnaq0);
        this.l = edrn0;
        this.m = DoubleCheck.b(new edrj(edrn0));
        this.n = DoubleCheck.b(new edlr(edls.a));
    }

    final tyb a() {
        return efmh.b(this.q.c());
    }

    final dmgi b() {
        this.s.a();
        return new dmgi(this.p.d(), dmgy.a());
    }

    final dmhi c() {
        return dmhh.b(this.s.a(), this.p.d(), this.p.c(), dmgy.a(), null, Optional.empty());
    }

    final dmkl d() {
        return new dmkl(this.s.a());
    }

    final dmsn e() {
        Account account0 = this.p.a();
        du du0 = this.q.c();
        azts azts0 = this.o.a();
        etgl etgl0 = this.k();
        efma efma0 = this.h();
        fscg fscg0 = (fscg)this.e.get();
        edtj edtj0 = new edtj(this.p.a(), new fbio(this.s.a(), edtq.b(dnat.m(), this.p.a())), edtn.a(), dnat.m());
        dnpp dnpp0 = this.g();
        dmsv dmsv0 = (dmsv)this.i.get();
        edrk edrk0 = (edrk)this.m.get();
        domj domj0 = this.s.b();
        Preconditions.e(domj0);
        return new dmsn(account0, du0, azts0, etgl0, efma0, fscg0, edtj0, dnpp0, dmsv0, edrk0, domj0);
    }

    final dmtl f() {
        return new dmtl(this.q.c(), this.o.a(), this.h(), this.p.a(), this.g(), ((edsh)this.d.get()));
    }

    final dnpp g() {
        return new dnpp(this.s.a(), this.b());
    }

    final efma h() {
        return new efma(this.s.a());
    }

    final fsac i() {
        Context context0 = this.s.a();
        du du0 = this.q.c();
        edle edle0 = edlf.a();
        etgl etgl0 = this.k();
        azts azts0 = this.o.a();
        Account account0 = this.p.a();
        AccountInfo accountInfo0 = this.p.b();
        cqxc cqxc0 = dpsv.a(this.s.a(), this.p.a());
        this.s.a();
        dlvj dlvj0 = new dlvj(cqxc0, new cjlv(this.s.a(), new cjky(this.s.a())));
        domj domj0 = this.s.b();
        Preconditions.e(domj0);
        dmsn dmsn0 = this.e();
        dmtl dmtl0 = this.f();
        ibrt ibrt0 = donc.a();
        Context context1 = this.s.a();
        frii frii0 = this.s.n();
        Preconditions.e(frii0);
        edss edss0 = new edss(new edta(ibrt0, new dyaf(context1, frii0), this.p.a()));
        dlvb dlvb0 = new dlvb(this.q.c(), this.p.a(), this.b(), this.o.a());
        return new dlus(context0, du0, edle0, etgl0, azts0, account0, accountInfo0, dlvj0, this.v.a, domj0, dmsn0, dmtl0, edss0, dlvb0);
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dndr dndr0 = (dndr)object0;
        dndr0.aY = this.o.a();
        dndr0.c = this.p.a();
        dndr0.d = this.q.c();
        dndr0.ag = new dnnr(this.r.a());
        this.r.a();
        dndr0.ah = new dnns(new dnnt());
        dmet dmet0 = new dmet(this.s.a(), this.p.a(), this.p.c(), new bblp(1, 10));
        tyb tyb0 = this.a();
        edoq edoq0 = this.r.a();
        etgl etgl0 = this.k();
        edsh edsh0 = (edsh)this.d.get();
        fuot fuot0 = this.s.o();
        Preconditions.e(fuot0);
        dndr0.ai = new dnbs(dmet0, tyb0, edoq0, etgl0, edsh0, fuot0);
        dndr0.aj = new dnhk();
        dndr0.ak = new dnhr(this.q.c());
        dndr0.al = new dngl(this.q.c(), this.c(), this.e(), this.d(), this.a(), this.g(), this.h(), this.k(), this.f(), this.p.a());
        dndr0.am = new dnhi(this.q.c(), this.c(), this.e(), this.d(), this.a(), this.g(), this.h(), this.k(), this.f(), this.p.a());
        dndr0.an = new dnhp(this.f(), this.j());
        dndr0.ao = new dnhx(this.e());
        dndr0.ap = new dnia(this.e());
        dndr0.aq = new dndv(this.q.c(), this.d(), ((edsh)this.d.get()), this.s.g(), this.s.j());
        dndr0.ar = new dnhl();
        dndr0.as = this.t.a();
        dndr0.at = this.e();
        dndr0.au = (dmsv)this.i.get();
        dndr0.av = this.g();
        fhwk fhwk0 = this.s.i();
        Preconditions.e(fhwk0);
        dndr0.aw = fhwk0;
        dndr0.ax = this.s.g();
        dndr0.ay = this.s.j();
        dndr0.az = (edsh)this.d.get();
        dndr0.aA = new dnkx(dnat.l());
        dndr0.aU = this.k();
        dndr0.aB = new dyct();
        dndr0.aC = new edfe(this.p.a(), this.o.a(), this.u.b);
        dndr0.aD = new edli(this.b());
        dndr0.aE = new edrm(new edse(this.s.a()), this.d(), this.r.a());
        lps lps0 = this.q.d();
        Account account0 = this.p.a();
        azts azts0 = this.o.a();
        dnxz dnxz0 = new dnxz(this.v.a);
        dnza dnza0 = new dnza(this.p.a(), this.o.a(), this.i());
        dnzf dnzf0 = new dnzf(this.p.a(), this.o.a(), this.i());
        du du0 = this.q.c();
        edlq edlq0 = (edlq)this.n.get();
        edsh edsh1 = (edsh)this.d.get();
        dmkl dmkl0 = this.d();
        dndr0.aF = new dnxx(lps0, account0, azts0, dnxz0, new dnyt(ggeo.n(Integer.valueOf(1), dnza0, Integer.valueOf(6), dnzf0, Integer.valueOf(0), new dnyv())), du0, this.v.a, gfqx.a, edlq0, edsh1, dmkl0);
        lps lps1 = this.q.d();
        Context context0 = this.s.a();
        Account account1 = this.p.a();
        azts azts1 = this.o.a();
        etgl etgl1 = this.k();
        dndr0.aG = new dlvo(lps1, context0, account1, azts1, this.v.a, etgl1);
        dndr0.aV = new dlvp(this.s.a(), this.i(), new frzk(this.k(), new frzh(), this.q.c(), this.q.a()));
        dndr0.aW = new dlvq(this.b(), this.v.a);
        dndr0.aH = this.s.h();
        dndr0.aI = new bblp(0x7FFFFFFF, 10);
        dndr0.aJ = this.a();
        dndr0.aL = new dqks(this.o.a());
        dndr0.aM = this.f();
        dndr0.aX = this.j();
        dndr0.aN = this.r.a();
        dndr0.aO = new fuok();
        du du1 = this.q.c();
        etgl etgl2 = this.k();
        dnpp dnpp0 = this.g();
        domj domj0 = this.s.b();
        Preconditions.e(domj0);
        dndr0.b = new dnhu(du1, etgl2, dnpp0, domj0);
    }

    final eczo j() {
        return eczo.b(this.s.a());
    }

    final etgl k() {
        return new etgl(this.q.e());
    }

    static final boolean l() {
        return dmgv.e(dmgy.a());
    }

    static final int m() {
        return edtl.a(dnat.l());
    }
}

