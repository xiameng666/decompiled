import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;

public final class dfxw implements Runnable {
    public final dfzz a;
    public final ShareTarget b;
    public final dcnp c;

    public dfxw(dfzz dfzz0, ShareTarget shareTarget0, dcnp dcnp0) {
        this.a = dfzz0;
        this.b = shareTarget0;
        this.c = dcnp0;
    }

    @Override
    public final void run() {
        dfzz dfzz0 = this.a;
        ShareTarget shareTarget0 = this.b;
        if(shareTarget0.f || dfzz0.ae(shareTarget0).A == null) {
            TransferMetadata transferMetadata0 = dfzz0.bD(shareTarget0) ? new dcnn(1010).a() : new dcnn(1004).a();
            this.c.e(shareTarget0, transferMetadata0);
        }
        dfzz0.bm(shareTarget0);
    }
}

