import dagger.android.AndroidInjector;

final class dvgy implements AndroidInjector {
    private final domv a;

    public dvgy(domv domv0) {
        this.a = domv0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dvgx dvgx0 = (dvgx)object0;
        dvgx0.a = new edmh(this.a.a(), dmgy.a(), easm.a());
        dvgx0.b = dydi.a(this.a.a());
        dvgx0.d = dxei.b(this.a.a());
    }
}

