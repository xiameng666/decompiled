import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;

public final class dfze implements Runnable {
    public final dfzf a;
    public final long b;
    public final dcnp c;
    public final ShareTarget d;
    public final dfum e;

    public dfze(dfzf dfzf0, long v, dcnp dcnp0, ShareTarget shareTarget0, dfum dfum0) {
        this.a = dfzf0;
        this.b = v;
        this.c = dcnp0;
        this.d = shareTarget0;
        this.e = dfum0;
    }

    @Override
    public final void run() {
        cunf cunf0 = dcvz.a.b();
        dfzf dfzf0 = this.a;
        cunf0.i("%s alarm timed out after %d ms. Closing connection.", dfzf0.a, Long.valueOf(this.b));
        TransferMetadata transferMetadata0 = new dcnn(1010).a();
        ShareTarget shareTarget0 = this.d;
        this.c.e(shareTarget0, transferMetadata0);
        if(shareTarget0.f) {
            dfzf0.b.az(shareTarget0, 1010);
            return;
        }
        dfzf0.b.Y.set(true);
        this.e.a();
    }
}

