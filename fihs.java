import com.google.android.libraries.messaging.lighter.model.MessageReceivedNotification;
import com.google.android.libraries.messaging.lighter.model.Renotification;

public final class fihs implements gftc {
    @Override  // gftc
    public final boolean a(Object object0) {
        gged_interceptors gged0 = ((Renotification)object0).d();
        int v = gged0.size();
        int v1 = 0;
        while(v1 < v) {
            int v2 = ((MessageReceivedNotification)gged0.get(v1)).a();
            ++v1;
            if(v2 == 0 || v2 == 2) {
                return false;
            }
        }
        return true;
    }
}

