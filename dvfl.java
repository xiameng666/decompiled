import dagger.android.AndroidInjector;

final class dvfl implements AndroidInjector {
    private final dolg a;

    public dvfl(dolg dolg0) {
        this.a = dolg0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dvfm dvfm0 = (dvfm)object0;
        dvfm0.b = this.a.a();
        dvfm0.c = new dspv();
        dvfm0.d = new dspu();
        dvfm0.ag = new fshk();
    }
}

