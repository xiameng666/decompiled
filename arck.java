import android.hardware.usb.UsbAccessory;
import com.google.android.gms.backup.d2d.component.D2dSourceChimeraActivity;
import j..util.Objects;

public final class arck implements arci {
    public final arcl a;

    public arck(arcl arcl0) {
        this.a = arcl0;
    }

    @Override  // arci
    public final void a() {
        D2dSourceChimeraActivity d2dSourceChimeraActivity0 = this.a.a;
        d2dSourceChimeraActivity0.n.f(d2dSourceChimeraActivity0.o, new arfu(d2dSourceChimeraActivity0));
        if(d2dSourceChimeraActivity0.r) {
            d2dSourceChimeraActivity0.b();
        }
        hkyj hkyj0 = d2dSourceChimeraActivity0.t;
        if(hkyj0 == hkyj.b) {
            UsbAccessory usbAccessory0 = (UsbAccessory)d2dSourceChimeraActivity0.getIntent().getParcelableExtra("accessory");
            gful_cronetEngineProvider gful0 = d2dSourceChimeraActivity0.v;
            if(((Boolean)gful0.mr()).booleanValue() && D2dSourceChimeraActivity.u(usbAccessory0)) {
                d2dSourceChimeraActivity0.n.c(usbAccessory0);
            }
            else {
                if(((Boolean)gful0.mr()).booleanValue()) {
                    if(usbAccessory0 == null) {
                        D2dSourceChimeraActivity.j.m("Duplexing is enabled but accessory is empty.", new Object[0]);
                    }
                    else if(!Objects.equals(usbAccessory0.getSerial(), hqhq.a.j().W())) {
                        String s = String.format("Duplexing is enabled but serial number %s does not match both duplexing and usb d2d.", usbAccessory0.getSerial());
                        D2dSourceChimeraActivity.j.m(s, new Object[0]);
                    }
                }
                d2dSourceChimeraActivity0.n.g(usbAccessory0);
            }
            D2dSourceChimeraActivity.t(d2dSourceChimeraActivity0);
            return;
        }
        if(hkyj0 == hkyj.c) {
            if(!d2dSourceChimeraActivity0.getIntent().getBooleanExtra("com.google.android.gms.backup.LAUNCHED_FROM_NOTIFICATION", false)) {
                d2dSourceChimeraActivity0.n.h();
            }
            D2dSourceChimeraActivity.t(d2dSourceChimeraActivity0);
            return;
        }
        d2dSourceChimeraActivity0.n.a();
    }
}

