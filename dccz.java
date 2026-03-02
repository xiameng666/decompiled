import android.hardware.display.DisplayManager.DisplayListener;
import com.google.android.gms.nearby.sharing.NearbySharingChimeraService;
import j..util.Objects;

public final class dccz implements DisplayManager.DisplayListener {
    final NearbySharingChimeraService a;

    public dccz(NearbySharingChimeraService nearbySharingChimeraService0) {
        Objects.requireNonNull(nearbySharingChimeraService0);
        this.a = nearbySharingChimeraService0;
        super();
    }

    @Override  // android.hardware.display.DisplayManager$DisplayListener
    public final void onDisplayAdded(int v) {
    }

    @Override  // android.hardware.display.DisplayManager$DisplayListener
    public final void onDisplayChanged(int v) {
        if(v != 0) {
            return;
        }
        dccy dccy0 = new dccy(this);
        this.a.aj(dccy0);
    }

    @Override  // android.hardware.display.DisplayManager$DisplayListener
    public final void onDisplayRemoved(int v) {
    }
}

