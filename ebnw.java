import dagger.android.AndroidInjector;

final class ebnw implements AndroidInjector {
    private final domv a;

    public ebnw(domv domv0) {
        this.a = domv0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebvx ebvx0 = (ebvx)object0;
        ebvx0.b = dmgv.e(dmgy.a());
        ebvx0.e = new etgl(this.a.a());
        ebvx0.c = new ebst(this.a.h());
        ebvx0.d = bbnk.a;
    }
}

