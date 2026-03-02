import android.accounts.Account;
import android.app.KeyguardManager;
import android.content.Context;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import j..util.Optional;

final class dvra implements AndroidInjector {
    final Provider A;
    final Provider B;
    final Provider C;
    private final domv D;
    private final dolg E;
    private final doly F;
    private final domw G;
    private final dxed H;
    private final domq I;
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

    public dvra(dolg dolg0, dxed dxed0, domw domw0, edlf edlf0, doly doly0, edor edor0, domv domv0, domq domq0) {
        this.D = domv0;
        this.E = dolg0;
        this.F = doly0;
        this.G = domw0;
        this.H = dxed0;
        this.I = domq0;
        dvqv dvqv0 = new dvqv(domv0);
        this.a = dvqv0;
        edoc edoc0 = new edoc(dvqv0);
        this.b = edoc0;
        edod edod0 = new edod(dvqv0);
        this.c = edod0;
        dmkm dmkm0 = new dmkm(dvqv0);
        this.d = dmkm0;
        edrr edrr0 = new edrr(dmkm0);
        this.e = edrr0;
        this.f = DoubleCheck.b(new edrz(edrr0));
        edsf edsf0 = new edsf(dvqv0);
        this.g = edsf0;
        dvqx dvqx0 = new dvqx(edor0);
        this.h = dvqx0;
        edrn edrn0 = new edrn(edsf0, dmkm0, dvqx0);
        this.i = edrn0;
        this.j = DoubleCheck.b(new edrj(edrn0));
        this.k = DoubleCheck.b(edrh.a);
        dvqs dvqs0 = new dvqs(dolg0);
        this.l = dvqs0;
        dmgj dmgj0 = new dmgj(dvqv0, dvqs0);
        this.m = dmgj0;
        dvqr dvqr0 = new dvqr(dolg0);
        this.n = dvqr0;
        ears ears0 = new ears(dvqv0, dvqr0);
        this.o = ears0;
        earp earp0 = new earp(dvqv0, dvqr0, ears0);
        this.p = earp0;
        this.q = DoubleCheck.b(new eaqy(dvqv0, dmgj0, earp0));
        dvqt dvqt0 = new dvqt(dolg0);
        this.r = dvqt0;
        dvqy dvqy0 = new dvqy(doly0);
        this.s = dvqy0;
        dvqq dvqq0 = new dvqq(dvqy0);
        this.t = dvqq0;
        dvqw dvqw0 = new dvqw(domv0);
        this.u = dvqw0;
        dsod dsod0 = new dsod(dvqv0);
        this.v = dsod0;
        dspi dspi0 = new dspi(dsod0);
        this.w = dspi0;
        Provider provider0 = DoubleCheck.b(new dsny(dvqv0, dvqq0, dvqs0, dmgj0, dvqw0, dspi0));
        this.x = provider0;
        edoe edoe0 = new edoe(dvqv0);
        this.y = edoe0;
        edny edny0 = new edny(edoe0, edoc0, edod0);
        this.z = edny0;
        dvqu dvqu0 = new dvqu(edlf0);
        this.A = dvqu0;
        dvqz dvqz0 = new dvqz(dxed0);
        this.B = dvqz0;
        this.C = DoubleCheck.b(new dspq(dvqt0, dvqv0, provider0, dmkm0, edny0, dvqu0, dvqx0, dvqz0, edsf0));
    }

    final KeyguardManager a() {
        return edob.a(this.D.a());
    }

    final tyb b() {
        return efmg.b(this.D.a());
    }

    final dlnm c() {
        return new dlnm(new acqn(this.D.a()), this.E.d(), this.E.c());
    }

    final dmgi d() {
        this.D.a();
        return new dmgi(this.E.d(), dmgy.a());
    }

    final dmhi e() {
        return dmhh.b(this.D.a(), this.E.d(), this.E.c(), dmgy.a(), null, Optional.empty());
    }

    final dmkl f() {
        return new dmkl(this.D.a());
    }

    final dpvp g() {
        Context context0 = this.D.a();
        String s = this.E.c();
        String s1 = dmgy.a();
        eaqx eaqx0 = (eaqx)this.q.get();
        this.D.a();
        return new dpvp(context0, s, s1, eaqx0, new dpvr(this.E.c(), dmgy.a()));
    }

    final dpxx h() {
        Context context0 = this.D.a();
        Account account0 = this.E.a();
        dmgi dmgi0 = this.d();
        Account account1 = this.E.a();
        dlmc dlmc0 = new dlmc(this.D.a(), this.E.c(), dmgy.a());
        Context context1 = this.D.a();
        azts azts0 = this.H.a();
        etgl etgl0 = this.y();
        dmhi dmhi0 = this.e();
        fpgc fpgc0 = this.I.d();
        Preconditions.e(fpgc0);
        return new dpxx(context0, account0, dmgi0, new ecga(account1, dlmc0, context1, azts0, etgl0, new ecgd(dmhi0, dxim.a(fpgc0, this.E.a())), new bblp(1, 10), easq.a(), this.c(), this.d(), this.E.e()), this.o(), this.w());
    }

    final dvfu i() {
        return new dvfu(this.d(), new dmgm(dmgy.a()));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dvxj dvxj0 = (dvxj)object0;
        dvxj0.c = this.i();
        dvxj0.d = this.c();
        this.D.a();
        dvxj0.ag = new dvfw(new dmgk(dmgy.a()));
        dvxj0.ah = new dsiu(this.F.c());
        dvxj0.ai = this.v();
        KeyguardManager keyguardManager0 = this.a();
        ednx ednx0 = this.v();
        bblp bblp0 = new bblp(0x7FFFFFFF, 9);
        dvxj0.aj = new edoa(this.c, keyguardManager0, ednx0, bblp0);
        dvxj0.aY = this.H.a();
        dvxj0.ak = new dxcz(this.E.a(), this.H.a(), this.G.a());
        dvgv dvgv0 = this.k();
        bblp bblp1 = new bblp(0x7FFFFFFF, 10);
        Context context0 = this.D.a();
        Account account0 = this.E.a();
        String s = this.E.c();
        String s1 = this.E.d();
        String s2 = dmgy.a();
        dvfu dvfu0 = this.i();
        this.f();
        dvgv dvgv1 = this.k();
        this.j();
        dvgh dvgh0 = new dvgh(this.e());
        dvjf dvjf0 = this.o();
        dvic dvic0 = new dvic(new dvib(this.D.a(), this.E.c(), dmgy.a()));
        dvil dvil0 = new dvil(new dvik(this.D.a(), this.E.c(), dmgy.a()));
        eata eata0 = east.a();
        tyb tyb0 = this.b();
        Context context1 = this.D.a();
        String s3 = this.E.d();
        String s4 = this.E.c();
        dvma dvma0 = this.q();
        bblp bblp2 = new bblp(0x7FFFFFFF, 10);
        bblp bblp3 = new bblp(1, 10);
        dvmc dvmc0 = new dvmc(this.E.d(), this.q(), this.p(), dmgy.a(), new dmkp(), this.D.a());
        dvgv dvgv2 = this.k();
        this.j();
        dvjm dvjm0 = new dvjm(dvjf0, dvic0, dvil0, eata0, tyb0, context1, s3, s4, dvma0, bblp2, bblp3, dvmc0, dvgv2);
        dvjf dvjf1 = this.o();
        dvhl dvhl0 = new dvhl(this.m());
        earu earu0 = this.t();
        dpvm dpvm0 = new dpvm(this.E.c(), this.E.d(), this.D.a(), new dpwd(this.g(), easo.a(), this.b(), this.t()), new dpwn(this.D.a(), this.E.c(), this.E.d(), this.h()), this.h(), new cjlv(this.D.a(), new cjky(this.D.a())), dydi.a(this.D.a()));
        dvha dvha0 = this.l();
        dvhb dvhb0 = new dvhb(this.D.a(), this.E.a(), this.E.c(), this.E.d(), this.i(), ((dspp)this.C.get()), new dvhd(((dspp)this.C.get()), this.o()), this.u(), this.l(), this.y());
        edmh edmh0 = this.u();
        dvhz dvhz0 = this.n();
        dvkn dvkn0 = new dvkn(this.r(), new bblp(0x7FFFFFFF, 9), this.k(), this.o(), new dvjs(this.D.a(), this.E.c(), dmgy.a(), this.s()), new dvjv(this.E.c()), new dyda(this.E.a()));
        Context context2 = this.D.a();
        dvma dvma1 = this.q();
        dydx dydx0 = new dydx(dydy.a(), dmgy.a(), this.E.d(), this.D.a());
        dvlp dvlp0 = new dvlp(this.E.a(), this.D.h(), this.d());
        dvlr dvlr0 = this.p();
        Context context3 = this.D.a();
        this.j();
        dvxj0.al = new dvjr(dvgv0, bblp1, new dvit(context0, account0, s, s1, s2, dvfu0, dvgv1, dvgh0, dvjm0, dvjf1, dvhl0, earu0, dpvm0, dvha0, dvhb0, edmh0, dvhz0, dvkn0, new dvlt(context2, dvma1, new dvmd(dydx0, dvlp0, dvlr0, context3))));
        dvxj0.am = new edoi(this.H.a(), this.v());
        dvxj0.an = (edrp)this.f.get();
        dvxj0.ao = new dvgd(this.f(), this.e(), this.x());
        Context context4 = this.D.a();
        Account account1 = this.E.a();
        String s5 = dmgy.a();
        frii frii0 = this.D.n();
        Preconditions.e(frii0);
        dvxj0.ap = new dsio(dsiq.b(context4, account1, s5, frii0));
        fuot fuot0 = this.D.o();
        Preconditions.e(fuot0);
        dvxj0.aq = fuot0;
        dvxj0.ar = new eeaw(new azts(this.F.e(), null), this.E.d(), this.E.c(), this.E.e(), this.y(), this.w());
        dvxj0.as = new dvfz(this.e());
        dvxj0.at = this.w();
        fhwk fhwk0 = this.D.i();
        Preconditions.e(fhwk0);
        dvxj0.au = fhwk0;
        dvxj0.av = this.D.j();
        dvxj0.aw = this.D.g();
        dvxj0.ax = new dvxp(this.D.a(), ((dsnx)this.x.get()), new dspv(), new dspx());
        dvxj0.ay = new fuok();
    }

    final dvgk j() {
        this.e();
        return new dvgk();
    }

    final dvgv k() {
        return new dvgv(this.i(), this.f(), this.e(), this.x(), new edmu(this.f(), ((edrk)this.j.get()), ((edrg)this.k.get())));
    }

    final dvha l() {
        return new dvha(this.D.a(), this.E.c(), dmgy.a());
    }

    final dvhj m() {
        return new dvhj(this.D.a(), this.E.c(), dmgy.a(), ((eaqx)this.q.get()));
    }

    final dvhz n() {
        return new dvhz(this.D.a(), this.E.c(), dmgy.a());
    }

    final dvjf o() {
        return new dvjf(this.D.a(), this.E.c(), dmgy.a(), new dviy(this.E.c(), dmgy.a()), this.n(), new dvif(new dvid(this.D.a(), this.E.c(), dmgy.a())), ((eaqx)this.q.get()), dvmq.a(), this.q(), this.E.e());
    }

    final dvlr p() {
        return new dvlr(this.D.h(), this.E.d());
    }

    final dvma q() {
        return new dvma(this.E.c(), dmgy.a(), ((eaqx)this.q.get()));
    }

    final eaqs r() {
        return new eaqs(this.D.a(), this.E.c(), this.E.d(), dmgy.a(), this.s());
    }

    final earo s() {
        return new earo(this.D.a(), this.E.c(), dmgy.a(), new earr(this.D.a(), this.E.c(), dmgy.a()));
    }

    final earu t() {
        return new earu(this.D.a(), this.E.d(), this.E.c(), dmgy.a(), new dqlm(this.E.c(), this.E.d(), dmgy.a(), this.D.a(), new dsie(this.E.c(), dmgy.a(), this.D.a()), this.s(), DoubleCheck.a(dxyf.a), this.D.h()), this.o(), this.g(), this.m(), this.s(), this.r());
    }

    final edmh u() {
        return new edmh(this.D.a(), dmgy.a(), easm.a());
    }

    final ednx v() {
        return new ednx(this.a(), this.b, this.c);
    }

    final edse w() {
        return new edse(this.D.a());
    }

    final ggfp x() {
        return dvga.b(((edrp)this.f.get()));
    }

    final etgl y() {
        return new etgl(this.D.a());
    }
}

