import android.hardware.usb.UsbAccessory;
import com.google.android.gms.nearby.mediums.usb.Usb.4;

public final class czxa implements Runnable {
    public final Usb.4 a;
    public final UsbAccessory b;

    public czxa(Usb.4 usb$40, UsbAccessory usbAccessory0) {
        this.a = usb$40;
        this.b = usbAccessory0;
    }

    @Override
    public final void run() {
        this.a.a.i(this.b);
    }
}

