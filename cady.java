import android.security.intrusiondetection.IntrusionDetectionManager.CommandCallback;
import com.google.android.gms.intrusiondetection.service.CollectionControlIntentOperation;

public final class cady implements IntrusionDetectionManager.CommandCallback {
    public final void onFailure(int v) {
        ((ggtj)CollectionControlIntentOperation.a.j()).z("Fail to disable IntrusionDetection, error:%d", v);
    }

    public final void onSuccess() {
        ((ggtj)CollectionControlIntentOperation.a.j()).x("Succeed in disabling IntrusionDetection");
    }
}

