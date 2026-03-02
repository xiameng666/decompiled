import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Provider;

final class ebka implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    private final domv e;

    public ebka(domv domv0) {
        this.e = domv0;
        ebjz ebjz0 = new ebjz(domv0);
        this.a = ebjz0;
        edsf edsf0 = new edsf(ebjz0);
        this.b = edsf0;
        edra edra0 = new edra(ebjz0, edsf0);
        this.c = edra0;
        this.d = DoubleCheck.b(new edrb(edra0));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebjg ebjg0 = (ebjg)object0;
        ebjg0.a = new edse(this.e.a());
        ebjg0.b = (edqy)this.d.get();
        ebjg0.c = bbnk.a;
        ebjg0.d = new ebst(this.e.h());
        ebjg0.e = dmgv.e(dmgy.a());
    }
}

