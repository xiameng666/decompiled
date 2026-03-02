import android.net.TetheringManager.StartTetheringCallback;
import j..util.Objects;

final class czuy implements TetheringManager.StartTetheringCallback {
    final gmcu a;
    final czuz b;

    public czuy(czuz czuz0, gmcu gmcu0) {
        this.a = gmcu0;
        Objects.requireNonNull(czuz0);
        this.b = czuz0;
        super();
    }

    public final void onTetheringFailed(int v) {
        this.a.q(Boolean.valueOf(false));
        czkq.a.b().i("%s: Failed to start tethering: %d", "[UsbNcm]", Integer.valueOf(v));
    }

    public final void onTetheringStarted() {
        this.a.q(Boolean.valueOf(true));
        czkq.a.b().h("%s: onTetheringStarted", "[UsbNcm]");
        synchronized(this.b) {
            this.b.e = true;
        }
    }
}

