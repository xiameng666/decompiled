import dagger.android.AndroidInjector;

final class dojn implements AndroidInjector {
    private final domv a;

    public dojn(domv domv0) {
        this.a = domv0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dojt dojt0 = (dojt)object0;
        dojt0.a = new dmkl(this.a.a());
        dojt0.b = new fuok();
    }
}

