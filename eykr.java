import dagger.android.AndroidInjector;

final class eykr implements AndroidInjector {
    private final eylm a;

    public eykr(eylm eylm0) {
        this.a = eylm0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ((eytv)object0).ag = new eyzy(this.a.a());
    }
}

