import dagger.android.AndroidInjector;

final class ebfu implements AndroidInjector {
    private final dola a;

    public ebfu(dola dola0) {
        this.a = dola0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ((ebfr)object0).b = new dtrz(dlnj.a(), dole.b(this.a), dmgy.a());
    }
}

