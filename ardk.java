import android.hardware.usb.UsbAccessory;

public final class ardk implements Runnable {
    public final UsbAccessory a;
    public final arfr b;

    public ardk(arfr arfr0, UsbAccessory usbAccessory0) {
        this.b = arfr0;
        this.a = usbAccessory0;
    }

    @Override
    public final void run() {
        this.b.a.c.g(new arlt(this.b.a, this.a));
    }
}

