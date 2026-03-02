import android.content.Context;
import android.os.Bundle;

public final class ebzq {
    public static final void a(Context context0, dzbc dzbc0, gurm gurm0, String s) {
        ibuq.f(dzbc0, "screen");
        ibuq.f(gurm0, "origin");
        Bundle bundle0 = new Bundle();
        bundle0.putInt("KEY_TRANSFER_EMONEY_CARDS_SCREEN", dzbc0.a());
        bundle0.putInt("KEY_ORIGIN", gurm0.a());
        if(s != null) {
            bundle0.putString("KEY_DEFAULT_TRANSIT_CARD_CID", s);
        }
        clkn clkn0 = new clkn();
        clkn0.j = "com.google.android.gms.pay.gcmtask.PayGcmTaskService";
        clkn0.q("felica.emoney.transfer.cards");
        clkn0.u = bundle0;
        clkn0.g(2);
        clkn0.e(0L, 1L);
        clkn0.v(2);
        clko clko0 = clkn0.a();
        cljp.a(context0).f(clko0);
    }
}

