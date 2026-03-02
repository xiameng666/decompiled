import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Provider;

final class ebqj implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    private final domv d;

    public ebqj(domv domv0) {
        this.d = domv0;
        ebqi ebqi0 = new ebqi(domv0);
        this.a = ebqi0;
        cjkz cjkz0 = new cjkz(ebqi0);
        this.b = cjkz0;
        this.c = new cjlw(ebqi0, cjkz0);
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebyw ebyw0 = (ebyw)object0;
        ebyw0.a = this.d.a();
        ebyw0.b = dmgy.a();
        ebyw0.c = new ebwn(this.d.a(), new edse(this.d.a()), DoubleCheck.a(this.c));
        ebyw0.d = new ebst(this.d.h());
    }
}

