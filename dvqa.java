import android.accounts.Account;
import android.app.KeyguardManager;
import android.content.Context;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import j..util.Optional;

final class dvqa implements AndroidInjector {
    final Provider A;
    final Provider B;
    final Provider C;
    final Provider D;
    final Provider E;
    private final domv F;
    private final dolg G;
    private final dxed H;
    private final doly I;
    private final domw J;
    private final domq K;
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
    final Provider v;
    final Provider w;
    final Provider x;
    final Provider y;
    final Provider z;

    public dvqa(dolg dolg0, dxed dxed0, domw domw0, edlf edlf0, doly doly0, edor edor0, domv domv0, domq domq0) {
        this.F = domv0;
        this.G = dolg0;
        this.H = dxed0;
        this.I = doly0;
        this.J = domw0;
        this.K = domq0;
        dvpv dvpv0 = new dvpv(domv0);
        this.a = dvpv0;
        dmkm dmkm0 = new dmkm(dvpv0);
        this.b = dmkm0;
        edrr edrr0 = new edrr(dmkm0);
        this.c = edrr0;
        this.d = DoubleCheck.b(new edrz(edrr0));
        edsk edsk0 = new edsk(dmkm0, dybw.a);
        this.e = edsk0;
        this.f = DoubleCheck.b(new edsc(edsk0));
        edoc edoc0 = new edoc(dvpv0);
        this.g = edoc0;
        edod edod0 = new edod(dvpv0);
        this.h = edod0;
        edsf edsf0 = new edsf(dvpv0);
        this.i = edsf0;
        dvpx dvpx0 = new dvpx(edor0);
        this.j = dvpx0;
        edrn edrn0 = new edrn(edsf0, dmkm0, dvpx0);
        this.k = edrn0;
        this.l = DoubleCheck.b(new edrj(edrn0));
        this.m = DoubleCheck.b(edrh.a);
        dvps dvps0 = new dvps(dolg0);
        this.n = dvps0;
        dmgj dmgj0 = new dmgj(dvpv0, dvps0);
        this.o = dmgj0;
        dvpr dvpr0 = new dvpr(dolg0);
        this.p = dvpr0;
        ears ears0 = new ears(dvpv0, dvpr0);
        this.q = ears0;
        earp earp0 = new earp(dvpv0, dvpr0, ears0);
        this.r = earp0;
        this.s = DoubleCheck.b(new eaqy(dvpv0, dmgj0, earp0));
        dvpt dvpt0 = new dvpt(dolg0);
        this.t = dvpt0;
        dvpy dvpy0 = new dvpy(doly0);
        this.u = dvpy0;
        dvqb dvqb0 = new dvqb(dvpy0);
        this.v = dvqb0;
        dvpw dvpw0 = new dvpw(domv0);
        this.w = dvpw0;
        dsod dsod0 = new dsod(dvpv0);
        this.x = dsod0;
        dspi dspi0 = new dspi(dsod0);
        this.y = dspi0;
        Provider provider0 = DoubleCheck.b(new dsny(dvpv0, dvqb0, dvps0, dmgj0, dvpw0, dspi0));
        this.z = provider0;
        edoe edoe0 = new edoe(dvpv0);
        this.A = edoe0;
        edny edny0 = new edny(edoe0, edoc0, edod0);
        this.B = edny0;
        dvpu dvpu0 = new dvpu(edlf0);
        this.C = dvpu0;
        dvpz dvpz0 = new dvpz(dxed0);
        this.D = dvpz0;
        this.E = DoubleCheck.b(new dspq(dvpt0, dvpv0, provider0, dmkm0, edny0, dvpu0, dvpx0, dvpz0, edsf0));
    }

    final KeyguardManager a() {
        return edob.a(this.F.a());
    }

    final tyb b() {
        return efmg.b(this.F.a());
    }

    final dlnm c() {
        return new dlnm(new acqn(this.F.a()), this.G.d(), this.G.c());
    }

    final dmgi d() {
        this.F.a();
        return new dmgi(this.G.d(), dmgy.a());
    }

    final dmhi e() {
        return dmhh.b(this.F.a(), this.G.d(), this.G.c(), dmgy.a(), null, Optional.empty());
    }

    final dmkl f() {
        return new dmkl(this.F.a());
    }

    final dpvp g() {
        Context context0 = this.F.a();
        String s = this.G.c();
        String s1 = dmgy.a();
        eaqx eaqx0 = (eaqx)this.s.get();
        this.F.a();
        return new dpvp(context0, s, s1, eaqx0, new dpvr(this.G.c(), dmgy.a()));
    }

    final dpxx h() {
        Context context0 = this.F.a();
        Account account0 = this.G.a();
        dmgi dmgi0 = this.d();
        Account account1 = this.G.a();
        dlmc dlmc0 = new dlmc(this.F.a(), this.G.c(), dmgy.a());
        Context context1 = this.F.a();
        azts azts0 = this.H.a();
        etgl etgl0 = this.y();
        dmhi dmhi0 = this.e();
        fpgc fpgc0 = this.K.d();
        Preconditions.e(fpgc0);
        return new dpxx(context0, account0, dmgi0, new ecga(account1, dlmc0, context1, azts0, etgl0, new ecgd(dmhi0, dxim.a(fpgc0, this.G.a())), new bblp(1, 10), easq.a(), this.c(), this.d(), this.G.e()), this.o(), this.w());
    }

    final dvfu i() {
        return new dvfu(this.d(), new dmgm(dmgy.a()));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dvsn dvsn0 = (dvsn)object0;
        dvsn0.d = this.i();
        this.F.a();
        dvsn0.ag = new dvfw(new dmgk(dmgy.a()));
        dvsn0.aT = this.H.a();
        dvsn0.ah = new dvgd(this.f(), this.e(), this.x());
        dvsn0.ai = new dvfz(this.e());
        fuot fuot0 = this.F.o();
        Preconditions.e(fuot0);
        dvsn0.aj = fuot0;
        dvsn0.ak = (edrp)this.d.get();
        dvsn0.ao = new eeej(this.I.c(), new eeaw(new azts(this.I.e(), null), this.G.d(), this.G.c(), this.G.e(), this.y(), this.w()), this.I.e(), ((edrp)this.d.get()), ((edsh)this.f.get()), this.d());
        dvsn0.ap = this.c();
        dvsn0.aq = this.v();
        KeyguardManager keyguardManager0 = this.a();
        ednx ednx0 = this.v();
        bblp bblp0 = new bblp(0x7FFFFFFF, 9);
        dvsn0.ar = new edoa(this.h, keyguardManager0, ednx0, bblp0);
        dvsn0.as = new edoi(this.H.a(), this.v());
        dvgv dvgv0 = this.k();
        bblp bblp1 = new bblp(0x7FFFFFFF, 10);
        Context context0 = this.F.a();
        Account account0 = this.G.a();
        String s = this.G.c();
        String s1 = this.G.d();
        String s2 = dmgy.a();
        dvfu dvfu0 = this.i();
        this.f();
        dvgv dvgv1 = this.k();
        this.j();
        dvgh dvgh0 = new dvgh(this.e());
        dvjf dvjf0 = this.o();
        dvic dvic0 = new dvic(new dvib(this.F.a(), this.G.c(), dmgy.a()));
        dvil dvil0 = new dvil(new dvik(this.F.a(), this.G.c(), dmgy.a()));
        eata eata0 = east.a();
        tyb tyb0 = this.b();
        Context context1 = this.F.a();
        String s3 = this.G.d();
        String s4 = this.G.c();
        dvma dvma0 = this.q();
        bblp bblp2 = new bblp(0x7FFFFFFF, 10);
        bblp bblp3 = new bblp(1, 10);
        dvmc dvmc0 = new dvmc(this.G.d(), this.q(), this.p(), dmgy.a(), new dmkp(), this.F.a());
        dvgv dvgv2 = this.k();
        this.j();
        dvjm dvjm0 = new dvjm(dvjf0, dvic0, dvil0, eata0, tyb0, context1, s3, s4, dvma0, bblp2, bblp3, dvmc0, dvgv2);
        dvjf dvjf1 = this.o();
        dvhl dvhl0 = new dvhl(this.m());
        earu earu0 = this.t();
        dpvm dpvm0 = new dpvm(this.G.c(), this.G.d(), this.F.a(), new dpwd(this.g(), easo.a(), this.b(), this.t()), new dpwn(this.F.a(), this.G.c(), this.G.d(), this.h()), this.h(), new cjlv(this.F.a(), new cjky(this.F.a())), dydi.a(this.F.a()));
        dvha dvha0 = this.l();
        dvhb dvhb0 = new dvhb(this.F.a(), this.G.a(), this.G.c(), this.G.d(), this.i(), ((dspp)this.E.get()), new dvhd(((dspp)this.E.get()), this.o()), this.u(), this.l(), this.y());
        edmh edmh0 = this.u();
        dvhz dvhz0 = this.n();
        dvkn dvkn0 = new dvkn(this.r(), new bblp(0x7FFFFFFF, 9), this.k(), this.o(), new dvjs(this.F.a(), this.G.c(), dmgy.a(), this.s()), new dvjv(this.G.c()), new dyda(this.G.a()));
        Context context2 = this.F.a();
        dvma dvma1 = this.q();
        dydx dydx0 = new dydx(dydy.a(), dmgy.a(), this.G.d(), this.F.a());
        dvlp dvlp0 = new dvlp(this.G.a(), this.F.h(), this.d());
        dvlr dvlr0 = this.p();
        Context context3 = this.F.a();
        this.j();
        dvsn0.at = new dvjr(dvgv0, bblp1, new dvit(context0, account0, s, s1, s2, dvfu0, dvgv1, dvgh0, dvjm0, dvjf1, dvhl0, earu0, dpvm0, dvha0, dvhb0, edmh0, dvhz0, dvkn0, new dvlt(context2, dvma1, new dvmd(dydx0, dvlp0, dvlr0, context3))));
        dvsn0.au = new dxcz(this.G.a(), this.H.a(), this.J.a());
        dvsn0.av = this.w();
        Context context4 = this.F.a();
        Account account1 = this.G.a();
        String s5 = dmgy.a();
        frii frii0 = this.F.n();
        Preconditions.e(frii0);
        dvsn0.aw = new dsio(dsiq.b(context4, account1, s5, frii0));
        fhwk fhwk0 = this.F.i();
        Preconditions.e(fhwk0);
        dvsn0.ax = fhwk0;
        dvsn0.ay = this.F.j();
        dvsn0.az = this.F.g();
        dvsn0.aA = new dvxp(this.F.a(), ((dsnx)this.z.get()), new dspv(), new dspx());
        dvsn0.aB = new fuok();
    }

    final dvgk j() {
        this.e();
        return new dvgk();
    }

    final dvgv k() {
        return new dvgv(this.i(), this.f(), this.e(), this.x(), new edmu(this.f(), ((edrk)this.l.get()), ((edrg)this.m.get())));
    }

    final dvha l() {
        return new dvha(this.F.a(), this.G.c(), dmgy.a());
    }

    final dvhj m() {
        return new dvhj(this.F.a(), this.G.c(), dmgy.a(), ((eaqx)this.s.get()));
    }

    final dvhz n() {
        return new dvhz(this.F.a(), this.G.c(), dmgy.a());
    }

    final dvjf o() {
        return new dvjf(this.F.a(), this.G.c(), dmgy.a(), new dviy(this.G.c(), dmgy.a()), this.n(), new dvif(new dvid(this.F.a(), this.G.c(), dmgy.a())), ((eaqx)this.s.get()), dvmq.a(), this.q(), this.G.e());
    }

    final dvlr p() {
        return new dvlr(this.F.h(), this.G.d());
    }

    final dvma q() {
        return new dvma(this.G.c(), dmgy.a(), ((eaqx)this.s.get()));
    }

    final eaqs r() {
        return new eaqs(this.F.a(), this.G.c(), this.G.d(), dmgy.a(), this.s());
    }

    final earo s() {
        return new earo(this.F.a(), this.G.c(), dmgy.a(), new earr(this.F.a(), this.G.c(), dmgy.a()));
    }

    final earu t() {
        return new earu(this.F.a(), this.G.d(), this.G.c(), dmgy.a(), new dqlm(this.G.c(), this.G.d(), dmgy.a(), this.F.a(), new dsie(this.G.c(), dmgy.a(), this.F.a()), this.s(), DoubleCheck.a(dxyf.a), this.F.h()), this.o(), this.g(), this.m(), this.s(), this.r());
    }

    final edmh u() {
        return new edmh(this.F.a(), dmgy.a(), easm.a());
    }

    final ednx v() {
        return new ednx(this.a(), this.g, this.h);
    }

    final edse w() {
        return new edse(this.F.a());
    }

    final ggfp x() {
        return dvga.b(((edrp)this.d.get()));
    }

    final etgl y() {
        return new etgl(this.F.a());
    }
}

