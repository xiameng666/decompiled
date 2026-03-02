import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Provider;

final class dvrb implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    private final dxed d;
    private final dolg e;

    public dvrb(dolg dolg0, dxed dxed0) {
        this.d = dxed0;
        this.e = dolg0;
        dmkm dmkm0 = new dmkm(dlni.a);
        this.a = dmkm0;
        edrr edrr0 = new edrr(dmkm0);
        this.b = edrr0;
        this.c = DoubleCheck.b(new edrz(edrr0));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dvxs dvxs0 = (dvxs)object0;
        dvxs0.ak = this.d.a();
        dvxs0.c = this.e.a();
        dvxs0.d = (edrp)this.c.get();
    }
}

