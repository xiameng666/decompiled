import dagger.android.AndroidInjector;

final class eymb implements AndroidInjector {
    private final eymy a;

    public eymb(eymy eymy0) {
        this.a = eymy0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ((eytv)object0).ag = new eyzy(this.a.a());
    }
}

