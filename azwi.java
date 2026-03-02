import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.lang.ref.WeakReference;
import java.util.concurrent.locks.Lock;

final class azwi implements baqj {
    public final boolean a;
    private final WeakReference b;
    private final azta_api c;

    public azwi(azwr azwr0, azta_api azta0, boolean z) {
        this.b = new WeakReference(azwr0);
        this.c = azta0;
        this.a = z;
    }

    @Override  // baqj
    public final void a(ConnectionResult connectionResult0) {
        azwr azwr0 = (azwr)this.b.get();
        if(azwr0 == null) {
            return;
        }
        batl.m(Looper.myLooper() == azwr0.a.l.f, "onReportServiceBinding must be called on the GoogleApiClient handler thread");
        Lock lock0 = azwr0.b;
        lock0.lock();
        try {
            if(azwr0.m(0)) {
                if(!connectionResult0.d()) {
                    azwr0.k(connectionResult0, this.c, this.a);
                }
                if(azwr0.n()) {
                    azwr0.l();
                }
                goto label_15;
            }
            goto label_17;
        }
        catch(Throwable throwable0) {
            azwr0.b.unlock();
            throw throwable0;
        }
    label_15:
        azwr0.b.unlock();
        return;
    label_17:
        lock0.unlock();
    }
}

