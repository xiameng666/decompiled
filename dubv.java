import android.accounts.Account;
import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import com.google.android.gms.pay.pass.common.template.defaults.DefaultPassInfoCallback;
import com.google.android.gms.tapandpay.firstparty.AccountInfo;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import j..util.Optional;

final class dubv implements AndroidInjector {
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
    private final doly r;
    private final domw s;
    private final dolg t;
    private final domv u;
    private final dxed v;
    private final edor w;
    private final dmdk x;
    private final dpsz y;
    private final edlf z;

    public dubv(dmdk dmdk0, dolg dolg0, dpsz dpsz0, dxed dxed0, domw domw0, edlf edlf0, doly doly0, edor edor0, domv domv0) {
        this.r = doly0;
        this.s = domw0;
        this.y = dpsz0;
        this.t = dolg0;
        this.u = domv0;
        this.v = dxed0;
        this.z = edlf0;
        this.w = edor0;
        this.x = dmdk0;
        dubq dubq0 = new dubq(domv0);
        this.a = dubq0;
        dubp dubp0 = new dubp(dolg0);
        this.b = dubp0;
        dubu dubu0 = new dubu(domw0);
        this.c = dubu0;
        dlny dlny0 = new dlny(dubq0, dubu0);
        this.d = dlny0;
        efmg efmg0 = new efmg(dubq0);
        this.e = efmg0;
        this.f = DoubleCheck.b(new dsol(dubq0, dubp0, dlny0, efmg0));
        this.g = DoubleCheck.b(edmr.a);
        dubt dubt0 = new dubt(doly0);
        this.h = dubt0;
        dubs dubs0 = new dubs(dxed0);
        this.i = dubs0;
        this.j = DoubleCheck.b(new dmsw(dubp0, dubt0, dubs0));
        edsf edsf0 = new edsf(dubq0);
        this.k = edsf0;
        dmkm dmkm0 = new dmkm(dubq0);
        this.l = dmkm0;
        dubr dubr0 = new dubr(edor0);
        this.m = dubr0;
        edrn edrn0 = new edrn(edsf0, dmkm0, dubr0);
        this.n = edrn0;
        this.o = DoubleCheck.b(new edrj(edrn0));
        edsk edsk0 = new edsk(dmkm0, dybw.a);
        this.p = edsk0;
        this.q = DoubleCheck.b(new edsc(edsk0));
    }

    final cjlv a() {
        return new cjlv(this.u.a(), new cjky(this.u.a()));
    }

    final dmgi b() {
        this.u.a();
        return new dmgi(this.t.d(), dmgy.a());
    }

    final dnpp c() {
        return new dnpp(this.u.a(), this.b());
    }

    final dtph d() {
        return new dtph(this.b(), edob.a(this.u.a()), new dtpi());
    }

    final dtpl e() {
        return new dtpl(this.t.a(), dmhh.b(this.u.a(), this.t.d(), this.t.c(), dmgy.a(), null, Optional.empty()), this.v.a(), new dmkl(this.u.a()));
    }

    final dtrf f() {
        return new dtrf(bxuw.a(this.u.a()), this.y.a(), this.u.a(), new bblp(0x7FFFFFFF, 10), this.g(), this.t.d(), new dtrw(this.u.a(), this.t.c(), dmgy.a()), this.e());
    }

    final dtze g() {
        return new dtze(this.u.a(), this.v.a());
    }

    final dubj h() {
        return new dubj(this.k());
    }

    final efma i() {
        return new efma(this.u.a());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        duew duew0 = (duew)object0;
        duew0.b = new dsiu(this.r.c());
        duew0.c = new dspu();
        duew0.d = new dspv();
        duew0.ag = new dspx();
        duew0.ah = new fshk();
        xni xni0 = this.r.e();
        bblp bblp0 = new bblp(0x7FFFFFFF, 9);
        cqxc cqxc0 = this.y.a();
        dtpl dtpl0 = this.e();
        dual dual0 = new dual(this.y.a(), dmgy.a(), easn.a(), this.b(), new bblp(0x7FFFFFFF, 10));
        dtyl dtyl0 = new dtyl(this.u.a(), this.t.a(), this.y.a());
        lps lps0 = this.r.d();
        dtph dtph0 = this.d();
        dtrf dtrf0 = this.f();
        this.u.a();
        this.u.a();
        bblp bblp1 = new bblp(1, 9);
        bbic.a();
        new dotf(bblp1);
        duew0.ai = dvfi.a(new lso(xni0, new dvfj(bblp0, cqxc0, dtpl0, dual0, dtyl0, lps0, dtph0, dtrf0, this.h(), new dtyw(this.y.a(), this.g()))));
        duew0.aj = (dsok)this.f.get();
        duew0.ak = edlf.a();
        duew0.al = this.w.a();
        duew0.am = new DefaultPassInfoCallback();
        duew0.aW = this.v.a();
        duew0.an = this.h();
        duew0.ao = new dnxz(this.x.a);
        duew0.ap = this.t.a();
        duew0.aq = this.s.a();
        tyb tyb0 = efmg.b(this.u.a());
        this.t.d();
        dsok dsok0 = (dsok)this.f.get();
        this.g();
        duew0.ar = new duit(tyb0, dsok0);
        duew0.as = new ebib(this.v.a(), this.y.a(), new duao());
        duew0.at = this.d();
        duew0.au = this.j();
        lps lps1 = this.r.d();
        Context context0 = this.u.a();
        Account account0 = this.t.a();
        azts azts0 = this.v.a();
        etgl etgl0 = this.k();
        duew0.av = new dlvo(lps1, context0, account0, azts0, this.x.a, etgl0);
        Context context1 = this.u.a();
        Context context2 = this.u.a();
        Context context3 = this.u.a();
        du du0 = this.r.c();
        edle edle0 = edlf.a();
        etgl etgl1 = this.k();
        azts azts1 = this.v.a();
        Account account1 = this.t.a();
        AccountInfo accountInfo0 = this.t.b();
        cqxc cqxc1 = this.y.a();
        this.u.a();
        dlvj dlvj0 = new dlvj(cqxc1, this.a());
        domj domj0 = this.u.b();
        Preconditions.e(domj0);
        Account account2 = this.t.a();
        du du1 = this.r.c();
        azts azts2 = this.v.a();
        etgl etgl2 = this.k();
        efma efma0 = this.i();
        fscg fscg0 = (fscg)this.g.get();
        Account account3 = this.t.a();
        Context context4 = this.u.a();
        Preconditions.e(context4);
        int v = dubv.l();
        Account account4 = this.t.a();
        Preconditions.e(account4);
        edtj edtj0 = new edtj(account3, edtm.b(context4, edtq.b(v, account4)), edtn.a(), dubv.l());
        dnpp dnpp0 = this.c();
        dmsv dmsv0 = (dmsv)this.j.get();
        edrk edrk0 = (edrk)this.o.get();
        domj domj1 = this.u.b();
        Preconditions.e(domj1);
        dmsn dmsn0 = new dmsn(account2, du1, azts2, etgl2, efma0, fscg0, edtj0, dnpp0, dmsv0, edrk0, domj1);
        dmtl dmtl0 = new dmtl(this.r.c(), this.v.a(), this.i(), this.t.a(), this.c(), ((edsh)this.q.get()));
        ibrt ibrt0 = donc.a();
        Context context5 = this.u.a();
        Preconditions.e(context5);
        frii frii0 = this.u.n();
        Preconditions.e(frii0);
        edss edss0 = new edss(new edta(ibrt0, new dyaf(context5, frii0), this.t.a()));
        dlvb dlvb0 = new dlvb(this.r.c(), this.t.a(), this.b(), this.v.a());
        dlvp dlvp0 = new dlvp(context2, new dlus(context3, du0, edle0, etgl1, azts1, account1, accountInfo0, dlvj0, this.x.a, domj0, dmsn0, dmtl0, edss0, dlvb0), this.j());
        dlvq dlvq0 = new dlvq(this.b(), this.x.a);
        bblp bblp2 = new bblp(0x7FFFFFFF, 9);
        int v1 = context1.getResources().getDimensionPixelSize(0x7F0702FA);  // dimen:callout_adapter_horizontal_spacing
        duew0.aw = new fsaj(dlvp0, dlvq0, bblp2, v1, context1.getResources().getDimensionPixelSize(0x7F0702FB), v1, 0);  // dimen:callout_adapter_vertical_spacing
        duew0.ax = this.a();
        this.u.a();
        duew0.ay = new LinearLayoutManager();
        duew0.az = this.f();
        duew0.aA = edpt.a(this.u.a());
        duew0.aB = new duay(this.v.a());
        duew0.aC = this.g();
        duew0.aD = new fuok();
        duew0.aE = this.t.e();
    }

    final frzk j() {
        return new frzk(this.k(), new frzh(), this.r.c(), this.r.a());
    }

    final etgl k() {
        return new etgl(this.r.e());
    }

    static final int l() {
        return edtl.a(dmgv.e(dmgy.a()));
    }
}

