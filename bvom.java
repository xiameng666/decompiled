import com.google.android.gms.growth.featuredrops.googlesettings.features.cards.FeatureDropsContextualCardIntentOperation;
import dagger.android.AndroidInjector;
import dagger.internal.InstanceFactory;
import dagger.internal.Provider;

final class bvom implements AndroidInjector {
    final Provider a;
    final Provider b;
    final bvoa c;
    final Provider d;
    private final bvok e;

    public bvom(bvok bvok0) {
        this.e = bvok0;
        bvpm bvpm0 = new bvpm(bvok0.ac);
        this.a = bvpm0;
        bvnv bvnv0 = new bvnv(bvok0.e, bvpm0, bvok0.h, bvok0.ah, bvok0.ar);
        this.b = bvnv0;
        bvoa bvoa0 = new bvoa(bvnv0);
        this.c = bvoa0;
        this.d = InstanceFactory.a(new bvob(bvoa0));
    }

    @Override  // dagger.android.AndroidInjector
    public final void inject(Object object0) {
        ((FeatureDropsContextualCardIntentOperation)object0).b = (bvob)((InstanceFactory)this.d).a;
    }
}

