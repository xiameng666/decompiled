import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.chimera.modules.tapandpay.AppContextProvider;

public final class esyg implements Runnable {
    public final esyh a;

    public esyg(esyh esyh0) {
        this.a = esyh0;
    }

    @Override
    public final void run() {
        esyh esyh0 = this.a;
        if(esyh0.a == 0) {
            return;
        }
        Context context0 = AppContextProvider.a();
        long v = SystemClock.elapsedRealtime();
        esyh0.c.d(context0, 0, v);
        esyh0.a = 0;
        esyh0.b = null;
    }
}

