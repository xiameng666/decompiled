import dagger.android.AndroidInjector;

final class ehqw implements AndroidInjector {
    private final ehqt a;

    public ehqw(ehqt ehqt0) {
        this.a = ehqt0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ((ehnb)object0).U(((cmec)this.a.q.get()));
    }
}

