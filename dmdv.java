import dagger.android.AndroidInjector;

final class dmdv implements AndroidInjector {
    private final domv a;
    private final dola b;

    public dmdv(dola dola0, domv domv0) {
        this.a = domv0;
        this.b = dola0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dmdu dmdu0 = (dmdu)object0;
        this.a.a();
        dmdu0.a = new dmdt(new dmgi(dolf.b(this.b), dmgy.a()));
        dmdu0.g = dxei.b(this.a.a());
        dmdu0.e = new etgl(this.a.a());
        dmdu0.b = dolc.b(this.b);
        dmdu0.c = new cjlv(this.a.a(), new cjky(this.a.a()));
        dmdu0.f = new fseb(this.a.h());
    }
}

