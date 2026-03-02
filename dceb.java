import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.SyncParams;
import java.util.concurrent.Callable;

public final class dceb implements Callable {
    public final dchp a;
    public final SyncParams b;

    public dceb(dchp dchp0, SyncParams syncParams0) {
        this.a = dchp0;
        this.b = syncParams0;
    }

    @Override
    public final Object call() {
        dchp dchp0 = this.a;
        int v = 2;
        if(hvqz.X()) {
            dchp0.e.Z = this.b.b == 2;
        }
        NearbySharingChimeraService nearbySharingChimeraService0 = dchp0.e;
        dcpu dcpu0 = new dcpu();
        dcpu0.b = 1;
        if(nearbySharingChimeraService0.Z) {
            v = 3;
        }
        dcpu0.a = v;
        nearbySharingChimeraService0.Q(new dcpv(dcpu0));
        return (int)0;
    }
}

