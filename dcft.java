import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.ShareTarget;
import com.google.android.gms.nearby.sharing.internal.SendParams;

public final class dcft implements Runnable {
    public final dchp a;
    public final SendParams b;

    public dcft(dchp dchp0, SendParams sendParams0) {
        this.a = dchp0;
        this.b = sendParams0;
    }

    @Override
    public final void run() {
        SendParams sendParams0 = this.b;
        dchp dchp0 = this.a;
        ShareTarget shareTarget0 = dchp0.e.c.a(sendParams0.a.a);
        if(shareTarget0 == null) {
            dcvz.a.e().p("Failed to find ShareTarget in ProviderManager", new Object[0]);
            azxs azxs0 = sendParams0.c;
            dced dced0 = new dced();
            NearbySharingChimeraService.ac(dchp0.a, "send", azxs0, dced0);
            return;
        }
        azxs azxs1 = sendParams0.c;
        dcee dcee0 = new dcee(dchp0, shareTarget0, sendParams0);
        NearbySharingChimeraService.ac(dchp0.a, "send", azxs1, dcee0);
    }
}

