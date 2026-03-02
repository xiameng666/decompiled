import android.accounts.Account;
import android.content.Context;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import j..util.Optional;

final class eayq implements AndroidInjector {
    final Provider A;
    final Provider B;
    private final domv C;
    private final dola D;
    private final dmgr E;
    private final domw F;
    private final domq G;
    private final eefy H;
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

    public eayq(dola dola0, dmgr dmgr0, eefy eefy0, domw domw0, edor edor0, edlf edlf0, domq domq0, domv domv0) {
        this.C = domv0;
        this.D = dola0;
        this.E = dmgr0;
        this.F = domw0;
        this.G = domq0;
        this.H = eefy0;
        eayn eayn0 = new eayn(domv0);
        this.a = eayn0;
        dmkm dmkm0 = new dmkm(eayn0);
        this.b = dmkm0;
        edrr edrr0 = new edrr(dmkm0);
        this.c = edrr0;
        this.d = DoubleCheck.b(new edrz(edrr0));
        edsf edsf0 = new edsf(eayn0);
        this.e = edsf0;
        eayp eayp0 = new eayp(edor0);
        this.f = eayp0;
        edrn edrn0 = new edrn(edsf0, dmkm0, eayp0);
        this.g = edrn0;
        this.h = DoubleCheck.b(new edrj(edrn0));
        this.i = DoubleCheck.b(edrh.a);
        dolf dolf0 = new dolf(dola0);
        this.j = dolf0;
        dmgj dmgj0 = new dmgj(eayn0, dolf0);
        this.k = dmgj0;
        dole dole0 = new dole(dola0);
        this.l = dole0;
        ears ears0 = new ears(eayn0, dole0);
        this.m = ears0;
        earp earp0 = new earp(eayn0, dole0, ears0);
        this.n = earp0;
        this.o = DoubleCheck.b(new eaqy(eayn0, dmgj0, earp0));
        dolc dolc0 = new dolc(dola0);
        this.p = dolc0;
        this.q = eayr.a;
        eayo eayo0 = new eayo(domv0);
        this.r = eayo0;
        dsod dsod0 = new dsod(eayn0);
        this.s = dsod0;
        dspi dspi0 = new dspi(dsod0);
        this.t = dspi0;
        Provider provider0 = DoubleCheck.b(new dsny(eayn0, eayr.a, dolf0, dmgj0, eayo0, dspi0));
        this.u = provider0;
        edoe edoe0 = new edoe(eayn0);
        this.v = edoe0;
        edoc edoc0 = new edoc(eayn0);
        this.w = edoc0;
        edod edod0 = new edod(eayn0);
        this.x = edod0;
        edny edny0 = new edny(edoe0, edoc0, edod0);
        this.y = edny0;
        eaym eaym0 = new eaym(edlf0);
        this.z = eaym0;
        dxei dxei0 = new dxei(eayn0);
        this.A = dxei0;
        this.B = DoubleCheck.b(new dspq(dolc0, eayn0, provider0, dmkm0, edny0, eaym0, eayp0, dxei0, edsf0));
    }

    final earg A() {
        return new earg(new eard(this.e()), this.e(), this.b(), this.l(), this.k());
    }

    final earo B() {
        return new earo(this.C.a(), dole.b(this.D), dmgy.a(), new earr(this.C.a(), dole.b(this.D), dmgy.a()));
    }

    final earu C() {
        return new earu(this.C.a(), dolf.b(this.D), dole.b(this.D), dmgy.a(), this.k(), this.v(), this.f(), this.t(), this.B(), this.y());
    }

    final edmh D() {
        return new edmh(this.C.a(), dmgy.a(), easm.a());
    }

    final etgl E() {
        return new etgl(this.C.a());
    }

    final tyb a() {
        return efmg.b(this.C.a());
    }

    final dmgi b() {
        this.C.a();
        return new dmgi(dolf.b(this.D), dmgy.a());
    }

    final dmgo c() {
        return new dmgo(this.C.a(), this.e());
    }

    final dmhi d() {
        return dmhh.b(this.C.a(), dolf.b(this.D), dole.b(this.D), dmgy.a(), this.E.a, Optional.empty());
    }

    final dmkl e() {
        return new dmkl(this.C.a());
    }

    final dpvp f() {
        Context context0 = this.C.a();
        String s = dole.b(this.D);
        String s1 = dmgy.a();
        eaqx eaqx0 = (eaqx)this.o.get();
        this.C.a();
        return new dpvp(context0, s, s1, eaqx0, new dpvr(dole.b(this.D), dmgy.a()));
    }

    final dpxx g() {
        Context context0 = this.C.a();
        Account account0 = dolc.b(this.D);
        dmgi dmgi0 = this.b();
        Account account1 = dolc.b(this.D);
        dlmc dlmc0 = new dlmc(this.C.a(), dole.b(this.D), dmgy.a());
        Context context1 = this.C.a();
        azts azts0 = dxei.b(this.C.a());
        etgl etgl0 = this.E();
        dmhi dmhi0 = this.d();
        fpgc fpgc0 = this.G.d();
        Preconditions.e(fpgc0);
        return new dpxx(context0, account0, dmgi0, new ecga(account1, dlmc0, context1, azts0, etgl0, new ecgd(dmhi0, dxim.a(fpgc0, dolc.b(this.D))), new bblp(1, 10), easq.a(), new dlnm(new acqn(this.C.a()), dolf.b(this.D), dole.b(this.D)), this.b(), this.D.c), this.v(), new edse(this.C.a()));
    }

    final dqhq h() {
        return new dqhq(this.d(), this.A(), this.y(), this.c(), this.z(), this.o());
    }

    final dqie i() {
        return new dqie(this.d(), this.c());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebbw ebbw0 = (ebbw)object0;
        Context context0 = this.C.a();
        Account account0 = dolc.b(this.D);
        String s = dole.b(this.D);
        String s1 = dolf.b(this.D);
        String s2 = dmgy.a();
        dvfu dvfu0 = this.p();
        this.e();
        dvgv dvgv0 = this.r();
        this.q();
        dvgh dvgh0 = new dvgh(this.d());
        dvjf dvjf0 = this.v();
        dvic dvic0 = new dvic(new dvib(this.C.a(), dole.b(this.D), dmgy.a()));
        dvil dvil0 = new dvil(new dvik(this.C.a(), dole.b(this.D), dmgy.a()));
        eata eata0 = east.a();
        tyb tyb0 = this.a();
        Context context1 = this.C.a();
        String s3 = dolf.b(this.D);
        String s4 = dole.b(this.D);
        dvma dvma0 = this.x();
        bblp bblp0 = new bblp(0x7FFFFFFF, 10);
        bblp bblp1 = new bblp(1, 10);
        dvmc dvmc0 = new dvmc(dolf.b(this.D), this.x(), this.w(), dmgy.a(), new dmkp(), this.C.a());
        dvgv dvgv1 = this.r();
        this.q();
        dvjm dvjm0 = new dvjm(dvjf0, dvic0, dvil0, eata0, tyb0, context1, s3, s4, dvma0, bblp0, bblp1, dvmc0, dvgv1);
        dvjf dvjf1 = this.v();
        dvhl dvhl0 = new dvhl(this.t());
        earu earu0 = this.C();
        dpvm dpvm0 = new dpvm(dole.b(this.D), dolf.b(this.D), this.C.a(), new dpwd(this.f(), easo.a(), this.a(), this.C()), new dpwn(this.C.a(), dole.b(this.D), dolf.b(this.D), this.g()), this.g(), new cjlv(this.C.a(), new cjky(this.C.a())), dydi.a(this.C.a()));
        dvha dvha0 = this.s();
        dvhb dvhb0 = new dvhb(this.C.a(), dolc.b(this.D), dole.b(this.D), dolf.b(this.D), this.p(), ((dspp)this.B.get()), new dvhd(((dspp)this.B.get()), this.v()), this.D(), this.s(), this.E());
        edmh edmh0 = this.D();
        dvhz dvhz0 = this.u();
        dvkn dvkn0 = new dvkn(this.y(), new bblp(0x7FFFFFFF, 9), this.r(), this.v(), new dvjs(this.C.a(), dole.b(this.D), dmgy.a(), this.B()), new dvjv(dole.b(this.D)), new dyda(dolc.b(this.D)));
        Context context2 = this.C.a();
        dvma dvma1 = this.x();
        dydx dydx0 = new dydx(dydy.a(), dmgy.a(), dolf.b(this.D), this.C.a());
        dvlp dvlp0 = new dvlp(dolc.b(this.D), this.C.h(), this.b());
        dvlr dvlr0 = this.w();
        Context context3 = this.C.a();
        this.q();
        ebbw0.a = new dvit(context0, account0, s, s1, s2, dvfu0, dvgv0, dvgh0, dvjm0, dvjf1, dvhl0, earu0, dpvm0, dvha0, dvhb0, edmh0, dvhz0, dvkn0, new dvlt(context2, dvma1, new dvmd(dydx0, dvlp0, dvlr0, context3)));
        ebbw0.b = new dqmj(this.C.a(), dole.b(this.D), dmgy.a(), dolc.b(this.D), this.l(), new dqlr(dole.b(this.D), dmgy.a(), this.C.a()), new dqht(this.d(), this.c()), new dqmf(this.C.a(), dole.b(this.D), dolf.b(this.D), this.k(), this.m(), this.i(), this.h(), this.n(), new dqna(this.m(), this.i(), this.y(), this.n()), new dqmp(this.h(), this.k(), this.m(), this.n()), this.y(), this.b(), this.o()), new dqpz(this.C.a(), new dokr(this.C.a(), new dmkp()), dole.b(this.D)), easi.a(), this.h(), new dqml(dolc.b(this.D), new dlnx(this.C.a(), new bblp(1, 10)), this.b(), this.C.a(), this.a()), new dqog(this.C.a(), dole.b(this.D), dolf.b(this.D), this.E(), new bblp(0x7FFFFFFF, 10)), DoubleCheck.a(dxyf.a));
        ebbw0.c = this.v();
        ebbw0.d = new edqq(this.d(), this.H.b);
        ebbw0.e = (edrp)this.d.get();
    }

    final dqjo j() {
        earg earg0 = this.A();
        this.z();
        return new dqjo(new dqjm(earg0), new dqjq(this.A()), this.A());
    }

    final dqlm k() {
        return new dqlm(dole.b(this.D), dolf.b(this.D), dmgy.a(), this.C.a(), new dsie(dole.b(this.D), dmgy.a(), this.C.a()), this.B(), DoubleCheck.a(dxyf.a), this.C.h());
    }

    final dqlo l() {
        return new dqlo(dole.b(this.D), dmgy.a(), this.C.a());
    }

    final dqmt m() {
        return new dqmt(this.k(), this.l(), this.i(), this.n(), this.C(), this.y(), this.C.a(), this.b(), dolc.b(this.D), dolf.b(this.D), dole.b(this.D), this.h(), easi.a(), this.j(), this.o());
    }

    final dqmv n() {
        Account account0 = dolc.b(this.D);
        Context context0 = this.C.a();
        dqlm dqlm0 = this.k();
        dmgi dmgi0 = this.b();
        dqjo dqjo0 = this.j();
        eaqu eaqu0 = this.z();
        Context context1 = this.C.a();
        frii frii0 = this.C.n();
        Preconditions.e(frii0);
        return new dqmv(account0, context0, dqlm0, dmgi0, dqjo0, eaqu0, new dxys(context1, frii0), this.o());
    }

    final dqnc o() {
        return new dqnc(this.l(), this.k(), new dlms(dlmv.b(this.C.a(), new dlmx(), new dlmt())), this.b());
    }

    final dvfu p() {
        return new dvfu(this.b(), new dmgm(dmgy.a()));
    }

    final dvgk q() {
        this.d();
        return new dvgk();
    }

    final dvgv r() {
        return new dvgv(this.p(), this.e(), this.d(), dvga.b(((edrp)this.d.get())), new edmu(this.e(), ((edrk)this.h.get()), ((edrg)this.i.get())));
    }

    final dvha s() {
        return new dvha(this.C.a(), dole.b(this.D), dmgy.a());
    }

    final dvhj t() {
        return new dvhj(this.C.a(), dole.b(this.D), dmgy.a(), ((eaqx)this.o.get()));
    }

    final dvhz u() {
        return new dvhz(this.C.a(), dole.b(this.D), dmgy.a());
    }

    final dvjf v() {
        return new dvjf(this.C.a(), dole.b(this.D), dmgy.a(), new dviy(dole.b(this.D), dmgy.a()), this.u(), new dvif(new dvid(this.C.a(), dole.b(this.D), dmgy.a())), ((eaqx)this.o.get()), dvmq.a(), this.x(), this.D.c);
    }

    final dvlr w() {
        return new dvlr(this.C.h(), dolf.b(this.D));
    }

    final dvma x() {
        return new dvma(dole.b(this.D), dmgy.a(), ((eaqx)this.o.get()));
    }

    final eaqs y() {
        return new eaqs(this.C.a(), dole.b(this.D), dolf.b(this.D), dmgy.a(), this.B());
    }

    final eaqu z() {
        return new eaqu(this.l(), this.k(), this.D(), this.e(), new dqjw(this.b()));
    }
}

