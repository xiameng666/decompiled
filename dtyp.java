import android.content.Context;
import android.os.Bundle;

public final class dtyp {
    public static final int a;

    static {
        bboh.b("Pay", bbcu.cZ);
    }

    public static final void a(Context context0, String s, long v, long v1) {
        ibuq.f(context0, "context");
        gftb.g(Long.compare(v, 0L) >= 0, "Invalid start delay", new Object[0]);
        gftb.g(v1 > 0L, "Invalid delay window", new Object[0]);
        clkn clkn0 = new clkn();
        clkn0.j = "com.google.android.gms.pay.gcmtask.PayGcmTaskService";
        clkn0.t("mdoc.devicelockremoval.handle");
        clkn0.v(1);
        clkn0.e(v, v1 + v);
        clkn0.p = true;
        Bundle bundle0 = new Bundle();
        if(s == null) {
            s = "";
        }
        bundle0.putString("extra_account_name", s);
        clkn0.u = bundle0;
        clko clko0 = clkn0.a();
        cljp.a(context0).f(clko0);
    }
}

