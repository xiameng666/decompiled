import dagger.android.AndroidInjector;

final class dtyq implements AndroidInjector {
    private final domv a;

    public dtyq(domv domv0) {
        this.a = domv0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dtys dtys0 = (dtys)object0;
        dtys0.d = new etgl(this.a.a());
        dtys0.b = new cjlv(this.a.a(), new cjky(this.a.a()));
    }
}

