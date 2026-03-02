import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

final class dnan implements AndroidInjector {
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
    private final doly k;
    private final dola l;
    private final domv m;

    public dnan(dola dola0, eefy eefy0, domv domv0, doly doly0, domw domw0) {
        this.k = doly0;
        this.l = dola0;
        this.m = domv0;
        dnak dnak0 = new dnak(domv0);
        this.a = dnak0;
        dolc dolc0 = new dolc(dola0);
        this.b = dolc0;
        eegc eegc0 = new eegc(eefy0);
        this.c = eegc0;
        eegd eegd0 = new eegd(eefy0);
        this.d = eegd0;
        dnam dnam0 = new dnam(doly0);
        this.e = dnam0;
        eczt eczt0 = new eczt(dnam0);
        this.f = eczt0;
        dolb dolb0 = new dolb(dola0);
        this.g = dolb0;
        dnal dnal0 = new dnal();
        this.h = dnal0;
        dxzp dxzp0 = new dxzp(dolc0, dnal0);
        this.i = dxzp0;
        this.j = new dnkn(dnak0, dolc0, eegc0, eegd0, eczt0, dolb0, dxzp0);
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dnci dnci0 = (dnci)object0;
        azts azts0 = new azts(this.k.e(), null);
        String s = dolf.b(this.l);
        String s1 = dole.b(this.l);
        etgl etgl0 = new etgl(this.k.e());
        edse edse0 = new edse(this.m.a());
        dnci0.ai = new eeaw(azts0, s, s1, this.l.c, etgl0, edse0);
        fuot fuot0 = this.m.o();
        Preconditions.e(fuot0);
        dnci0.aj = fuot0;
        this.m.a();
        dnci0.ak = new dmgi(dolf.b(this.l), dmgy.a());
        dnci0.al = this.j;
    }
}

