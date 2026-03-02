import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import j..util.Objects;

final class dfym implements dcnp {
    final dcnp a;
    final dfzz b;
    private boolean c;
    private TransferMetadata d;

    public dfym(dfzz dfzz0, dcnp dcnp0) {
        this.a = dcnp0;
        Objects.requireNonNull(dfzz0);
        this.b = dfzz0;
        super();
        this.c = false;
        this.d = new dcnn(1000).a();
    }

    public final void a(ShareTarget shareTarget0, TransferMetadata transferMetadata0) {
        if(bata.b(transferMetadata0, this.d)) {
            cunf cunf0 = dcvz.a.a();
            String s = this.b.ap(shareTarget0);
            cunf0.j("Ignored updating a duplicated transfer status %s for (%s)%s", TransferMetadata.c(transferMetadata0.a), s, shareTarget0.b);
            return;
        }
        if(this.d != null && this.d.a == 0x3FD) {
            int v = transferMetadata0.a;
            if(v != 1006 && v != 1009 && v != 0x3FA) {
                dcvz.a.b().h("Ignoring transfer status %s because we\'re waiting for the cancellation to complete.", TransferMetadata.c(v));
                return;
            }
        }
        else if(this.c) {
            dcvz.a.b().h("Ignoring transfer status %s because we\'ve already reported a final status.", TransferMetadata.c(transferMetadata0.a));
            return;
        }
        this.d = transferMetadata0;
        this.c = transferMetadata0.e;
        dcvz.a.b().k("onTransferUpdate> status=%s, isFinal=%s, progress=%s, token=%s", TransferMetadata.c(this.d.a), Boolean.valueOf(this.c), Float.valueOf(transferMetadata0.b), transferMetadata0.c);
        dfzz dfzz0 = this.b;
        dfzz0.bh(shareTarget0, transferMetadata0);
        if(shareTarget0.q() && this.c && transferMetadata0.a != 1006) {
            dfzz0.aH(shareTarget0);
        }
        this.a.e(shareTarget0, transferMetadata0);
    }

    @Override  // dcnp
    public final void e(ShareTarget shareTarget0, TransferMetadata transferMetadata0) {
        synchronized(this) {
            if(transferMetadata0.e) {
                dfyl dfyl0 = new dfyl(this, shareTarget0, transferMetadata0);
                this.b.aU(dfyl0);
                return;
            }
            this.a(shareTarget0, transferMetadata0);
        }
    }
}

