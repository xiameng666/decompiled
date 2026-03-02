import com.google.android.gms.growth.featuredrops.activity.FeatureDropsChimeraActivity;

public final class bvne implements Runnable {
    public final FeatureDropsChimeraActivity a;

    public bvne(FeatureDropsChimeraActivity featureDropsChimeraActivity0) {
        this.a = featureDropsChimeraActivity0;
    }

    @Override
    public final void run() {
        bwdn bwdn0;
        Object object0;
        FeatureDropsChimeraActivity featureDropsChimeraActivity0 = this.a;
        bvnu bvnu0 = featureDropsChimeraActivity0.k;
        String s = featureDropsChimeraActivity0.m();
        String s1 = featureDropsChimeraActivity0.n();
        String s2 = featureDropsChimeraActivity0.o();
        Integer integer0 = (int)featureDropsChimeraActivity0.y;
        ibuq.f(s, "accountName");
        bvnp bvnp0 = new bvnp(bvnu0, s, s2, s1, integer0);
        try {
            object0 = bvnp0.a();
            goto label_19;
        }
        catch(iapl iapl0) {
            bwdn0 = new bwdn(bwci.b(iapl0));
        }
        catch(acse acse0) {
            bwdn0 = new bwdn(bwci.b(acse0));
        }
        catch(IllegalArgumentException illegalArgumentException0) {
            bwdn0 = new bwdn(bwci.b(illegalArgumentException0));
        }
        object0 = bwdn0;
    label_19:
        featureDropsChimeraActivity0.runOnUiThread(new bvnf(featureDropsChimeraActivity0, ((bwdr)object0)));
    }
}

