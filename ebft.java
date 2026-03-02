import dagger.android.AndroidInjector;

final class ebft implements AndroidInjector {
    private final dola a;

    public ebft(dola dola0) {
        this.a = dola0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ebfp ebfp0 = (ebfp)object0;
        ebfp0.b = new dtsg(dlnj.a(), dole.b(this.a), dmgy.a());
        ebfp0.c = new bawz(dlnj.a());
        dlnj.a();
        ebfp0.d = new dtph(new dmgi(dolf.b(this.a), dmgy.a()), edob.a(dlnj.a()), new dtpi());
        ebfp0.e = easn.a();
    }
}

