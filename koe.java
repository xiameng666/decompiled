import android.content.Intent;
import android.os.CancellationSignal;
import android.util.Log;
import java.util.concurrent.Executor;

public final class koe {
    public static final void a(int v, int v1, Intent intent0, Executor executor0, kjk kjk0, CancellationSignal cancellationSignal0) {
        ibuq.f(executor0, "executor");
        ibuq.f(kjk0, "callback");
        int v2 = kno.c;
        if(v != v2) {
            Log.w("GetCredentialController", a.z(v, v2, "Returned request code ", " which  does not match what was given "));
            return;
        }
        if(knt.c(v1, new kny(), new knz(executor0, kjk0), cancellationSignal0)) {
            return;
        }
        if(intent0 == null) {
            knt.a(cancellationSignal0, new koa(executor0, kjk0));
            return;
        }
        kkb kkb0 = kwr.d(intent0);
        if(kkb0 != null) {
            knt.a(cancellationSignal0, new kob(executor0, kjk0, kkb0));
            return;
        }
        knt.a(cancellationSignal0, new koc(executor0, kjk0, kwr.c(intent0)));
    }
}

