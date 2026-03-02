import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetUpdatedParams;

public final class dftf implements Runnable {
    public final dftj a;
    public final OnShareTargetUpdatedParams b;
    public final dclv c;

    public dftf(dftj dftj0, OnShareTargetUpdatedParams onShareTargetUpdatedParams0, dclv dclv0) {
        this.a = dftj0;
        this.b = onShareTargetUpdatedParams0;
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
        dcvz.a.b().i("OEM[%s] ShareTarget %s updated", this.a.a, shareTarget2.b);
        this.a.c.n(shareTarget2);
        this.c.d(shareTarget2);
    }
}

