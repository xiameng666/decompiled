import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import com.google.android.gms.nearby.sharing.internal.UpdateSelectedContactsParams;
import java.util.concurrent.Callable;

public final class dcea implements Callable {
    public final dchp a;
    public final UpdateSelectedContactsParams b;

    public dcea(dchp dchp0, UpdateSelectedContactsParams updateSelectedContactsParams0) {
        this.a = dchp0;
        this.b = updateSelectedContactsParams0;
    }

    @Override
    public final Object call() {
        NearbySharingChimeraService nearbySharingChimeraService0 = this.a.e;
        int v = nearbySharingChimeraService0.a.i(this.b);
        if(v == 0) {
            nearbySharingChimeraService0.N();
            v = 0;
        }
        return v;
    }
}

