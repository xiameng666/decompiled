import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Provider;
import j..util.Optional;

final class dxvn implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    final Provider e;
    private final domv f;
    private final dola g;
    private final dmgr h;

    public dxvn(dola dola0, dmgr dmgr0, domv domv0) {
        this.f = domv0;
        this.g = dola0;
        this.h = dmgr0;
        dxvm dxvm0 = new dxvm(domv0);
        this.a = dxvm0;
        dlnk dlnk0 = new dlnk(dxvm0);
        this.b = dlnk0;
        dolf dolf0 = new dolf(dola0);
        this.c = dolf0;
        dole dole0 = new dole(dola0);
        this.d = dole0;
        this.e = new dlnn(dlnk0, dolf0, dole0);
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dxxk dxxk0 = (dxxk)object0;
        dxxk0.f = new dpty(dmhh.b(this.f.a(), dolf.b(this.g), dole.b(this.g), dmgy.a(), this.h.a, Optional.empty()));
        dxxk0.g = this.f.a();
        dxxk0.h = dond.a();
        dxxk0.i = dole.b(this.g);
        dxxk0.j = dolf.b(this.g);
        dxxk0.k = new dxwm(this.f.a(), dmgy.a(), dolc.b(this.g));
        dxxk0.l = DoubleCheck.a(this.e);
        dxxk0.m = new dmgo(this.f.a(), new dmkl(this.f.a()));
        dxxk0.n = this.f.h();
        this.f.a();
        dxxk0.o = new dmgi(dolf.b(this.g), dmgy.a());
    }
}

