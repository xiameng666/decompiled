import dagger.android.AndroidInjector;

final class bvou implements AndroidInjector {
    private final bvok a;
    private final bvog b;

    public bvou(bvok bvok0, bvog bvog0) {
        this.a = bvok0;
        this.b = bvog0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        bvzq bvzq0 = (bvzq)object0;
        bvzq0.ag = this.b.a();
        bvzq0.ai = (bvpc)this.a.ag.get();
        bvzq0.ah = (bwdm)this.a.Z.get();
    }
}

