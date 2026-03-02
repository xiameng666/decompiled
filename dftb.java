import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import com.google.android.gms.nearby.sharing.internal.OnTransferUpdateParams;

public final class dftb extends ddpq {
    final dftj a;
    final dcnp b;

    public dftb(dftj dftj0, dcnp dcnp0) {
        this.a = dftj0;
        this.b = dcnp0;
        super();
    }

    @Override  // ddpr
    public final void a(OnTransferUpdateParams onTransferUpdateParams0) {
        ibuq.f(onTransferUpdateParams0, "params");
        ShareTarget shareTarget0 = onTransferUpdateParams0.a;
        ibuq.e(shareTarget0, "getShareTarget(...)");
        dcls dcls0 = shareTarget0.b();
        dcls0.k = false;
        ShareTarget shareTarget1 = dcls0.a();
        ShareTarget shareTarget2 = this.a.I(shareTarget1);
        this.b.e(shareTarget2, onTransferUpdateParams0.b);
        this.a.g.put(Long.valueOf(shareTarget2.a), onTransferUpdateParams0.b);
        TransferMetadata transferMetadata0 = onTransferUpdateParams0.b;
        ibuq.e(transferMetadata0, "getTransferMetadata(...)");
        this.a.e.a(shareTarget2, transferMetadata0);
    }
}

