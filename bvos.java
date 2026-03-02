import dagger.android.AndroidInjector;

final class bvos implements AndroidInjector {
    private final bvok a;
    private final bvoq b;

    public bvos(bvok bvok0, bvoq bvoq0) {
        this.a = bvok0;
        this.b = bvoq0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        bvzq bvzq0 = (bvzq)object0;
        bvzq0.ag = this.b.a();
        bvzq0.ai = (bvpc)this.a.ag.get();
        bvzq0.ah = (bwdm)this.a.Z.get();
    }
}

