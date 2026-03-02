import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;

final class dwce implements AndroidInjector {
    private final domv a;
    private final dolg b;
    private final dxed c;

    public dwce(dolg dolg0, dxed dxed0, domv domv0) {
        this.a = domv0;
        this.b = dolg0;
        this.c = dxed0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dwby dwby0 = (dwby)object0;
        dwby0.a = this.a.a();
        dwby0.b = this.b.c();
        dwby0.c = this.b.a();
        dwby0.d = dmgy.a();
        dwby0.ag = this.a.g();
        fhwk fhwk0 = this.a.i();
        Preconditions.e(fhwk0);
        dwby0.ah = fhwk0;
        dwby0.ai = new dvfy();
        dwby0.aj = new edse(this.a.a());
        dwby0.ar = this.c.a();
        dwby0.ak = new fuok();
        dwby0.al = this.a.j();
    }
}

