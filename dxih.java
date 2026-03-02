import dagger.android.AndroidInjector;

final class dxih implements AndroidInjector {
    private final doma a;
    private final dolg b;

    public dxih(doma doma0, dolg dolg0) {
        this.a = doma0;
        this.b = dolg0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dxjs dxjs0 = (dxjs)object0;
        dxjs0.ag = new azts(domd.b(this.a));
        dxjs0.b = this.b.a();
        dlnj.a();
        dxjs0.c = new dmgi(this.b.d(), dmgy.a());
    }
}

