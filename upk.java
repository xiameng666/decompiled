import android.os.Handler.Callback;
import android.os.Message;

final class upk implements Handler.Callback {
    @Override  // android.os.Handler$Callback
    public final boolean handleMessage(Message message0) {
        if(message0.what == 1) {
            ((upl)message0.obj).a.k(((upl)message0.obj));
            return true;
        }
        return false;
    }
}

