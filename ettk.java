import android.content.Context;
import com.google.android.gms.tapandpay.secureelement.SecureElementRegistrationTaskOperation;

public final class ettk {
    public static final void a(Context context0) {
        ibuq.f(context0, "context");
        if(!hyuo.g()) {
            ((ggtj)SecureElementRegistrationTaskOperation.a.h()).x("SE registration is not enabled");
            return;
        }
        cljp cljp0 = cljp.a(context0);
        clkn clkn0 = new clkn();
        clkn0.j = "com.google.android.gms.tapandpay.gcmtask.TapAndPayGcmTaskService";
        clkn0.q("secureelement.registration");
        clkn0.y(0, 0);
        clkn0.e(0L, 1L);
        clkn0.v(1);
        cljp0.f(clkn0.a());
    }
}

