import android.content.Intent;
import android.os.Message;
import com.google.android.location.reporting.service.DispatchingChimeraService;

public final class fxsq implements Runnable {
    public final DispatchingChimeraService a;
    public final int b;
    public final Intent c;

    public fxsq(DispatchingChimeraService dispatchingChimeraService0, int v, Intent intent0) {
        this.a = dispatchingChimeraService0;
        this.b = v;
        this.c = intent0;
    }

    @Override
    public final void run() {
        DispatchingChimeraService dispatchingChimeraService0 = this.a;
        int v = this.b;
        fxtk fxtk0 = dispatchingChimeraService0.b;
        if(fxtk0 == null) {
            dispatchingChimeraService0.stopSelf(v);
            return;
        }
        Intent intent0 = this.c;
        String s = intent0.getAction();
        if("com.google.android.location.reporting.UPLOAD".equals(s)) {
            hrsa hrsa0 = hrsa.a;
            if(hrsa0.g().A()) {
                fxtc fxtc0 = new fxtc(fxtk0, intent0, v);
                clhe clhe0 = clhe.a(hrsa0.g().c());
                int v1 = clhd.a(hrsa0.g().d());
                clhh.a.b("Reporting", fxtc0, clhe0, v1);
                return;
            }
            fxtj fxtj0 = fxtk0.c();
            Message message0 = fxtj0.obtainMessage(1, intent0);
            message0.arg1 = v;
            fxtj0.sendMessage(message0);
            return;
        }
        fxtj fxtj1 = "com.google.android.location.reporting.ACTION_INSISTENT_SYNC".equals(s) ? fxtk0.c() : fxtk0.h;
        Message message1 = fxtj1.obtainMessage(1, intent0);
        message1.arg1 = v;
        fxtj1.sendMessage(message1);
    }
}

