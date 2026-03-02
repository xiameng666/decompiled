import dagger.android.AndroidInjector;
import dagger.internal.DoubleCheck;
import dagger.internal.Provider;

final class ebql implements AndroidInjector {
    final Provider a;
    final Provider b;
    final Provider c;
    private final domv d;

    public ebql(domv domv0) {
        this.d = domv0;
        ebqk ebqk0 = new ebqk(domv0);
        this.a = ebqk0;
        cjkz cjkz0 = new cjkz(ebqk0);
        this.b = cjkz0;
        this.c = new cjlw(ebqk0, cjkz0);
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebyx ebyx0 = (ebyx)object0;
        ebyx0.b = this.d.a();
        ebyx0.c = dmgy.a();
        ebyx0.d = new ebwn(this.d.a(), new edse(this.d.a()), DoubleCheck.a(this.c));
        ebyx0.e = new ebst(this.d.h());
    }
}

