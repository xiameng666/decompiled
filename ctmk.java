import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteCallbackList;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public final class ctmk extends wby implements ctml {
    public final ctpd a;
    public final bboh b;
    public icck c;
    public final List d;
    public RemoteCallbackList e;
    public final Map f;
    private final ibrt g;

    public ctmk() {
        super("com.google.android.gms.multidevice.sync.appcast.service.aidl.IAppCastClientService");
    }

    public ctmk(ibrt ibrt0, ctpd ctpd0) {
        ibuq.f(ctpd0, "rpcClientManager");
        super("com.google.android.gms.multidevice.sync.appcast.service.aidl.IAppCastClientService");
        this.g = ibrt0;
        this.a = ctpd0;
        this.b = ctnb.a("AppCast", new ibuk(this.getClass()));
        this.d = new ArrayList();
        this.e = new RemoteCallbackList();
        this.f = new LinkedHashMap();
    }

    @Override  // ctml
    public final void a(ctmu ctmu0) {
        ibuq.f(ctmu0, "callback");
        this.e.register(ctmu0);
        ibuq.d(this.d, "null cannot be cast to non-null type kotlin.collections.List<android.os.IBinder>");
        ctmu0.a(this.d);
    }

    @Override  // ctml
    public final void b(ctmu ctmu0) {
        ibuq.f(ctmu0, "callback");
        this.e.unregister(ctmu0);
    }

    public final void c() {
        icck icck0;
        synchronized(this) {
            if(this.c != null) {
                return;
            }
            icck0 = iccl.b(this.g);
            this.c = icck0;
        }
        if(icck0 != null) {
            icbb.b(icck0, null, null, new ctme(this, null), 3);
        }
    }

    public final void d() {
        synchronized(this) {
            icck icck0 = this.c;
            if(icck0 != null) {
                iccl.i(icck0);
            }
            this.c = null;
        }
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        ctmu ctmu0 = null;
        switch(v) {
            case 1: {
                this.c();
                break;
            }
            case 2: {
                this.d();
                break;
            }
            case 3: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.multidevice.sync.appcast.service.aidl.IDiscoveryCallback");
                    ctmu0 = (iInterface0 instanceof ctmu) ? ((ctmu)iInterface0) : new ctms(iBinder0);
                }
                ctmk.gr(parcel0);
                this.a(ctmu0);
                break;
            }
            case 4: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.multidevice.sync.appcast.service.aidl.IDiscoveryCallback");
                    ctmu0 = (iInterface1 instanceof ctmu) ? ((ctmu)iInterface1) : new ctms(iBinder1);
                }
                ctmk.gr(parcel0);
                this.b(ctmu0);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }
}

