import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

public final class azvn extends clht {
    public azvn() {
        super(Looper.getMainLooper());
    }

    public azvn(Looper looper0) {
        super(looper0);
    }

    public final void b(azuk azuk0, azuj azuj0) {
        this.sendMessage(this.obtainMessage(1, new Pair(BasePendingResult.j(azuk0), azuj0)));
    }

    @Override  // android.os.Handler
    public final void handleMessage(Message message0) {
        switch(message0.what) {
            case 1: {
                Pair pair0 = (Pair)message0.obj;
                azuk azuk0 = (azuk)pair0.first;
                azuj azuj0 = (azuj)pair0.second;
                try {
                    azuk0.a(azuj0);
                    return;
                }
                catch(RuntimeException runtimeException0) {
                    BasePendingResult.m(azuj0);
                    throw runtimeException0;
                }
            }
            case 2: {
                ((BasePendingResult)message0.obj).k(Status.e);
                return;
            }
            default: {
                Log.wtf("BasePendingResult", a.aG(message0, "Don\'t know how to handle message: "), new Exception());
            }
        }
    }
}

