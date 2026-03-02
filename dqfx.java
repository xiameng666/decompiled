import android.content.Context;
import android.os.Bundle;

public final class dqfx {
    public static final void a(Context context0, String s) {
        ibuq.f(s, "accountName");
        Bundle bundle0 = new Bundle();
        bundle0.putString("wallet.privacypolicyack.accountname", s);
        clkn clkn0 = new clkn();
        clkn0.j = "com.google.android.gms.pay.gcmtask.PayGcmTaskService";
        clkn0.q("wallet.privacypolicyack");
        clkn0.g(0);
        clkn0.e(0L, 1L);
        clkn0.v(1);
        clkn0.p = true;
        clkn0.u = bundle0;
        clko clko0 = clkn0.a();
        cljp.a(context0).f(clko0);
    }
}

