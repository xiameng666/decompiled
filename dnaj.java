import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

final class dnaj implements AndroidInjector {
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
    private final domv r;
    private final eefy s;
    private final domw t;
    private final edor u;
    private final dmdk v;
    private final edlf w;

    public dnaj(dmdk dmdk0, eefy eefy0, dolg dolg0, dxed dxed0, domw domw0, edlf edlf0, doly doly0, edor edor0, domv domv0) {
        this.o = dxed0;
        this.p = dolg0;
        this.q = doly0;
        this.r = domv0;
        this.s = eefy0;
        this.t = domw0;
        this.u = edor0;
        this.v = dmdk0;
        this.w = edlf0;
        dnae dnae0 = new dnae(dolg0);
        this.a = dnae0;
        dnai dnai0 = new dnai(doly0);
        this.b = dnai0;
        dnah dnah0 = new dnah(dxed0);
        this.c = dnah0;
        this.d = DoubleCheck.b(new dmsw(dnae0, dnai0, dnah0));
        this.e = DoubleCheck.b(edmr.a);
        dnaf dnaf0 = new dnaf(domv0);
        this.f = dnaf0;
        edsf edsf0 = new edsf(dnaf0);
        this.g = edsf0;
        dmkm dmkm0 = new dmkm(dnaf0);
        this.h = dmkm0;
        dnag dnag0 = new dnag(edor0);
        this.i = dnag0;
        edrn edrn0 = new edrn(edsf0, dmkm0, dnag0);
        this.j = edrn0;
        this.k = DoubleCheck.b(new edrj(edrn0));
        edsk edsk0 = new edsk(dmkm0, dybw.a);
        this.l = edsk0;
        this.m = DoubleCheck.b(new edsc(edsk0));
        this.n = DoubleCheck.b(new edlr(edls.a));
    }

    final tyb a() {
        return efmh.b(this.q.c());
    }

    final dmgi b() {
        this.r.a();
        return new dmgi(this.p.d(), dmgy.a());
    }

    final dmsn c() {
        Account account0 = this.p.a();
        du du0 = this.q.c();
        azts azts0 = this.o.a();
        etgl etgl0 = this.g();
        efma efma0 = this.e();
        fscg fscg0 = (fscg)this.e.get();
        edtj edtj0 = new edtj(this.p.a(), new fbio(this.r.a(), edtq.b(dnaj.h(), this.p.a())), edtn.a(), dnaj.h());
        dnpp dnpp0 = this.d();
        dmsv dmsv0 = (dmsv)this.d.get();
        edrk edrk0 = (edrk)this.k.get();
        domj domj0 = this.r.b();
        Preconditions.e(domj0);
        return new dmsn(account0, du0, azts0, etgl0, efma0, fscg0, edtj0, dnpp0, dmsv0, edrk0, domj0);
    }

    final dnpp d() {
        return new dnpp(this.r.a(), this.b());
    }

    final efma e() {
        return new efma(this.r.a());
    }

    final fsac f() {
        Context context0 = this.r.a();
        du du0 = this.q.c();
        edle edle0 = edlf.a();
        etgl etgl0 = this.g();
        azts azts0 = this.o.a();
        Account account0 = this.p.a();
        AccountInfo accountInfo0 = this.p.b();
        cqxc cqxc0 = dpsv.a(this.r.a(), this.p.a());
        this.r.a();
        dlvj dlvj0 = new dlvj(cqxc0, new cjlv(this.r.a(), new cjky(this.r.a())));
        domj domj0 = this.r.b();
        Preconditions.e(domj0);
        dmsn dmsn0 = this.c();
        dmtl dmtl0 = new dmtl(this.q.c(), this.o.a(), this.e(), this.p.a(), this.d(), ((edsh)this.m.get()));
        ibrt ibrt0 = donc.a();
        Context context1 = this.r.a();
        frii frii0 = this.r.n();
        Preconditions.e(frii0);
        edss edss0 = new edss(new edta(ibrt0, new dyaf(context1, frii0), this.p.a()));
        dlvb dlvb0 = new dlvb(this.q.c(), this.p.a(), this.b(), this.o.a());
        return new dlus(context0, du0, edle0, etgl0, azts0, account0, accountInfo0, dlvj0, this.v.a, domj0, dmsn0, dmtl0, edss0, dlvb0);
    }

    final etgl g() {
        return new etgl(this.q.e());
    }

    static final int h() {
        return edtl.a(dmgv.e(dmgy.a()));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dmyx dmyx0 = (dmyx)object0;
        dmyx0.aB = this.o.a();
        dmyx0.c = this.p.a();
        dmyx0.d = this.q.c();
        dmyx0.ag = (dmsv)this.d.get();
        dmyx0.ah = this.c();
        dmyx0.ai = this.d();
        fhwk fhwk0 = this.r.i();
        Preconditions.e(fhwk0);
        dmyx0.aj = fhwk0;
        dmyx0.ak = this.r.j();
        dmyx0.al = this.r.g();
        dmyx0.am = new dyct();
        du du0 = this.q.c();
        du du1 = this.q.c();
        Account account0 = this.p.a();
        edig edig0 = new edig(this.b());
        edrk edrk0 = (edrk)this.k.get();
        fhwk fhwk1 = this.r.i();
        Preconditions.e(fhwk1);
        fhxi fhxi0 = this.r.j();
        fhvw fhvw0 = this.r.g();
        edjx edjx0 = new edjx(du0, new edev(du1, account0, edig0, edrk0, this.s.b, this.s.a, fhwk1, fhxi0, fhvw0));
        edjx0.b();
        dmyx0.an = edjx0;
        dmyx0.ao = new edfe(this.p.a(), this.o.a(), this.s.b);
        dmet dmet0 = new dmet(this.r.a(), this.p.a(), this.p.c(), new bblp(1, 10));
        tyb tyb0 = this.a();
        edoq edoq0 = this.u.a();
        etgl etgl0 = this.g();
        edsh edsh0 = (edsh)this.m.get();
        fuot fuot0 = this.r.o();
        Preconditions.e(fuot0);
        dmyx0.ap = new dnbs(dmet0, tyb0, edoq0, etgl0, edsh0, fuot0);
        lps lps0 = this.q.d();
        Context context0 = this.r.a();
        Account account1 = this.p.a();
        azts azts0 = this.o.a();
        etgl etgl1 = this.g();
        dmyx0.aq = new dlvo(lps0, context0, account1, azts0, this.v.a, etgl1);
        lps lps1 = this.q.d();
        Account account2 = this.p.a();
        azts azts1 = this.o.a();
        dnxz dnxz0 = new dnxz(this.v.a);
        dnza dnza0 = new dnza(this.p.a(), this.o.a(), this.f());
        dnzf dnzf0 = new dnzf(this.p.a(), this.o.a(), this.f());
        du du2 = this.q.c();
        edlq edlq0 = (edlq)this.n.get();
        edsh edsh1 = (edsh)this.m.get();
        dmkl dmkl0 = new dmkl(this.r.a());
        dmyx0.ar = new dnxx(lps1, account2, azts1, dnxz0, new dnyt(ggeo.n(Integer.valueOf(1), dnza0, Integer.valueOf(6), dnzf0, Integer.valueOf(0), new dnyv())), du2, this.v.a, gfqx.a, edlq0, edsh1, dmkl0);
        dmyx0.ay = new dlvp(this.r.a(), this.f(), new frzk(this.g(), new frzh(), this.q.c(), this.q.a()));
        dmyx0.az = new dlvq(this.b(), this.v.a);
        dmyx0.as = new bblp(0x7FFFFFFF, 10);
        dmyx0.at = this.a();
    }
}

