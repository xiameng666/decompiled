import android.hardware.usb.UsbPort;
import java.util.Locale;

public final class czwv implements Runnable {
    public final czxc a;
    public final UsbPort b;

    public czwv(czxc czxc0, UsbPort usbPort0) {
        this.a = czxc0;
        this.b = usbPort0;
    }

    @Override
    public final void run() {
        String s;
        cunf cunf0 = czkq.a;
        cunf0.b().p("Attempting to limit power transfer for USB connection", new Object[0]);
        int v = this.b.enableLimitPowerTransfer(true);
        if(v != 0) {
            cunf cunf1 = cunf0.e();
            switch(v) {
                case 0: {
                    s = "ENABLE_LIMIT_POWER_TRANSFER_SUCCESS";
                    break;
                }
                case 1: {
                    s = "ENABLE_LIMIT_POWER_TRANSFER_ERROR_INTERNAL";
                    break;
                }
                case 2: {
                    s = "ENABLE_LIMIT_POWER_TRANSFER_ERROR_NOT_SUPPORTED";
                    break;
                }
                case 3: {
                    s = "ENABLE_LIMIT_POWER_TRANSFER_ERROR_PORT_MISMATCH";
                    break;
                }
                case 4: {
                    s = "ENABLE_LIMIT_POWER_TRANSFER_ERROR_OTHER";
                    break;
                }
                default: {
                    s = "UNKNOWN";
                }
            }
            cunf1.h("Failed to limit power transfer for USB connection. %s", String.format(Locale.ENGLISH, "[%d]%s", v, s));
            return;
        }
        synchronized(this.a) {
            this.a.d = true;
        }
    }
}

