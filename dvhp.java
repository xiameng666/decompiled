import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

final class dvhp implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    final Provider e;
    final Provider f;
    final Provider g;
    private final domv h;
    private final dola i;
    private final dpqp j;

    public dvhp(dola dola0, domv domv0, dpqp dpqp0) {
        this.h = domv0;
        this.i = dola0;
        this.j = dpqp0;
        dvho dvho0 = new dvho(domv0);
        this.a = dvho0;
        dolf dolf0 = new dolf(dola0);
        this.b = dolf0;
        dmgj dmgj0 = new dmgj(dvho0, dolf0);
        this.c = dmgj0;
        dole dole0 = new dole(dola0);
        this.d = dole0;
        ears ears0 = new ears(dvho0, dole0);
        this.e = ears0;
        earp earp0 = new earp(dvho0, dole0, ears0);
        this.f = earp0;
        this.g = DoubleCheck.b(new eaqy(dvho0, dmgj0, earp0));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dvhw dvhw0 = (dvhw)object0;
        dvhw0.c = new dvjf(this.h.a(), dole.b(this.i), dmgy.a(), new dviy(dole.b(this.i), dmgy.a()), new dvhz(this.h.a(), dole.b(this.i), dmgy.a()), new dvif(new dvid(this.h.a(), dole.b(this.i), dmgy.a())), ((eaqx)this.g.get()), dvmq.a(), new dvma(dole.b(this.i), dmgy.a(), ((eaqx)this.g.get())), this.i.c);
        dvhw0.d = new bblp(0x7FFFFFFF, 10);
        dvhw0.h = new dvhn(this.h.a(), new bblp(0x7FFFFFFF, 10));
        fjcv fjcv0 = this.j.a();
        Preconditions.e(fjcv0);
        dvhw0.e = fjcv0;
        frbx frbx0 = this.j.b();
        Preconditions.e(frbx0);
        dvhw0.f = frbx0;
    }
}

