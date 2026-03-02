import android.content.Context;
import android.os.Bundle;

public final class ebwx {
    public static void a(Context context0, long v, boolean z, boolean z1, int v1) {
        ibuq.f(context0, "context");
        Bundle bundle0 = new Bundle();
        int v2 = 0;
        bundle0.putBoolean("KEY_READINESS_CHECK_DONE", ((boolean)(((int)z) & ((v1 & 4) == 0 ? 1 : 0))));
        if((v1 & 8) == 0) {
            v2 = 1;
        }
        bundle0.putBoolean("KEY_PACKAGES_ADDED", ((boolean)(v2 & ((int)z1))));
        clkn clkn0 = new clkn();
        clkn0.j = "com.google.android.gms.pay.gcmtask.PayGcmTaskService";
        clkn0.q("felica.emoney.pending.se.provisioning");
        clkn0.u = bundle0;
        clkn0.g(2);
        if((v1 & 2) != 0) {
            v = 0L;
        }
        clkn0.e(v, 1L + v);
        clkn0.v(2);
        clko clko0 = clkn0.a();
        cljp.a(context0).f(clko0);
    }
}

