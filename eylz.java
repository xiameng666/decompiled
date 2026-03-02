import dagger.android.AndroidInjector;

final class eylz implements AndroidInjector {
    private final eymy a;

    public eylz(eymy eymy0) {
        this.a = eymy0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        eyqp eyqp0 = (eyqp)object0;
        eyqp0.d = new eyec();
        eyqp0.ag = (eyet)this.a.aP.get();
        eyqp0.ah = new eyzy(this.a.a());
        eyqp0.ai = new eynd();
    }
}

