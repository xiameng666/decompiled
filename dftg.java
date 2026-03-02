import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetDistanceChangedParams;

public final class dftg implements Runnable {
    public final dftj a;
    public final OnShareTargetDistanceChangedParams b;
    public final dclv c;

    public dftg(dftj dftj0, OnShareTargetDistanceChangedParams onShareTargetDistanceChangedParams0, dclv dclv0) {
        this.a = dftj0;
        this.b = onShareTargetDistanceChangedParams0;
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
        dcvz.a.b().i("OEM[%s] ShareTarget %s distance changed", this.a.a, shareTarget2.b);
        this.c.b(shareTarget2, this.b.b, this.b.c);
    }
}

