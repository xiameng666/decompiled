import android.accounts.Account;
import android.content.Context;
import com.google.android.gms.pay.factoryreset.PayFactoryResetChimeraReceiver;
import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;
import j..util.Optional;

public final class dmks implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    final Provider e;
    final Provider f;
    final Provider g;
    private final dola h;
    private final domv i;

    public dmks(dola dola0, domv domv0) {
        this.h = dola0;
        this.i = domv0;
        dmkr dmkr0 = new dmkr(domv0);
        this.a = dmkr0;
        dolf dolf0 = new dolf(dola0);
        this.b = dolf0;
        dmgj dmgj0 = new dmgj(dmkr0, dolf0);
        this.c = dmgj0;
        dole dole0 = new dole(dola0);
        this.d = dole0;
        ears ears0 = new ears(dmkr0, dole0);
        this.e = ears0;
        earp earp0 = new earp(dmkr0, dole0, ears0);
        this.f = earp0;
        this.g = DoubleCheck.b(new eaqy(dmkr0, dmgj0, earp0));
    }

    final dmgi a() {
        this.i.a();
        return new dmgi(dolf.b(this.h), dmgy.a());
    }

    final dmgo b() {
        return new dmgo(this.i.a(), this.d());
    }

    final dmhi c() {
        return dmhh.b(this.i.a(), dolf.b(this.h), dole.b(this.h), dmgy.a(), null, Optional.empty());
    }

    final dmkl d() {
        return new dmkl(this.i.a());
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
        return new dqlm(dole.b(this.h), dolf.b(this.h), dmgy.a(), this.i.a(), new dsie(dole.b(this.h), dmgy.a(), this.i.a()), this.p(), DoubleCheck.a(dxyf.a), this.i.h());
    }

    final dqlo i() {
        return new dqlo(dole.b(this.h), dmgy.a(), this.i.a());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        PayFactoryResetChimeraReceiver payFactoryResetChimeraReceiver0 = (PayFactoryResetChimeraReceiver)object0;
        payFactoryResetChimeraReceiver0.c = new bblp(0x7FFFFFFF, 9);
        payFactoryResetChimeraReceiver0.d = new dmkw(this.h(), new dqmp(this.e(), this.h(), this.j(), this.k()), new dqna(this.j(), this.f(), this.m(), this.k()));
    }

    final dqmt j() {
        dqlm dqlm0 = this.h();
        dqlo dqlo0 = this.i();
        dqie dqie0 = this.f();
        dqmv dqmv0 = this.k();
        Context context0 = this.i.a();
        String s = dolf.b(this.h);
        String s1 = dole.b(this.h);
        String s2 = dmgy.a();
        dqlm dqlm1 = this.h();
        dvjf dvjf0 = new dvjf(this.i.a(), dole.b(this.h), dmgy.a(), new dviy(dole.b(this.h), dmgy.a()), new dvhz(this.i.a(), dole.b(this.h), dmgy.a()), new dvif(new dvid(this.i.a(), dole.b(this.h), dmgy.a())), ((eaqx)this.g.get()), dvmq.a(), new dvma(dole.b(this.h), dmgy.a(), ((eaqx)this.g.get())), this.h.c);
        Context context1 = this.i.a();
        String s3 = dole.b(this.h);
        String s4 = dmgy.a();
        eaqx eaqx0 = (eaqx)this.g.get();
        this.i.a();
        return new dqmt(dqlm0, dqlo0, dqie0, dqmv0, new earu(context0, s, s1, s2, dqlm1, dvjf0, new dpvp(context1, s3, s4, eaqx0, new dpvr(dole.b(this.h), dmgy.a())), new dvhj(this.i.a(), dole.b(this.h), dmgy.a(), ((eaqx)this.g.get())), this.p(), this.m()), this.m(), this.i.a(), this.a(), dolc.b(this.h), dolf.b(this.h), dole.b(this.h), this.e(), easi.a(), this.g(), this.l());
    }

    final dqmv k() {
        Account account0 = dolc.b(this.h);
        Context context0 = this.i.a();
        dqlm dqlm0 = this.h();
        dmgi dmgi0 = this.a();
        dqjo dqjo0 = this.g();
        eaqu eaqu0 = this.n();
        Context context1 = this.i.a();
        frii frii0 = this.i.n();
        Preconditions.e(frii0);
        return new dqmv(account0, context0, dqlm0, dmgi0, dqjo0, eaqu0, new dxys(context1, frii0), this.l());
    }

    final dqnc l() {
        return new dqnc(this.i(), this.h(), new dlms(dlmv.b(this.i.a(), new dlmx(), new dlmt())), this.a());
    }

    final eaqs m() {
        return new eaqs(this.i.a(), dole.b(this.h), dolf.b(this.h), dmgy.a(), this.p());
    }

    final eaqu n() {
        return new eaqu(this.i(), this.h(), new edmh(this.i.a(), dmgy.a(), easm.a()), this.d(), new dqjw(this.a()));
    }

    final earg o() {
        return new earg(new eard(this.d()), this.d(), this.a(), this.i(), this.h());
    }

    final earo p() {
        return new earo(this.i.a(), dole.b(this.h), dmgy.a(), new earr(this.i.a(), dole.b(this.h), dmgy.a()));
    }
}

