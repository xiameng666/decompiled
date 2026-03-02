import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Provider;

final class doko implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    private final domv e;

    public doko(domv domv0) {
        this.e = domv0;
        dokn dokn0 = new dokn(domv0);
        this.a = dokn0;
        dmkm dmkm0 = new dmkm(dokn0);
        this.b = dmkm0;
        edrr edrr0 = new edrr(dmkm0);
        this.c = edrr0;
        this.d = DoubleCheck.b(new edrz(edrr0));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dokp dokp0 = (dokp)object0;
        dokp0.e = new etgl(this.e.a());
        dokp0.b = (edrp)this.d.get();
        dokp0.c = new cjlv(this.e.a(), new cjky(this.e.a()));
    }
}

