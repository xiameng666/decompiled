import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasAndroidInjector;

public final class bvoc implements HasAndroidInjector {
    private static bvoc a;
    private final bvok b;

    private bvoc() {
        this.b = new bvok();
    }

    public static bvoc a() {
        synchronized(bvoc.class) {
            if(bvoc.a == null) {
                bvoc.a = new bvoc();
            }
        }
        return bvoc.a;
    }

    @Override  // dagger.android.HasAndroidInjector
    public final AndroidInjector androidInjector() {
        ggeo ggeo0 = ggeo.n("com.google.android.gms.growth.featuredrops.activity.FeatureDropsChimeraActivity", this.b.b, "com.google.android.gms.growth.featuredrops.activity.FeatureDropsProofingChimeraActivity", this.b.c, "com.google.android.gms.growth.featuredrops.googlesettings.features.cards.FeatureDropsContextualCardIntentOperation", this.b.d);
        return new DispatchingAndroidInjector(ggnf.a, ggeo0);
    }
}

