import dagger.android.AndroidInjector;

final class dvqj implements AndroidInjector {
    private final dolg a;
    private final dxed b;
    private final domv c;
    private final edor d;

    public dvqj(dolg dolg0, dxed dxed0, edor edor0, domv domv0) {
        this.a = dolg0;
        this.b = dxed0;
        this.c = domv0;
        this.d = edor0;
    }

    final dmgi a() {
        this.c.a();
        return new dmgi(this.a.d(), dmgy.a());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dvts dvts0 = (dvts)object0;
        dvts0.b = this.a.a();
        dvts0.c = new fshk();
        dvts0.ar = this.b.a();
        dvts0.d = new edon(this.c.a());
        dvts0.ag = new efma(this.c.a());
        dvts0.ah = new edse(this.c.a());
        dvts0.ai = this.a();
        dvts0.aj = new dvfu(this.a(), new dmgm(dmgy.a()));
        dvts0.ak = this.d.a();
        dvts0.al = new dvlr(this.c.h(), this.a.d());
    }
}

