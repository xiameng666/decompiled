import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Provider;

final class eayg implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    final Provider e;
    final Provider f;
    final Provider g;
    private final domv h;
    private final dola i;

    public eayg(dola dola0, domv domv0) {
        this.h = domv0;
        this.i = dola0;
        eayf eayf0 = new eayf(domv0);
        this.a = eayf0;
        dolf dolf0 = new dolf(dola0);
        this.b = dolf0;
        dmgj dmgj0 = new dmgj(eayf0, dolf0);
        this.c = dmgj0;
        dole dole0 = new dole(dola0);
        this.d = dole0;
        ears ears0 = new ears(eayf0, dole0);
        this.e = ears0;
        earp earp0 = new earp(eayf0, dole0, ears0);
        this.f = earp0;
        this.g = DoubleCheck.b(new eaqy(eayf0, dmgj0, earp0));
    }

    final dvjf a() {
        return new dvjf(this.h.a(), dole.b(this.i), dmgy.a(), new dviy(dole.b(this.i), dmgy.a()), new dvhz(this.h.a(), dole.b(this.i), dmgy.a()), new dvif(new dvid(this.h.a(), dole.b(this.i), dmgy.a())), ((eaqx)this.g.get()), dvmq.a(), new dvma(dole.b(this.i), dmgy.a(), ((eaqx)this.g.get())), this.i.c);
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebbo ebbo0 = (ebbo)object0;
        ebbo0.a = this.a();
        ebbo0.b = new dvin(new etgl(this.h.a()), dxei.b(this.h.a()), new dvim(this.h.a(), dole.b(this.i), dmgy.a()), this.a());
    }
}

