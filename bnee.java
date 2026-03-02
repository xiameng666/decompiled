import android.os.Looper;
import android.os.Message;
import com.google.android.gms.fido.u2f.api.view.NfcViewOptions;
import java.lang.ref.WeakReference;

final class bnee extends clht {
    private final WeakReference a;

    public bnee(bnef bnef0) {
        super(Looper.getMainLooper());
        this.a = new WeakReference(bnef0);
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        bnef bnef0 = (bnef)this.a.get();
        if(bnef0 != null) {
            bnef0.h.b(bndy.c, ((NfcViewOptions)message0.obj));
        }
    }
}

