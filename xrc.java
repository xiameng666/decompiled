import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.chimera.modules.contextmanager.AppContextProvider;
import java.util.concurrent.TimeUnit;

public final class xrc {
    public static void a(PendingIntent pendingIntent0, Intent intent0, String s) {
        boolean z = hrgt.a.w().at();
        xrb xrb0 = new xrb(z);
        if(z) {
            xrn xrn0 = xrb0.b;
            xsl xsl0 = xxe.u();
            yft yft0 = xxe.aa();
            if(yft0 != null) {
                yft0.f(xrn0);
            }
            xrn0.f();
            xsl0.c.b(yft0, xrn0);
        }
        String s1 = pendingIntent0.getCreatorPackage();
        Context context0 = xxe.e();
        if(context0 == null) {
            context0 = AppContextProvider.a();
        }
        bbpg.d(pendingIntent0, context0, intent0, xrb0, 0, s, true);
        if(!z) {
            try {
                if(!xrb0.a.await(5000L, TimeUnit.MILLISECONDS)) {
                    ((ggtj)((ggtj)xth.a.j()).ar(38)).X("[PendingIntentCompat] Timed out delivering to pendingIntent=%s, package=%s, permission=%s", pendingIntent0, s1, s);
                }
                return;
            }
            catch(InterruptedException unused_ex) {
                goto label_19;
            }
        }
        return;
    label_19:
        ((ggtj)((ggtj)xth.a.j()).ar(39)).X("[PendingIntentCompat] Interrupted while delivering pendingIntent=%s, package=%s, permission=%s", pendingIntent0, s1, s);
    }
}

