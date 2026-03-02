import com.google.android.gms.wearable.backup.wear.lskfui.pin.PinPadEditViewEndless;

public final class fcou implements Runnable {
    public final PinPadEditViewEndless a;
    public final boolean b;

    public fcou(PinPadEditViewEndless pinPadEditViewEndless0, boolean z) {
        this.a = pinPadEditViewEndless0;
        this.b = z;
    }

    @Override
    public final void run() {
        while(true) {
            PinPadEditViewEndless pinPadEditViewEndless0 = this.a;
            if(pinPadEditViewEndless0.a.isEmpty()) {
                break;
            }
            pinPadEditViewEndless0.a(this.b);
        }
    }
}

