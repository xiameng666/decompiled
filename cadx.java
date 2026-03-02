import android.security.intrusiondetection.IntrusionDetectionManager.CommandCallback;
import com.google.android.gms.intrusiondetection.service.CollectionControlIntentOperation;

public final class cadx implements IntrusionDetectionManager.CommandCallback {
    public final void onFailure(int v) {
        ((ggtj)CollectionControlIntentOperation.a.j()).z("Fail to enable IntrusionDetection, error:%d", v);
    }

    public final void onSuccess() {
        ((ggtj)CollectionControlIntentOperation.a.j()).x("Succeed in enabling IntrusionDetection");
    }
}

