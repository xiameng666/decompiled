import dagger.android.AndroidInjector;

final class eykp implements AndroidInjector {
    private final eylm a;

    public eykp(eylm eylm0) {
        this.a = eylm0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        eyqp eyqp0 = (eyqp)object0;
        eyqp0.d = new eyec();
        eyqp0.ag = (eyet)this.a.aN.get();
        eyqp0.ah = new eyzy(this.a.a());
        eyqp0.ai = new eynd();
    }
}

