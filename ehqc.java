import dagger.android.AndroidInjector;

final class ehqc implements AndroidInjector {
    private final ehpz a;

    public ehqc(ehpz ehpz0) {
        this.a = ehpz0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        cmec cmec0 = (cmec)this.a.q.get();
        ibuq.f(cmec0, "<set-?>");
        ((ehmp)object0).ai = cmec0;
    }
}

