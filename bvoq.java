import android.content.Context;
import com.google.android.gms.growth.featuredrops.activity.FeatureDropsProofingChimeraActivity;
import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.internal.Factory;
import dagger.internal.InstanceFactory;
import dagger.internal.MapProviderFactory.Builder;
import dagger.internal.MapProviderFactory;
import dagger.internal.Provider;

final class bvoq implements AndroidInjector {
    public final FeatureDropsProofingChimeraActivity a;
    public final bvok b;
    public final bvoq c;
    final Provider d;
    final Provider e;
    final Provider f;
    final Provider g;
    final Provider h;
    final Provider i;

    public bvoq(bvok bvok0, FeatureDropsProofingChimeraActivity featureDropsProofingChimeraActivity0) {
        this.c = this;
        this.b = bvok0;
        this.a = featureDropsProofingChimeraActivity0;
        this.d = new bvoo(this);
        this.e = new bvop(this);
        Factory factory0 = InstanceFactory.a(featureDropsProofingChimeraActivity0);
        this.f = factory0;
        MapProviderFactory.Builder mapProviderFactory$Builder0 = new MapProviderFactory.Builder(2);
        mapProviderFactory$Builder0.c(bvzg.class, bvok0.i);
        mapProviderFactory$Builder0.c(bvze.class, bvok0.k);
        MapProviderFactory mapProviderFactory0 = mapProviderFactory$Builder0.b();
        this.g = mapProviderFactory0;
        bvwe bvwe0 = new bvwe(mapProviderFactory0);
        this.h = bvwe0;
        this.i = new bvwb(factory0, bvwe0);
    }

    final DispatchingAndroidInjector a() {
        ggeo ggeo0 = ggeo.p("com.google.android.gms.growth.featuredrops.activity.FeatureDropsChimeraActivity", this.b.b, "com.google.android.gms.growth.featuredrops.activity.FeatureDropsProofingChimeraActivity", this.b.c, "com.google.android.gms.growth.featuredrops.googlesettings.features.cards.FeatureDropsContextualCardIntentOperation", this.b.d, "bvxb", this.d, "bvzq", this.e);
        return new DispatchingAndroidInjector(ggnf.a, ggeo0);
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        FeatureDropsProofingChimeraActivity featureDropsProofingChimeraActivity0 = (FeatureDropsProofingChimeraActivity)object0;
        featureDropsProofingChimeraActivity0.r = this.a();
        bvwd bvwd0 = new bvwd(ggeo.m(bvzg.class, this.b.i, bvze.class, this.b.k));
        featureDropsProofingChimeraActivity0.B = bvwb.b(this.a, bvwd0);
        featureDropsProofingChimeraActivity0.C = (bvwf)this.b.l.get();
        featureDropsProofingChimeraActivity0.s = (fhwo)this.b.Y.get();
        featureDropsProofingChimeraActivity0.t = this.b.b();
        featureDropsProofingChimeraActivity0.u = (bwdm)this.b.Z.get();
        featureDropsProofingChimeraActivity0.v = (fhwk)this.b.aa.get();
        featureDropsProofingChimeraActivity0.j = gfqx.a;
        featureDropsProofingChimeraActivity0.k = new bvnu(((Context)this.b.e.get()), new bvpl(((bvpn)this.b.ac.get())), ((bvqi)this.b.h.get()), ((bwbs)this.b.ah.get()), this.b.c());
        featureDropsProofingChimeraActivity0.l = (gmcg)this.b.aj.get();
        featureDropsProofingChimeraActivity0.m = this.b.a();
        featureDropsProofingChimeraActivity0.n = this.b.c();
    }
}

