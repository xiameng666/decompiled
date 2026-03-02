import com.google.android.gms.growth.featuredrops.activity.FeatureDropsProofingChimeraActivity;

public final class bvng implements Runnable {
    public final int a;
    public final FeatureDropsProofingChimeraActivity b;

    public bvng(int v, FeatureDropsProofingChimeraActivity featureDropsProofingChimeraActivity0) {
        this.a = v;
        this.b = featureDropsProofingChimeraActivity0;
    }

    @Override
    public final void run() {
        FeatureDropsProofingChimeraActivity featureDropsProofingChimeraActivity0 = this.b;
        if(this.a != 0) {
            featureDropsProofingChimeraActivity0.G(bwcj.a);
            return;
        }
        featureDropsProofingChimeraActivity0.q(null);
    }
}

