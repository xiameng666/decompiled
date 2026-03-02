import android.accounts.Account;
import android.content.Context;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import j..util.Optional;

final class ebdk implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    final Provider e;
    final Provider f;
    final Provider g;
    private final dola h;
    private final domv i;
    private final dmgr j;

    public ebdk(dola dola0, dmgr dmgr0, domv domv0) {
        this.h = dola0;
        this.i = domv0;
        this.j = dmgr0;
        ebdj ebdj0 = new ebdj(domv0);
        this.a = ebdj0;
        dolf dolf0 = new dolf(dola0);
        this.b = dolf0;
        dmgj dmgj0 = new dmgj(ebdj0, dolf0);
        this.c = dmgj0;
        dole dole0 = new dole(dola0);
        this.d = dole0;
        ears ears0 = new ears(ebdj0, dole0);
        this.e = ears0;
        earp earp0 = new earp(ebdj0, dole0, ears0);
        this.f = earp0;
        this.g = DoubleCheck.b(new eaqy(ebdj0, dmgj0, earp0));
    }

    final dmgi a() {
        this.i.a();
        return new dmgi(dolf.b(this.h), dmgy.a());
    }

    final dmgo b() {
        return new dmgo(this.i.a(), this.d());
    }

    final dmhi c() {
        return dmhh.b(this.i.a(), dolf.b(this.h), dole.b(this.h), dmgy.a(), this.j.a, Optional.empty());
    }

    final dmkl d() {
        return new dmkl(this.i.a());
    }

    final dqjo e() {
        earg earg0 = this.k();
        this.j();
        return new dqjo(new dqjm(earg0), new dqjq(this.k()), this.k());
    }

    final dqlm f() {
        return new dqlm(dole.b(this.h), dolf.b(this.h), dmgy.a(), this.i.a(), new dsie(dole.b(this.h), dmgy.a(), this.i.a()), this.l(), DoubleCheck.a(dxyf.a), this.i.h());
    }

    final dqlo g() {
        return new dqlo(dole.b(this.h), dmgy.a(), this.i.a());
    }

    final dqnc h() {
        return new dqnc(this.g(), this.f(), new dlms(dlmv.b(this.i.a(), new dlmx(), new dlmt())), this.a());
    }

    final eaqs i() {
        return new eaqs(this.i.a(), dole.b(this.h), dolf.b(this.h), dmgy.a(), this.l());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dqlm dqlm0 = this.f();
        dqlo dqlo0 = this.g();
        dqie dqie0 = new dqie(this.c(), this.b());
        Account account0 = dolc.b(this.h);
        Context context0 = this.i.a();
        dqlm dqlm1 = this.f();
        dmgi dmgi0 = this.a();
        dqjo dqjo0 = this.e();
        eaqu eaqu0 = this.j();
        Context context1 = this.i.a();
        frii frii0 = this.i.n();
        Preconditions.e(frii0);
        dqmv dqmv0 = new dqmv(account0, context0, dqlm1, dmgi0, dqjo0, eaqu0, new dxys(context1, frii0), this.h());
        Context context2 = this.i.a();
        String s = dolf.b(this.h);
        String s1 = dole.b(this.h);
        String s2 = dmgy.a();
        dqlm dqlm2 = this.f();
        dvjf dvjf0 = new dvjf(this.i.a(), dole.b(this.h), dmgy.a(), new dviy(dole.b(this.h), dmgy.a()), new dvhz(this.i.a(), dole.b(this.h), dmgy.a()), new dvif(new dvid(this.i.a(), dole.b(this.h), dmgy.a())), ((eaqx)this.g.get()), dvmq.a(), new dvma(dole.b(this.h), dmgy.a(), ((eaqx)this.g.get())), this.h.c);
        Context context3 = this.i.a();
        String s3 = dole.b(this.h);
        String s4 = dmgy.a();
        eaqx eaqx0 = (eaqx)this.g.get();
        this.i.a();
        ((ebeo)object0).a = new dqmt(dqlm0, dqlo0, dqie0, dqmv0, new earu(context2, s, s1, s2, dqlm2, dvjf0, new dpvp(context3, s3, s4, eaqx0, new dpvr(dole.b(this.h), dmgy.a())), new dvhj(this.i.a(), dole.b(this.h), dmgy.a(), ((eaqx)this.g.get())), this.l(), this.i()), this.i(), this.i.a(), this.a(), dolc.b(this.h), dolf.b(this.h), dole.b(this.h), new dqhq(this.c(), this.k(), this.i(), this.b(), this.j(), this.h()), easi.a(), this.e(), this.h());
    }

    final eaqu j() {
        return new eaqu(this.g(), this.f(), new edmh(this.i.a(), dmgy.a(), easm.a()), this.d(), new dqjw(this.a()));
    }

    final earg k() {
        return new earg(new eard(this.d()), this.d(), this.a(), this.g(), this.f());
    }

    final earo l() {
        return new earo(this.i.a(), dole.b(this.h), dmgy.a(), new earr(this.i.a(), dole.b(this.h), dmgy.a()));
    }
}

