import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.util.Log;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.SendParams;

public final class ddrm implements azys {
    public final ddsc a;
    public final Intent b;
    public final ShareTarget c;
    public final boolean d;

    public ddrm(ddsc ddsc0, Intent intent0, ShareTarget shareTarget0, boolean z) {
        this.a = ddsc0;
        this.b = intent0;
        this.c = shareTarget0;
        this.d = z;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        Context context0 = this.a.v;
        Intent intent0 = this.b;
        gged_interceptors gged0 = ddnb.a(context0, intent0);
        int v = gged0.size();
        for(int v1 = 0; v1 < v; ++v1) {
            Uri uri0 = (Uri)gged0.get(v1);
            if(uri0 != null) {
                try {
                    context0.grantUriPermission("com.google.android.gms", uri0, 1);
                }
                catch(SecurityException securityException0) {
                    Log.w("NearbySharing", "InternalSharingClient: Failed to grant read permission:" + securityException0.getMessage());
                }
            }
        }
        ddot ddot0 = (ddot)((ddub)object0).H();
        SendParams sendParams0 = new SendParams();
        sendParams0.a = this.c;
        sendParams0.b = intent0;
        sendParams0.c = new ddrt(((evqp)object1));
        sendParams0.d = this.d;
        ddot0.Q(sendParams0);
    }
}

