import android.app.Activity;
import android.app.PendingIntent.CanceledException;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender.SendIntentException;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.api.Status;
import java.lang.ref.WeakReference;

public final class etat extends eszx {
    private final WeakReference a;
    private final int b;

    public etat(Activity activity0, int v) {
        this.a = new WeakReference(activity0);
        this.b = v;
    }

    @Override  // eszx
    public final void x(Status status0, Bundle bundle0) {
        Activity activity0 = (Activity)this.a.get();
        if(activity0 != null) {
            if(status0.d()) {
                try {
                    status0.c(activity0, this.b);
                    return;
                }
                catch(IntentSender.SendIntentException intentSender$SendIntentException0) {
                    Log.w("TapAndPayClientImpl", "Exception starting pending intent", intentSender$SendIntentException0);
                }
            }
            Intent intent0 = new Intent();
            PendingIntent pendingIntent0 = activity0.createPendingResult(this.b, intent0, 0x40000000);
            if(pendingIntent0 == null) {
                Log.w("TapAndPayClientImpl", "Null pending result returned for onHandleStatusPendingIntent");
                return;
            }
            try {
                pendingIntent0.send((status0.e() ? -1 : status0.i));
            }
            catch(PendingIntent.CanceledException pendingIntent$CanceledException0) {
                Log.w("TapAndPayClientImpl", "Exception setting pending result", pendingIntent$CanceledException0);
            }
        }
    }
}

