import dagger.android.AndroidInjector;

final class eynb implements AndroidInjector {
    private final eymy a;

    public eynb(eymy eymy0) {
        this.a = eymy0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ((eysv)object0).ag = new eyzy(this.a.a());
    }
}

