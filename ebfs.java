import dagger.android.AndroidInjector;

final class ebfs implements AndroidInjector {
    private final dola a;

    public ebfs(dola dola0) {
        this.a = dola0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ((ebfh)object0).b = new dtrz(dlnj.a(), dole.b(this.a), dmgy.a());
    }
}

