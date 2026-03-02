import dagger.android.AndroidInjector;

final class ehqm implements AndroidInjector {
    private final ehqj a;

    public ehqm(ehqj ehqj0) {
        this.a = ehqj0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ((ehnb)object0).U(((cmec)this.a.q.get()));
    }
}

