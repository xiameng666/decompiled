import android.accounts.Account;
import android.content.Context;
import dagger.Lazy;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import j..util.Optional;

final class ebdi implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    final Provider e;
    final Provider f;
    final Provider g;
    final Provider h;
    final Provider i;
    private final dola j;
    private final domv k;
    private final dmgr l;
    private final domw m;
    private final eefy n;

    public ebdi(dola dola0, dmgr dmgr0, eefy eefy0, domw domw0, domv domv0) {
        this.j = dola0;
        this.k = domv0;
        this.l = dmgr0;
        this.m = domw0;
        this.n = eefy0;
        ebdh ebdh0 = new ebdh(domv0);
        this.a = ebdh0;
        dolf dolf0 = new dolf(dola0);
        this.b = dolf0;
        dmgj dmgj0 = new dmgj(ebdh0, dolf0);
        this.c = dmgj0;
        dole dole0 = new dole(dola0);
        this.d = dole0;
        ears ears0 = new ears(ebdh0, dole0);
        this.e = ears0;
        earp earp0 = new earp(ebdh0, dole0, ears0);
        this.f = earp0;
        this.g = DoubleCheck.b(new eaqy(ebdh0, dmgj0, earp0));
        this.h = new edoc(ebdh0);
        this.i = new edod(ebdh0);
    }

    final dmgi a() {
        this.k.a();
        return new dmgi(dolf.b(this.j), dmgy.a());
    }

    final dmgo b() {
        return new dmgo(this.k.a(), this.d());
    }

    final dmhi c() {
        return dmhh.b(this.k.a(), dolf.b(this.j), dole.b(this.j), dmgy.a(), this.l.a, Optional.empty());
    }

    final dmkl d() {
        return new dmkl(this.k.a());
    }

    final dqhq e() {
        return new dqhq(this.c(), this.u(), this.s(), this.b(), this.t(), this.q());
    }

    final dqie f() {
        return new dqie(this.c(), this.b());
    }

    final dqig g() {
        return new dqig(this.c(), this.b());
    }

    final dqjo h() {
        earg earg0 = this.u();
        this.t();
        return new dqjo(new dqjm(earg0), new dqjq(this.u()), this.u());
    }

    final dqjw i() {
        return new dqjw(this.a());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebel ebel0 = (ebel)object0;
        ebel0.a = this.n();
        ebel0.b = new dqhz(this.c(), this.b());
        dqor dqor0 = new dqor(dolc.b(this.j), this.f(), this.n(), this.s(), this.w(), this.k.a(), this.x(), this.r(), this.p(), this.y(), dxei.b(this.k.a()), new edrq(this.d()));
        dqov dqov0 = new dqov(this.g(), this.k.a(), this.x());
        dqoz dqoz0 = new dqoz(this.g(), this.k.a(), this.x());
        dqoj dqoj0 = new dqoj(this.e());
        dqok dqok0 = new dqok(this.e());
        dqoq dqoq0 = new dqoq(dolc.b(this.j), this.e(), this.x(), this.l(), this.n(), this.s(), this.w(), this.k.a(), this.y(), this.i(), this.r());
        dqot dqot0 = new dqot(this.e(), this.x(), this.k.a(), this.i());
        dqoy dqoy0 = new dqoy(this.e(), this.x(), this.k.a(), this.s(), this.w(), this.i());
        dqou dqou0 = new dqou(this.e(), this.k.a(), this.x(), this.i());
        dqos dqos0 = new dqos(this.k.a(), this.x(), this.i(), this.n(), this.l(), this.w(), this.s(), this.r());
        dqna dqna0 = this.p();
        dqmp dqmp0 = this.m();
        dqmj dqmj0 = this.l();
        dqpq dqpq0 = new dqpq(new dxye(), this.j(), this.k(), dole.b(this.j), dmgy.a(), this.h(), this.a(), this.k.a(), new bblp(0x7FFFFFFF, 9), new ednx(edob.a(this.k.a()), this.h, this.i), this.q());
        bblp bblp0 = new bblp(0x7FFFFFFF, 10);
        fcfe fcfe0 = fcfo.d(this.k.a());
        String s = dole.b(this.j);
        String s1 = dolf.b(this.j);
        String s2 = dmgy.a();
        Lazy lazy0 = DoubleCheck.a(dxyf.a);
        bblp bblp1 = new bblp(0x7FFFFFFF, 9);
        ebel0.c = new dqhn(dqor0, dqov0, dqoz0, dqoj0, dqok0, dqoq0, dqot0, dqoy0, dqou0, dqos0, dqna0, dqmp0, dqmj0, dqpq0, bblp0, new eefp(fcfe0, s, s1, s2, this.n.b, this.n.a, lazy0, bblp1), dole.b(this.j), dmgy.a(), this.k.a(), DoubleCheck.a(dxyf.a), easi.a());
    }

    final dqlm j() {
        return new dqlm(dole.b(this.j), dolf.b(this.j), dmgy.a(), this.k.a(), this.r(), this.v(), DoubleCheck.a(dxyf.a), this.k.h());
    }

    final dqlo k() {
        return new dqlo(dole.b(this.j), dmgy.a(), this.k.a());
    }

    final dqmj l() {
        return new dqmj(this.k.a(), dole.b(this.j), dmgy.a(), dolc.b(this.j), this.k(), new dqlr(dole.b(this.j), dmgy.a(), this.k.a()), new dqht(this.c(), this.b()), new dqmf(this.k.a(), dole.b(this.j), dolf.b(this.j), this.j(), this.n(), this.f(), this.e(), this.o(), this.p(), this.m(), this.s(), this.a(), this.q()), new dqpz(this.k.a(), new dokr(this.k.a(), new dmkp()), dole.b(this.j)), easi.a(), this.e(), new dqml(dolc.b(this.j), new dlnx(this.k.a(), new bblp(1, 10)), this.a(), this.k.a(), efmg.b(this.k.a())), new dqog(this.k.a(), dole.b(this.j), dolf.b(this.j), this.y(), new bblp(0x7FFFFFFF, 10)), DoubleCheck.a(dxyf.a));
    }

    final dqmp m() {
        return new dqmp(this.e(), this.j(), this.n(), this.o());
    }

    final dqmt n() {
        return new dqmt(this.j(), this.k(), this.f(), this.o(), this.w(), this.s(), this.k.a(), this.a(), dolc.b(this.j), dolf.b(this.j), dole.b(this.j), this.e(), easi.a(), this.h(), this.q());
    }

    final dqmv o() {
        Account account0 = dolc.b(this.j);
        Context context0 = this.k.a();
        dqlm dqlm0 = this.j();
        dmgi dmgi0 = this.a();
        dqjo dqjo0 = this.h();
        eaqu eaqu0 = this.t();
        Context context1 = this.k.a();
        frii frii0 = this.k.n();
        Preconditions.e(frii0);
        return new dqmv(account0, context0, dqlm0, dmgi0, dqjo0, eaqu0, new dxys(context1, frii0), this.q());
    }

    final dqna p() {
        return new dqna(this.n(), this.f(), this.s(), this.o());
    }

    final dqnc q() {
        return new dqnc(this.k(), this.j(), new dlms(dlmv.b(this.k.a(), new dlmx(), new dlmt())), this.a());
    }

    final dsie r() {
        return new dsie(dole.b(this.j), dmgy.a(), this.k.a());
    }

    final eaqs s() {
        return new eaqs(this.k.a(), dole.b(this.j), dolf.b(this.j), dmgy.a(), this.v());
    }

    final eaqu t() {
        return new eaqu(this.k(), this.j(), new edmh(this.k.a(), dmgy.a(), easm.a()), this.d(), this.i());
    }

    final earg u() {
        return new earg(new eard(this.d()), this.d(), this.a(), this.k(), this.j());
    }

    final earo v() {
        return new earo(this.k.a(), dole.b(this.j), dmgy.a(), new earr(this.k.a(), dole.b(this.j), dmgy.a()));
    }

    final earu w() {
        Context context0 = this.k.a();
        String s = dolf.b(this.j);
        String s1 = dole.b(this.j);
        String s2 = dmgy.a();
        dqlm dqlm0 = this.j();
        dvjf dvjf0 = new dvjf(this.k.a(), dole.b(this.j), dmgy.a(), new dviy(dole.b(this.j), dmgy.a()), new dvhz(this.k.a(), dole.b(this.j), dmgy.a()), new dvif(new dvid(this.k.a(), dole.b(this.j), dmgy.a())), ((eaqx)this.g.get()), dvmq.a(), new dvma(dole.b(this.j), dmgy.a(), ((eaqx)this.g.get())), this.j.c);
        Context context1 = this.k.a();
        String s3 = dole.b(this.j);
        String s4 = dmgy.a();
        eaqx eaqx0 = (eaqx)this.g.get();
        this.k.a();
        return new earu(context0, s, s1, s2, dqlm0, dvjf0, new dpvp(context1, s3, s4, eaqx0, new dpvr(dole.b(this.j), dmgy.a())), new dvhj(this.k.a(), dole.b(this.j), dmgy.a(), ((eaqx)this.g.get())), this.v(), this.s());
    }

    final edon x() {
        return new edon(this.k.a());
    }

    final etgl y() {
        return new etgl(this.k.a());
    }
}

