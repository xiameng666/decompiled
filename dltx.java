import android.accounts.Account;
import android.content.Context;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import j..util.Optional;

final class dltx implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    final Provider e;
    final Provider f;
    final Provider g;
    private final domv h;
    private final dola i;
    private final dmgr j;
    private final domw k;

    public dltx(dola dola0, dmgr dmgr0, domw domw0, domv domv0) {
        this.h = domv0;
        this.i = dola0;
        this.j = dmgr0;
        this.k = domw0;
        dltw dltw0 = new dltw(domv0);
        this.a = dltw0;
        dolf dolf0 = new dolf(dola0);
        this.b = dolf0;
        dmgj dmgj0 = new dmgj(dltw0, dolf0);
        this.c = dmgj0;
        dole dole0 = new dole(dola0);
        this.d = dole0;
        ears ears0 = new ears(dltw0, dole0);
        this.e = ears0;
        earp earp0 = new earp(dltw0, dole0, ears0);
        this.f = earp0;
        this.g = DoubleCheck.b(new eaqy(dltw0, dmgj0, earp0));
    }

    final dmgi a() {
        this.h.a();
        return new dmgi(dolf.b(this.i), dmgy.a());
    }

    final dmgo b() {
        return new dmgo(this.h.a(), this.d());
    }

    final dmhi c() {
        return dmhh.b(this.h.a(), dolf.b(this.i), dole.b(this.i), dmgy.a(), this.j.a, Optional.empty());
    }

    final dmkl d() {
        return new dmkl(this.h.a());
    }

    final dqhq e() {
        return new dqhq(this.c(), this.o(), this.m(), this.b(), this.n(), this.l());
    }

    final dqie f() {
        return new dqie(this.c(), this.b());
    }

    final dqjo g() {
        earg earg0 = this.o();
        this.n();
        return new dqjo(new dqjm(earg0), new dqjq(this.o()), this.o());
    }

    final dqlm h() {
        return new dqlm(dole.b(this.i), dolf.b(this.i), dmgy.a(), this.h.a(), new dsie(dole.b(this.i), dmgy.a(), this.h.a()), this.p(), DoubleCheck.a(dxyf.a), this.h.h());
    }

    final dqlo i() {
        return new dqlo(dole.b(this.i), dmgy.a(), this.h.a());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ((dlty)object0).a = new dqmj(this.h.a(), dole.b(this.i), dmgy.a(), dolc.b(this.i), this.i(), new dqlr(dole.b(this.i), dmgy.a(), this.h.a()), new dqht(this.c(), this.b()), new dqmf(this.h.a(), dole.b(this.i), dolf.b(this.i), this.h(), this.j(), this.f(), this.e(), this.k(), new dqna(this.j(), this.f(), this.m(), this.k()), new dqmp(this.e(), this.h(), this.j(), this.k()), this.m(), this.a(), this.l()), new dqpz(this.h.a(), new dokr(this.h.a(), new dmkp()), dole.b(this.i)), easi.a(), this.e(), new dqml(dolc.b(this.i), new dlnx(this.h.a(), new bblp(1, 10)), this.a(), this.h.a(), efmg.b(this.h.a())), new dqog(this.h.a(), dole.b(this.i), dolf.b(this.i), new etgl(this.h.a()), new bblp(0x7FFFFFFF, 10)), DoubleCheck.a(dxyf.a));
    }

    final dqmt j() {
        dqlm dqlm0 = this.h();
        dqlo dqlo0 = this.i();
        dqie dqie0 = this.f();
        dqmv dqmv0 = this.k();
        Context context0 = this.h.a();
        String s = dolf.b(this.i);
        String s1 = dole.b(this.i);
        String s2 = dmgy.a();
        dqlm dqlm1 = this.h();
        dvjf dvjf0 = new dvjf(this.h.a(), dole.b(this.i), dmgy.a(), new dviy(dole.b(this.i), dmgy.a()), new dvhz(this.h.a(), dole.b(this.i), dmgy.a()), new dvif(new dvid(this.h.a(), dole.b(this.i), dmgy.a())), ((eaqx)this.g.get()), dvmq.a(), new dvma(dole.b(this.i), dmgy.a(), ((eaqx)this.g.get())), this.i.c);
        Context context1 = this.h.a();
        String s3 = dole.b(this.i);
        String s4 = dmgy.a();
        eaqx eaqx0 = (eaqx)this.g.get();
        this.h.a();
        return new dqmt(dqlm0, dqlo0, dqie0, dqmv0, new earu(context0, s, s1, s2, dqlm1, dvjf0, new dpvp(context1, s3, s4, eaqx0, new dpvr(dole.b(this.i), dmgy.a())), new dvhj(this.h.a(), dole.b(this.i), dmgy.a(), ((eaqx)this.g.get())), this.p(), this.m()), this.m(), this.h.a(), this.a(), dolc.b(this.i), dolf.b(this.i), dole.b(this.i), this.e(), easi.a(), this.g(), this.l());
    }

    final dqmv k() {
        Account account0 = dolc.b(this.i);
        Context context0 = this.h.a();
        dqlm dqlm0 = this.h();
        dmgi dmgi0 = this.a();
        dqjo dqjo0 = this.g();
        eaqu eaqu0 = this.n();
        Context context1 = this.h.a();
        frii frii0 = this.h.n();
        Preconditions.e(frii0);
        return new dqmv(account0, context0, dqlm0, dmgi0, dqjo0, eaqu0, new dxys(context1, frii0), this.l());
    }

    final dqnc l() {
        return new dqnc(this.i(), this.h(), new dlms(dlmv.b(this.h.a(), new dlmx(), new dlmt())), this.a());
    }

    final eaqs m() {
        return new eaqs(this.h.a(), dole.b(this.i), dolf.b(this.i), dmgy.a(), this.p());
    }

    final eaqu n() {
        return new eaqu(this.i(), this.h(), new edmh(this.h.a(), dmgy.a(), easm.a()), this.d(), new dqjw(this.a()));
    }

    final earg o() {
        return new earg(new eard(this.d()), this.d(), this.a(), this.i(), this.h());
    }

    final earo p() {
        return new earo(this.h.a(), dole.b(this.i), dmgy.a(), new earr(this.h.a(), dole.b(this.i), dmgy.a()));
    }
}

