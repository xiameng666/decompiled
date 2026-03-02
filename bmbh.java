import android.hardware.usb.UsbDeviceConnection;

public final class bmbh implements Runnable {
    public final bmbj a;

    public bmbh(bmbj bmbj0) {
        this.a = bmbj0;
    }

    @Override
    public final void run() {
        bmbj bmbj0 = this.a;
        bmch bmch0 = bmbj0.b;
        UsbDeviceConnection usbDeviceConnection0 = bmch0.e;
        if(usbDeviceConnection0 != null) {
            bmch0.e = null;
            usbDeviceConnection0.releaseInterface(bmch0.b.getInterface(bmch0.c));
            usbDeviceConnection0.close();
        }
        bmbj0.d.set(false);
    }
}

