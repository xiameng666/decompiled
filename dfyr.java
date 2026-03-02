import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import j..util.Objects;

final class dfyr implements dfvk {
    final dcnp a;
    final ShareTarget b;
    final dfzz c;

    public dfyr(dfzz dfzz0, dcnp dcnp0, ShareTarget shareTarget0) {
        this.a = dcnp0;
        this.b = shareTarget0;
        Objects.requireNonNull(dfzz0);
        this.c = dfzz0;
        super();
    }

    @Override  // dfvk
    public final void a() {
    }

    @Override  // dfvk
    public final void b(int v, int v1, int v2, int v3, int v4, int v5, int v6, int v7) {
        dcnp dcnp0 = this.a;
        if(hvqz.ag() && v3 == 2) {
            TransferMetadata transferMetadata0 = new dcnn(0x3FF).a();
            dcnp0.e(this.b, transferMetadata0);
        }
        else {
            ShareTarget shareTarget0 = this.b;
            dcnn dcnn0 = new dcnn(0x3FE);
            dcnn0.l = v;
            dcnn0.m = v1;
            dcnn0.n = v4;
            dcnn0.o = v5;
            dcnn0.p = v6;
            dcnp0.e(shareTarget0, dcnn0.a());
            if(hvqz.ag()) {
                this.c.bb(shareTarget0, v1);
            }
        }
        this.c.aB(this.b, v1);
    }
}

