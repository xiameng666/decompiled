import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;
import dagger.internal.Provider;

final class dxoc implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    final Provider e;
    final Provider f;
    private final domv g;

    public dxoc(dolg dolg0, domv domv0, domw domw0, doly doly0) {
        this.g = domv0;
        dxnz dxnz0 = new dxnz(domv0);
        this.a = dxnz0;
        dxny dxny0 = new dxny(dolg0);
        this.b = dxny0;
        dycc dycc0 = new dycc(dxnz0, dxny0);
        this.c = dycc0;
        this.d = new dxoa();
        dxob dxob0 = new dxob(doly0);
        this.e = dxob0;
        this.f = new dxps(dycc0, dxob0);
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dxpm dxpm0 = (dxpm)object0;
        dxpm0.b = this.f;
        fhwk fhwk0 = this.g.i();
        Preconditions.e(fhwk0);
        dxpm0.c = fhwk0;
    }
}

