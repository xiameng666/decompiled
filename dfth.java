import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.OnShareTargetLostParams;

public final class dfth implements Runnable {
    public final dftj a;
    public final OnShareTargetLostParams b;
    public final dclv c;

    public dfth(dftj dftj0, OnShareTargetLostParams onShareTargetLostParams0, dclv dclv0) {
        this.a = dftj0;
        this.b = onShareTargetLostParams0;
        this.c = dclv0;
    }

    @Override
    public final void run() {
        ShareTarget shareTarget0;
        OnShareTargetLostParams onShareTargetLostParams0 = this.b;
        dftj dftj0 = this.a;
        Long long0 = (Long)dftj0.f.get(Long.valueOf(onShareTargetLostParams0.a.a));
        if(long0 == null) {
            shareTarget0 = onShareTargetLostParams0.a;
        }
        else {
            ShareTarget shareTarget1 = onShareTargetLostParams0.a;
            ibuq.e(shareTarget1, "getShareTarget(...)");
            dcls dcls0 = shareTarget1.b();
            dcwa.a(dcls0, long0.longValue());
            dcwa.b(dcls0);
            shareTarget0 = dcls0.a();
        }
        dcvz.a.b().i("OEM[%s] ShareTarget %s lost", dftj0.a, shareTarget0.b);
        dftj0.c.o(shareTarget0);
        dftj0.g.remove(Long.valueOf(shareTarget0.a));
        this.c.c(shareTarget0);
        ibuq.c(shareTarget0);
        ibuq.f(shareTarget0, "shareTarget");
        dham dham0 = new dham(shareTarget0.a);
        dftj0.e.a.a(dham0);
    }
}

