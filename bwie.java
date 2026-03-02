import com.google.android.chimera.config.ModuleManager.FeatureRequestListener;

public final class bwie extends ModuleManager.FeatureRequestListener {
    final String a;

    public bwie(String s) {
        this.a = s;
        super();
    }

    @Override  // com.google.android.chimera.config.ModuleManager$FeatureRequestProgressListener
    public final void onRequestComplete(int v) {
        this.detach();
        switch(v) {
            case 0: {
                ((ggtj)bwif.a.h()).B("%s module UN-request returned FEATURE_REQUEST_RESULT_SUCCESS", this.a);
                return;
            }
            case 1: {
                ((ggtj)bwif.a.j()).B("%s module UN-request returned FEATURE_REQUEST_RESULT_FAILURE", this.a);
                return;
            }
            case 2: {
                ((ggtj)bwif.a.j()).B("%s module UN-request returned FEATURE_REQUEST_RESULT_FAILURE_NO_RETRY", this.a);
                return;
            }
            default: {
                ((ggtj)bwif.a.j()).P("%s module UN-request returned unknown code %d", this.a, v);
            }
        }
    }
}

