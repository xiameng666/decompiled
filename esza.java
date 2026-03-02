import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Provider;

final class esza implements AndroidInjector {
    final Provider a;
    private final doma b;
    private final dolg c;

    public esza(doma doma0, dolg dolg0) {
        this.b = doma0;
        this.c = dolg0;
        this.a = DoubleCheck.b(new esey());
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        eszq eszq0 = (eszq)object0;
        eszq0.an = new azts(domd.b(this.b), null);
        eszq0.am = new etgl(domd.b(this.b));
        eszq0.b = new evoz(domd.b(this.b), domf.a(this.b));
        eszq0.c = this.c.d();
        eszq0.d = this.c.c();
        eszq0.ag = new etmv(esfl.a(), this.c.b());
        eszq0.ah = (foeg)this.a.get();
        eszq0.ai = new dmkl(esfl.a());
    }
}

