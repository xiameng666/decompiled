import android.content.Intent;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.SendParams;
import java.util.concurrent.Callable;

public final class dcee implements Callable {
    public final dchp a;
    public final ShareTarget b;
    public final SendParams c;

    public dcee(dchp dchp0, ShareTarget shareTarget0, SendParams sendParams0) {
        this.a = dchp0;
        this.b = shareTarget0;
        this.c = sendParams0;
    }

    @Override
    public final Object call() {
        NearbySharingChimeraService nearbySharingChimeraService0 = this.a.e;
        Intent intent0 = this.c.b;
        boolean z = this.c.d;
        if(!nearbySharingChimeraService0.aP()) {
            dcvz.a.b().p("Failed to send file to remote ShareTarget. Not scanning.", new Object[0]);
            return hvqz.ah() ? ((int)0x8AB7) : ((int)13);
        }
        if(!nearbySharingChimeraService0.aI()) {
            dcvz.a.b().p("Failed to send file to remote ShareTarget. No registered share sheet.", new Object[0]);
            return hvqz.ah() ? ((int)0x8AB7) : ((int)13);
        }
        ShareTarget shareTarget0 = this.b;
        if(!((Boolean)nearbySharingChimeraService0.ao.mr()).booleanValue() || !nearbySharingChimeraService0.aS(shareTarget0) && nearbySharingChimeraService0.S.k(Long.valueOf(shareTarget0.a))) {
            if(hvqz.q()) {
                nearbySharingChimeraService0.aA();
            }
            if(hvqz.z()) {
                dcnn dcnn0 = new dcnn(0x3F8);
                dcnn0.h = true;
                nearbySharingChimeraService0.ae(shareTarget0, dcnn0.a());
                cumn cumn0 = (cumn)nearbySharingChimeraService0.am.remove(shareTarget0);
                if(cumn0 != null) {
                    cumn0.b();
                }
            }
            if(((Boolean)nearbySharingChimeraService0.an.mr()).booleanValue()) {
                dikq dikq0 = (dikq)nearbySharingChimeraService0.ae.mr();
                dikc dikc0 = new dikc(shareTarget0, intent0, z);
                dcvz.a.b().h("Adding request %s to queue", dikc0);
                dikj dikj0 = new dikj(dikc0);
                if(!icha.c(dikq0.f.b(dikj0))) {
                    throw new IllegalStateException("Check failed.");
                }
            }
            else {
                nearbySharingChimeraService0.al(new dikc(shareTarget0, intent0, z));
            }
            return (int)0;
        }
        return (int)0x8AB7;
    }
}

