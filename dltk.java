import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;

final class dltk implements AndroidInjector {
    private final domv a;
    private final dolg b;
    private final doly c;

    public dltk(dolg dolg0, doly doly0, domv domv0) {
        this.a = domv0;
        this.b = dolg0;
        this.c = doly0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dltp dltp0 = (dltp)object0;
        this.a.a();
        dltp0.a = new dmgi(this.b.d(), dmgy.a());
        dltp0.b = this.b.a();
        dltp0.c = this.c.c();
        fhwk fhwk0 = this.a.i();
        Preconditions.e(fhwk0);
        dltp0.d = fhwk0;
        dltp0.ag = this.a.g();
        dltp0.ah = new fuok();
        dltp0.ai = this.a.j();
    }
}

