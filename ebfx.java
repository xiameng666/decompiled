import dagger.android.AndroidInjector;

final class ebfx implements AndroidInjector {
    private final dola a;

    public ebfx(dola dola0) {
        this.a = dola0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ((ebgu)object0).a = new dmce(dlnj.a(), dole.b(this.a), dmgy.a());
    }
}

