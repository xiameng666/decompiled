import android.hardware.display.DisplayManager.DisplayListener;
import j..util.Objects;

final class cyrt implements DisplayManager.DisplayListener {
    final cysc a;

    public cyrt(cysc cysc0) {
        Objects.requireNonNull(cysc0);
        this.a = cysc0;
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
        if(hvpg.bJ()) {
            ((ggtj)this.a.n.d().ar(8057)).z("WearScannerHelper: onDisplayChanged, displayId=%d", 0);
        }
        this.a.k();
    }

    @Override  // android.hardware.display.DisplayManager$DisplayListener
    public final void onDisplayRemoved(int v) {
    }
}

