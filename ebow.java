import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Provider;

final class ebow implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    private final domv e;

    public ebow(domv domv0) {
        this.e = domv0;
        ebov ebov0 = new ebov(domv0);
        this.a = ebov0;
        edsf edsf0 = new edsf(ebov0);
        this.b = edsf0;
        edra edra0 = new edra(ebov0, edsf0);
        this.c = edra0;
        this.d = DoubleCheck.b(new edrb(edra0));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebyb ebyb0 = (ebyb)object0;
        ebyb0.a = (edqy)this.d.get();
        ebyb0.b = new ebst(this.e.h());
        ebyb0.c = bbnk.a;
        ebyb0.d = new edse(this.e.a());
        ebyb0.e = dmgv.e(dmgy.a());
    }
}

