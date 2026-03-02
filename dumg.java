import dagger.android.AndroidInjector;

final class dumg implements AndroidInjector {
    private final doly a;

    public dumg(doly doly0) {
        this.a = doly0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        alh alh0 = alh.c(dlnj.a());
        edlc.b(new lso(this.a.e()));
        ((duma)object0).b = new edky(alh0);
    }
}

