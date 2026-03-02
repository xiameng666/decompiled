import android.content.Context;
import android.os.Bundle;

public final class esyv {
    public static void a(Context context0, int v, boolean z) {
        int v3;
        if(!esgb.b()) {
            return;
        }
        Bundle bundle0 = new Bundle();
        bundle0.putBoolean("register_if_changed_only", z);
        bundle0.putInt("registration_reason", v - 1);
        long v1 = hyqk.a.c().b();
        long v2 = hyqk.a.c().a();
        if(v != 5 && v != 6) {
            v3 = 1;
        }
        else {
            v1 = 0L;
            v2 = 1L;
            v3 = 0;
        }
        clkn clkn0 = new clkn();
        clkn0.j = "com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskService";
        clkn0.q("hce.dynamic_aid_registration.oneoff");
        clkn0.y(2, 2);
        clkn0.e(v1, v2);
        clkn0.v(v3);
        clkn0.p = false;
        clkn0.u = bundle0;
        clko clko0 = clkn0.a();
        cljp.a(context0).f(clko0);
    }

    public static void b(Context context0, int v) {
        esyv.a(context0, v, true);
    }
}

