import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;

final class dlqn implements AndroidInjector {
    private final domv a;
    private final dolg b;
    private final doly c;

    public dlqn(dolg dolg0, doly doly0, domv domv0) {
        this.a = domv0;
        this.b = dolg0;
        this.c = doly0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dlrl dlrl0 = (dlrl)object0;
        this.a.a();
        dlrl0.a = new dmgi(this.b.d(), dmgy.a());
        dlrl0.b = this.c.c();
        dlrl0.c = efmh.b(this.c.c());
        fhwk fhwk0 = this.a.i();
        Preconditions.e(fhwk0);
        dlrl0.d = fhwk0;
        dlrl0.ag = this.a.j();
        dlrl0.ah = this.a.g();
        dlrl0.ai = new fuok();
    }
}

