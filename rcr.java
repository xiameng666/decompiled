import android.content.Context;

final class rcr {
    private boolean a;
    private yhm b;

    public rcr(Context context0) {
        try {
            yho.b(context0);
            this.b = yho.a().c().a("PLAY_BILLING_LIBRARY", new yhi("proto"), new rcq());
        }
        catch(Throwable unused_ex) {
            this.a = true;
        }
    }

    public final void a(hgyo hgyo0) {
        if(this.a) {
            rdk.h("BillingLogger", "Skipping logging since initialization failed.");
            return;
        }
        try {
            this.b.a(new yhj(hgyo0, 1));
        }
        catch(Throwable unused_ex) {
            rdk.h("BillingLogger", "logging failed.");
        }
    }
}

