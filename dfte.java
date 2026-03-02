import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.TransferMetadata;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetDiscoveredParams;

public final class dfte implements Runnable {
    public final dftj a;
    public final OnShareTargetDiscoveredParams b;
    public final dclv c;

    public dfte(dftj dftj0, OnShareTargetDiscoveredParams onShareTargetDiscoveredParams0, dclv dclv0) {
        this.a = dftj0;
        this.b = onShareTargetDiscoveredParams0;
        this.c = dclv0;
    }

    @Override
    public final void run() {
        ShareTarget shareTarget0 = this.b.a;
        ibuq.e(shareTarget0, "getShareTarget(...)");
        dcls dcls0 = shareTarget0.b();
        dcls0.k = false;
        ShareTarget shareTarget1 = dcls0.a();
        ShareTarget shareTarget2 = this.a.I(shareTarget1);
        dcvz.a.b().i("OEM[%s] ShareTarget %s discovered", this.a.a, shareTarget2.b);
        this.a.c.k(shareTarget2, this.a.a);
        TransferMetadata transferMetadata0 = new dcnn(1000).a();
        this.a.g.put(Long.valueOf(shareTarget2.a), transferMetadata0);
        this.c.jJ(shareTarget2);
        ibuq.e(shareTarget2.b, "getDeviceName(...)");
        dhai dhai0 = new dhai(shareTarget2.a, shareTarget2.b, false, false, shareTarget2.d, false, true);
        this.a.e.a.a(dhai0);
    }
}

