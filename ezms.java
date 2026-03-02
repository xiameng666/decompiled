import android.app.Activity;
import android.content.Context;
import com.google.android.gms.udc.UdcCacheRequest;

public final class ezms extends azts {
    public final ezpw a;

    public ezms(Activity activity0, ezmm ezmm0) {
        super(activity0, activity0, ezmn.a, ezmm0, aztr_settings.a);
        this.a = new ezpw();
    }

    public ezms(Context context0, ezmm ezmm0) {
        super(context0, ezmn.a, ezmm0, aztr_settings.a);
        this.a = new ezpw();
    }

    @Deprecated
    public final evql e(UdcCacheRequest udcCacheRequest0) {
        ezps ezps0 = new ezps(this.a, this.D, udcCacheRequest0);
        this.D.c(ezps0);
        return batf.b(ezps0, new ezmr(this));
    }
}

