import android.content.Context;
import android.os.Bundle;
import android.os.CancellationSignal;
import java.util.concurrent.Executor;

public class knu extends kno {
    public static final int d;

    public knu(Context context0) {
        ibuq.f(context0, "context");
        super(context0);
    }

    public static final boolean c(int v, ibtw ibtw0, ibts ibts0, CancellationSignal cancellationSignal0) {
        if(v != -1) {
            ibvd ibvd0 = new ibvd();
            ibvd0.a = new kli(knt.b(v));
            if(v == 0) {
                ibvd0.a = new klb("activity is cancelled by the user.");
            }
            ibtw0.a(cancellationSignal0, new knr(ibts0, ibvd0));
            return true;
        }
        return false;
    }

    public static final boolean d(Bundle bundle0, ibtw ibtw0, Executor executor0, kjk kjk0, CancellationSignal cancellationSignal0) {
        ibuq.f(bundle0, "resultData");
        ibuq.f(executor0, "executor");
        ibuq.f(kjk0, "callback");
        if(!bundle0.getBoolean("FAILURE_RESPONSE")) {
            return false;
        }
        knt.a(cancellationSignal0, new knq(executor0, kjk0, ibtw0.a(bundle0.getString("EXCEPTION_TYPE"), bundle0.getString("EXCEPTION_MESSAGE"))));
        return true;
    }
}

