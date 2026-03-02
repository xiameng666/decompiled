import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import java.util.concurrent.Callable;

public final class dcdo implements Callable {
    public final NearbySharingChimeraService a;

    public dcdo(NearbySharingChimeraService nearbySharingChimeraService0) {
        this.a = nearbySharingChimeraService0;
    }

    @Override
    public final Object call() {
        NearbySharingChimeraService nearbySharingChimeraService0 = this.a;
        dcus dcus0 = (dcus)nearbySharingChimeraService0.b.get();
        dcur dcur0 = new dcur(dcus0, null);
        icbb.b(dcus0.d, null, null, dcur0, 3);
        if(hvqz.G()) {
            nearbySharingChimeraService0.o.c();
        }
        return nearbySharingChimeraService0.a.h();
    }
}

