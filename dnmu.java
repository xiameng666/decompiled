import dagger.android.AndroidInjector;

final class dnmu implements AndroidInjector {
    private final dolg a;
    private final domw b;

    public dnmu(dolg dolg0, domw domw0) {
        this.a = dolg0;
        this.b = domw0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dnnk dnnk0 = (dnnk)object0;
        dnnk0.b = new dmet(dlnj.a(), this.a.a(), this.a.c(), new bblp(1, 10));
        dnnk0.c = new fuok();
    }
}

