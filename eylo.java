import dagger.android.AndroidInjector;

final class eylo implements AndroidInjector {
    private final eylm a;

    public eylo(eylm eylm0) {
        this.a = eylm0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ((eysv)object0).ag = new eyzy(this.a.a());
    }
}

