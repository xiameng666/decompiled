import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;

final class dmea implements AndroidInjector {
    private final domv a;
    private final doly b;
    private final dolg c;
    private final domw d;

    public dmea(dolg dolg0, doly doly0, domw domw0, domv domv0) {
        this.a = domv0;
        this.b = doly0;
        this.c = dolg0;
        this.d = domw0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dmdz dmdz0 = (dmdz)object0;
        fhwk fhwk0 = this.a.i();
        Preconditions.e(fhwk0);
        dmdz0.c = fhwk0;
        dmdz0.d = new dqhh(this.b.c());
        this.a.a();
        dmdz0.ag = new dmdt(new dmgi(this.c.d(), dmgy.a()));
        dmdz0.ah = new dmet(this.a.a(), this.c.a(), this.c.c(), new bblp(1, 10));
    }
}

