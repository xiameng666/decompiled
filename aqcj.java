import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.autofill.fill.IFillForm;

public final class aqcj {
    public static gfsx a(Context context0, IFillForm iFillForm0) {
        gged_interceptors gged0 = iFillForm0.i(ando.E);
        if(!gged0.isEmpty()) {
            Intent intent0 = aphp.x(context0, iFillForm0);
            PendingIntent pendingIntent0 = intent0 == null ? null : aphp.C(context0, intent0);
            if(pendingIntent0 != null) {
                return gfsx.m(new aqci(gged0, pendingIntent0));
            }
        }
        return gfqx.a;
    }
}

