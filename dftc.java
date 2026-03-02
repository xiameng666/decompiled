import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import com.google.android.gms.nearby.sharing.internal.OnTransferUpdateParams;

public final class dftc implements Runnable {
    public final dftj a;
    public final OnTransferUpdateParams b;
    public final dcnp c;

    public dftc(dftj dftj0, OnTransferUpdateParams onTransferUpdateParams0, dcnp dcnp0) {
        this.a = dftj0;
        this.b = onTransferUpdateParams0;
        this.c = dcnp0;
    }

    @Override
    public final void run() {
        OnTransferUpdateParams onTransferUpdateParams0 = this.b;
        ShareTarget shareTarget0 = onTransferUpdateParams0.a;
        ibuq.e(shareTarget0, "getShareTarget(...)");
        dcls dcls0 = shareTarget0.b();
        dcls0.k = true;
        ShareTarget shareTarget1 = dcls0.a();
        dftj dftj0 = this.a;
        ShareTarget shareTarget2 = dftj0.I(shareTarget1);
        cunf cunf0 = dcvz.a.b();
        String s = dftj0.a;
        cunf0.j("OEM[%s] ShareTarget %s received transfer update event %s", s, shareTarget2.b, TransferMetadata.c(onTransferUpdateParams0.b.a));
        if(onTransferUpdateParams0.b.m) {
            dftj0.c.k(shareTarget2, s);
        }
        this.c.e(shareTarget2, onTransferUpdateParams0.b);
        dftj0.g.put(Long.valueOf(shareTarget2.a), onTransferUpdateParams0.b);
        TransferMetadata transferMetadata0 = onTransferUpdateParams0.b;
        ibuq.e(transferMetadata0, "getTransferMetadata(...)");
        dftj0.e.a(shareTarget2, transferMetadata0);
    }
}

