import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import java.nio.charset.StandardCharsets;

public final class dpvx {
    public static String a(String s) {
        return ghfs.a.c(s, StandardCharsets.UTF_8).toString();
    }

    public static void b(Context context0, String s) {
        clkn clkn0 = new clkn();
        clkn0.j = "com.google.android.gms.pay.gcmtask.PayGcmTaskService";
        clkn0.t("passnotification.reschedule.oneoff");
        clkn0.e(0L, 1L);
        clkn0.g(2);
        clkn0.v(1);
        if(!TextUtils.isEmpty(s)) {
            Bundle bundle0 = new Bundle();
            bundle0.putString("previous_account_id_hash", s);
            clkn0.u = bundle0;
        }
        cljp.a(context0).f(clkn0.a());
    }
}

