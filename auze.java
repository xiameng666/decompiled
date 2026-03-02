import android.hardware.display.VirtualDisplay.Callback;

public final class auze extends VirtualDisplay.Callback {
    @Override  // android.hardware.display.VirtualDisplay$Callback
    public final void onStopped() {
        super.onStopped();
        auzi.a.d("VirtualDisplay stopped.", new Object[0]);
    }
}

