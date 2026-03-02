import com.google.android.gms.wearable.backup.wear.lockscreenbc25.pin.PinPadViewV2;

public final class fcwe implements Runnable {
    public final PinPadViewV2 a;
    public final int b;

    public fcwe(PinPadViewV2 pinPadViewV20, int v) {
        this.a = pinPadViewV20;
        this.b = v;
    }

    @Override
    public final void run() {
        this.a.a(this.a.b[this.b]);
    }
}

