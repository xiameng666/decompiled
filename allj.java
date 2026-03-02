import android.content.Context;
import android.content.Intent;
import com.google.android.gms.auth.proximity.phonehub.UpdateLocalFeatureStateIntentOperation;

public final class allj implements allp {
    public final allq a;

    public allj(allq allq0) {
        this.a = allq0;
    }

    @Override  // allp
    public final void a(String s, boolean z) {
        alkl alkl0 = this.a.ak;
        Context context0 = alkl0.d;
        Intent intent0 = UpdateLocalFeatureStateIntentOperation.c(context0, s, z);
        if(intent0 != null) {
            context0.startService(intent0);
            alkl0.f.Q(z);
        }
    }
}

