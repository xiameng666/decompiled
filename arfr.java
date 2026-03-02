import android.hardware.usb.UsbAccessory;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.backup.d2d.component.D2dSourceChimeraService;
import j..util.Objects;

public final class arfr extends wby implements arfs {
    public final D2dSourceChimeraService a;

    public arfr() {
        super("com.google.android.gms.backup.d2d.migrate.service.IBoundD2dSourceService");
    }

    public arfr(D2dSourceChimeraService d2dSourceChimeraService0) {
        Objects.requireNonNull(d2dSourceChimeraService0);
        this.a = d2dSourceChimeraService0;
        super("com.google.android.gms.backup.d2d.migrate.service.IBoundD2dSourceService");
    }

    @Override  // arfs
    public final void a() {
        ccmq.a().a(bbdg.mi);
        gmcg gmcg0 = this.a.b;
        argf argf0 = this.a.c;
        Objects.requireNonNull(argf0);
        gmcg0.execute(new ardj(argf0));
    }

    @Override  // arfs
    public final void b() {
        ccmq.a().a(bbdg.mi);
        gmcg gmcg0 = this.a.b;
        argf argf0 = this.a.c;
        Objects.requireNonNull(argf0);
        gmcg0.execute(new ardg(argf0));
    }

    @Override  // arfs
    public final void c(UsbAccessory usbAccessory0) {
        ccmq.a().a(bbdg.mi);
        this.a.b.execute(new ardf(this, usbAccessory0));
    }

    @Override  // arfs
    public final void d() {
        ccmq.a().a(bbdg.mi);
        gmcg gmcg0 = this.a.b;
        argf argf0 = this.a.c;
        Objects.requireNonNull(argf0);
        gmcg0.execute(new ardh(argf0));
    }

    @Override  // arfs
    public final void e() {
        ccmq.a().a(bbdg.mi);
        gmcg gmcg0 = this.a.b;
        argf argf0 = this.a.c;
        Objects.requireNonNull(argf0);
        gmcg0.execute(new ardm(argf0));
    }

    @Override  // arfs
    public final void f(String s, arfv arfv0) {
        ccmq.a().a(bbdg.mi);
        D2dSourceChimeraService.a.d("Registering callbacks for %s", new Object[]{s});
        this.a.e.k(arfv0, s);
        this.a.b.execute(new ardi(this));
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        arfv arfv0;
        switch(v) {
            case 1: {
                String s = parcel0.readString();
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 == null) {
                    arfv0 = null;
                }
                else {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.backup.d2d.migrate.service.ID2dSourceCallbacks");
                    arfv0 = (iInterface0 instanceof arfv) ? ((arfv)iInterface0) : new arft(iBinder0);
                }
                arfr.gr(parcel0);
                this.f(s, arfv0);
                return true;
            }
            case 2: {
                String s1 = parcel0.readString();
                arfr.gr(parcel0);
                this.i(s1);
                return true;
            }
            case 3: {
                UsbAccessory usbAccessory0 = (UsbAccessory)wbz.a(parcel0, UsbAccessory.CREATOR);
                arfr.gr(parcel0);
                this.g(usbAccessory0);
                return true;
            }
            case 4: {
                this.h();
                return true;
            }
            case 5: {
                this.e();
                return true;
            }
            case 6: {
                this.d();
                return true;
            }
            case 7: {
                this.b();
                return true;
            }
            case 8: {
                this.a();
                return true;
            }
            case 9: {
                UsbAccessory usbAccessory1 = (UsbAccessory)wbz.a(parcel0, UsbAccessory.CREATOR);
                arfr.gr(parcel0);
                this.c(usbAccessory1);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // arfs
    public final void g(UsbAccessory usbAccessory0) {
        ccmq.a().a(bbdg.mi);
        this.a.b.execute(new ardk(this, usbAccessory0));
    }

    @Override  // arfs
    public final void h() {
        ccmq.a().a(bbdg.mi);
        gmcg gmcg0 = this.a.b;
        argf argf0 = this.a.c;
        Objects.requireNonNull(argf0);
        gmcg0.execute(new ardl(argf0));
    }

    @Override  // arfs
    public final void i(String s) {
        ccmq.a().a(bbdg.mi);
        D2dSourceChimeraService.a.d("Unregistering callbacks for %s", new Object[]{s});
        this.a.e.b(s);
    }
}

