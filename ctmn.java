import android.graphics.drawable.Icon;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteCallbackList;
import com.google.android.gms.multidevice.sync.appcast.service.aidl.DeviceMetadata;
import java.util.List;
import java.util.Map;

public final class ctmn extends wby implements ctmo {
    public final ctzo a;
    public List b;
    public final RemoteCallbackList c;
    public final DeviceMetadata d;
    final ctmk e;

    public ctmn() {
        super("com.google.android.gms.multidevice.sync.appcast.service.aidl.IAppCastDevice");
    }

    public ctmn(ctpc ctpc0, ctmk ctmk0) {
        this.e = ctmk0;
        super("com.google.android.gms.multidevice.sync.appcast.service.aidl.IAppCastDevice");
        ctoy ctoy0 = (ctoy)ctpc0;
        this.a = new ctzo(ctoy0.a);
        this.b = ibps.a;
        this.c = new RemoteCallbackList();
        this.d = new DeviceMetadata(ctoy0.a.g(), ctoy0.a.f());
    }

    @Override  // ctmo
    public final DeviceMetadata a() {
        return this.d;
    }

    @Override  // ctmo
    public final ctna b(ctna ctna0) {
        ibuq.f(ctna0, "callback");
        return new ctlz(this.e, this, ctna0);
    }

    @Override  // ctmo
    public final void c(String s, ctmx ctmx0) {
        ibuq.f(s, "packageName");
        ibuq.f(ctmx0, "callback");
        ctmk ctmk0 = this.e;
        Map map0 = ctmk0.f;
        if(map0.containsKey(s)) {
            ctmx0.a(((Icon)map0.get(s)));
            return;
        }
        icck icck0 = ctmk0.c;
        if(icck0 != null) {
            icbb.b(icck0, null, null, new ctma(this, ctmx0, ctmk0, s, null), 3);
        }
    }

    @Override  // ctmo
    public final void d(ctmr ctmr0) {
        ibuq.f(ctmr0, "callback");
        this.c.register(ctmr0);
        ctmr0.a(this.b);
    }

    @Override  // ctmo
    public final void e(ctmr ctmr0) {
        ibuq.f(ctmr0, "callback");
        this.c.unregister(ctmr0);
    }

    public final void f() {
        icck icck0 = this.e.c;
        if(icck0 != null) {
            icbb.b(icck0, null, null, new ctmc(this, null), 3);
        }
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        ctmr ctmr0 = null;
        switch(v) {
            case 1: {
                parcel1.writeNoException();
                wbz.g(parcel1, this.d);
                return true;
            }
            case 2: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.multidevice.sync.appcast.service.aidl.IAppListCallback");
                    ctmr0 = (iInterface0 instanceof ctmr) ? ((ctmr)iInterface0) : new ctmp(iBinder0);
                }
                ctmn.gr(parcel0);
                this.d(ctmr0);
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.multidevice.sync.appcast.service.aidl.IAppListCallback");
                    ctmr0 = (iInterface1 instanceof ctmr) ? ((ctmr)iInterface1) : new ctmp(iBinder1);
                }
                ctmn.gr(parcel0);
                this.e(ctmr0);
                parcel1.writeNoException();
                return true;
            }
            case 4: {
                this.f();
                parcel1.writeNoException();
                return true;
            }
            case 5: {
                String s = parcel0.readString();
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.multidevice.sync.appcast.service.aidl.IFetchIconCallback");
                    ctmr0 = (iInterface2 instanceof ctmx) ? ((ctmx)iInterface2) : new ctmv(iBinder2);
                }
                ctmn.gr(parcel0);
                this.c(s, ((ctmx)ctmr0));
                parcel1.writeNoException();
                return true;
            }
            case 6: {
                IBinder iBinder3 = parcel0.readStrongBinder();
                if(iBinder3 != null) {
                    IInterface iInterface3 = iBinder3.queryLocalInterface("com.google.android.gms.multidevice.sync.appcast.service.aidl.ISignalingCallback");
                    ctmr0 = (iInterface3 instanceof ctna) ? ((ctna)iInterface3) : new ctmy(iBinder3);
                }
                ctmn.gr(parcel0);
                ctna ctna0 = this.b(((ctna)ctmr0));
                parcel1.writeNoException();
                wbz.h(parcel1, ctna0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

