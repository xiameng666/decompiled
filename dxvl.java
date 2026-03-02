import dagger.android.AndroidInjector;
import dagger.internal.Preconditions;

final class dxvl implements AndroidInjector {
    private final domv a;

    public dxvl(domv domv0) {
        this.a = domv0;
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        dxwe dxwe0 = (dxwe)object0;
        fhwk fhwk0 = this.a.i();
        Preconditions.e(fhwk0);
        dxwe0.ag = fhwk0;
        dolu dolu0 = (dolu)this.a;
        fhup fhup0 = (fhup)dolu0.L.get();
        gmcg gmcg0 = (gmcg)dolu0.c.get();
        new ggoh(fhwr.a(gfqx.a));
        fibp fibp0 = new fibp();
        fhua fhua0 = (fhua)dolu0.z.get();
        dxwe0.ah = new ficz(fhup0, new fick(), ggnj.a, fibp0, fhua0);
        dxwe0.ai = this.a.g();
    }
}

