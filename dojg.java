import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

final class dojg implements AndroidInjector {
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
    private final dolg t;
    private final dxed u;
    private final domv v;
    private final doly w;
    private final dmdk x;
    private final edlf y;

    public dojg(dmdk dmdk0, dolg dolg0, dxed dxed0, edlf edlf0, doly doly0, domv domv0, edor edor0) {
        this.t = dolg0;
        this.u = dxed0;
        this.v = domv0;
        this.w = doly0;
        this.y = edlf0;
        this.x = dmdk0;
        this.a = DoubleCheck.b(edmr.a);
        doiz doiz0 = new doiz(dolg0);
        this.b = doiz0;
        doje doje0 = new doje(doly0);
        this.c = doje0;
        dojd dojd0 = new dojd(dxed0);
        this.d = dojd0;
        this.e = DoubleCheck.b(new dmsw(doiz0, doje0, dojd0));
        doja doja0 = new doja(domv0);
        this.f = doja0;
        edsf edsf0 = new edsf(doja0);
        this.g = edsf0;
        dmkm dmkm0 = new dmkm(doja0);
        this.h = dmkm0;
        dojb dojb0 = new dojb(edor0);
        this.i = dojb0;
        edrn edrn0 = new edrn(edsf0, dmkm0, dojb0);
        this.j = edrn0;
        this.k = DoubleCheck.b(new edrj(edrn0));
        edsk edsk0 = new edsk(dmkm0, dybw.a);
        this.l = edsk0;
        this.m = DoubleCheck.b(new edsc(edsk0));
        dojf dojf0 = new dojf(doly0);
        this.n = dojf0;
        dojc dojc0 = new dojc(doly0);
        this.o = dojc0;
        this.p = DoubleCheck.b(new edqb(dojf0, dojc0));
        this.q = DoubleCheck.b(new edlr(edls.a));
        edrr edrr0 = new edrr(dmkm0);
        this.r = edrr0;
        this.s = DoubleCheck.b(new edrz(edrr0));
    }

    final dmgi a() {
        this.v.a();
        return new dmgi(this.t.d(), dmgy.a());
    }

    final dnpp b() {
        return new dnpp(this.v.a(), this.a());
    }

    final dnzt c() {
        doat doat0 = this.d();
        doat doat1 = this.d();
        edqa edqa0 = (edqa)this.p.get();
        return new dnzt(ggeo.n(Integer.valueOf(7), doat0, Integer.valueOf(9), doat1, Integer.valueOf(0), new dnzq()), edqa0);
    }

    final doat d() {
        Account account0 = this.t.a();
        azts azts0 = this.u.a();
        fsac fsac0 = this.g();
        dmgi dmgi0 = this.a();
        domj domj0 = this.v.b();
        Preconditions.e(domj0);
        dofe dofe0 = new dofe(dmgi0, domj0, this.e());
        fhxi fhxi0 = this.v.j();
        fhvw fhvw0 = this.v.g();
        tyb tyb0 = efmh.b(this.w.c());
        return new doat(account0, azts0, fsac0, this.x.a, dofe0, fhxi0, fhvw0, tyb0);
    }

    final edse e() {
        return new edse(this.v.a());
    }

    final efma f() {
        return new efma(this.v.a());
    }

    final fsac g() {
        Context context0 = this.v.a();
        du du0 = this.w.c();
        edle edle0 = edlf.a();
        etgl etgl0 = this.h();
        azts azts0 = this.u.a();
        Account account0 = this.t.a();
        AccountInfo accountInfo0 = this.t.b();
        cqxc cqxc0 = dpsv.a(this.v.a(), this.t.a());
        this.v.a();
        dlvj dlvj0 = new dlvj(cqxc0, new cjlv(this.v.a(), new cjky(this.v.a())));
        domj domj0 = this.v.b();
        Preconditions.e(domj0);
        Account account1 = this.t.a();
        du du1 = this.w.c();
        azts azts1 = this.u.a();
        etgl etgl1 = this.h();
        efma efma0 = this.f();
        fscg fscg0 = (fscg)this.a.get();
        edtj edtj0 = new edtj(this.t.a(), new fbio(this.v.a(), edtq.b(dojg.i(), this.t.a())), edtn.a(), dojg.i());
        dnpp dnpp0 = this.b();
        dmsv dmsv0 = (dmsv)this.e.get();
        edrk edrk0 = (edrk)this.k.get();
        domj domj1 = this.v.b();
        Preconditions.e(domj1);
        dmsn dmsn0 = new dmsn(account1, du1, azts1, etgl1, efma0, fscg0, edtj0, dnpp0, dmsv0, edrk0, domj1);
        dmtl dmtl0 = new dmtl(this.w.c(), this.u.a(), this.f(), this.t.a(), this.b(), ((edsh)this.m.get()));
        ibrt ibrt0 = donc.a();
        Context context1 = this.v.a();
        frii frii0 = this.v.n();
        Preconditions.e(frii0);
        edss edss0 = new edss(new edta(ibrt0, new dyaf(context1, frii0), this.t.a()));
        dlvb dlvb0 = new dlvb(this.w.c(), this.t.a(), this.a(), this.u.a());
        return new dlus(context0, du0, edle0, etgl0, azts0, account0, accountInfo0, dlvj0, this.x.a, domj0, dmsn0, dmtl0, edss0, dlvb0);
    }

    final etgl h() {
        return new etgl(this.w.e());
    }

    static final int i() {
        return edtl.a(dmgv.e(dmgy.a()));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dojm dojm0 = (dojm)object0;
        dojm0.b = this.c();
        dojm0.c = this.c();
        lps lps0 = this.w.d();
        Account account0 = this.t.a();
        azts azts0 = this.u.a();
        dnxz dnxz0 = new dnxz(this.x.a);
        dnza dnza0 = new dnza(this.t.a(), this.u.a(), this.g());
        dnzf dnzf0 = new dnzf(this.t.a(), this.u.a(), this.g());
        du du0 = this.w.c();
        edlq edlq0 = (edlq)this.q.get();
        edsh edsh0 = (edsh)this.m.get();
        dmkl dmkl0 = new dmkl(this.v.a());
        dojm0.d = new dnxx(lps0, account0, azts0, dnxz0, new dnyt(ggeo.n(Integer.valueOf(1), dnza0, Integer.valueOf(6), dnzf0, Integer.valueOf(0), new dnyv())), du0, this.x.a, gfqx.a, edlq0, edsh0, dmkl0);
        dojm0.ag = new eeej(this.w.c(), new eeaw(new azts(this.w.e(), null), this.t.d(), this.t.c(), this.t.e(), this.h(), this.e()), this.w.e(), ((edrp)this.s.get()), ((edsh)this.m.get()), this.a());
        dojm0.ah = this.a();
        dojm0.ai = new fuok();
        fhwk fhwk0 = this.v.i();
        Preconditions.e(fhwk0);
        dojm0.aj = fhwk0;
    }
}

