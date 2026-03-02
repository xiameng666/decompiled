import android.content.Intent;
import com.google.android.gms.auth.proximity.multidevice.SetFeatureEnabledIntentOperation;

public final class allf implements allp {
    public final alkl a;

    public allf(alkl alkl0) {
        this.a = alkl0;
    }

    @Override  // allp
    public final void a(String s, boolean z) {
        Intent intent0 = SetFeatureEnabledIntentOperation.a(this.a.d, s, gqus.l, z);
        this.a.d.startService(intent0);
    }
}

