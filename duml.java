import dagger.android.AndroidInjector;
import dagger.internal.Provider;

final class duml implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    final Provider d;
    final Provider e;
    final Provider f;
    final Provider g;
    private final domv h;

    public duml(dolg dolg0, dxed dxed0, dpsz dpsz0, domv domv0) {
        this.h = domv0;
        dumh dumh0 = new dumh(dolg0);
        this.a = dumh0;
        dumk dumk0 = new dumk(dxed0);
        this.b = dumk0;
        dumj dumj0 = new dumj(dpsz0);
        this.c = dumj0;
        dumi dumi0 = new dumi(domv0);
        this.d = dumi0;
        edsf edsf0 = new edsf(dumi0);
        this.e = edsf0;
        dtzf dtzf0 = new dtzf(dumi0, dumk0);
        this.f = dtzf0;
        this.g = new duoh(dumh0, dumk0, dumj0, edsf0, dtzf0);
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        duoa duoa0 = (duoa)object0;
        duoa0.b = this.g;
        duoa0.c = new edse(this.h.a());
        duoa0.d = this.h.j();
        duoa0.ag = this.h.g();
    }
}

