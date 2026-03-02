import android.hardware.display.DisplayManager.DisplayListener;

final class atr implements DisplayManager.DisplayListener {
    final ats a;

    public atr(ats ats0) {
        this.a = ats0;
        super();
    }

    @Override  // android.hardware.display.DisplayManager$DisplayListener
    public final void onDisplayAdded(int v) {
        synchronized(ats.a) {
            ats.e(this.a);
            ats.f(this.a);
        }
    }

    @Override  // android.hardware.display.DisplayManager$DisplayListener
    public final void onDisplayChanged(int v) {
        synchronized(ats.a) {
            ats.e(this.a);
            ats.f(this.a);
        }
    }

    @Override  // android.hardware.display.DisplayManager$DisplayListener
    public final void onDisplayRemoved(int v) {
        synchronized(ats.a) {
            ats.e(this.a);
            ats.f(this.a);
        }
    }
}

