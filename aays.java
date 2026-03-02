import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.activeunlock.DeviceIdentifier;
import com.google.android.gms.common.api.ApiMetadata;

public final class aays extends wby implements aayt, cjug {
    private final cjts a;
    private final eyhd b;
    private final Context c;
    private final String d;
    private final String e;

    public aays() {
        super("com.google.android.gms.activeunlock.internal.IEnrollmentService");
    }

    public aays(cjts cjts0, eyhd eyhd0, Context context0, String s, String s1) {
        ibuq.f(eyhd0, "isEnrolledAsAssociatedDeviceFactory");
        ibuq.f(s, "callingPackage");
        super("com.google.android.gms.activeunlock.internal.IEnrollmentService");
        this.a = cjts0;
        this.b = eyhd0;
        this.c = context0;
        this.d = s;
        this.e = s1;
    }

    @Override  // aayt
    public final void a(aayq aayq0, DeviceIdentifier deviceIdentifier0, ApiMetadata apiMetadata0) {
        ibuq.f(aayq0, "callbacks");
        ibuq.f(deviceIdentifier0, "deviceIdentifier");
        String s = this.d;
        Context context0 = this.c;
        if(!eygz.a(s, context0)) {
            azql.c(context0).d(s);
        }
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.h);
        azuf0.g(bbdq.q);
        azuf0.d(s);
        azuf0.c(this.e);
        azug azug0 = azuf0.a();
        eyhf eyhf0 = this.b.a(aayq0, deviceIdentifier0.a, azug0);
        this.a.b(eyhf0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        aayq aayq0;
        if(v == 1) {
            IBinder iBinder0 = parcel0.readStrongBinder();
            if(iBinder0 == null) {
                aayq0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.activeunlock.internal.IEnrollmentCallbacks");
                aayq0 = (iInterface0 instanceof aayq) ? ((aayq)iInterface0) : new aayo(iBinder0);
            }
            DeviceIdentifier deviceIdentifier0 = (DeviceIdentifier)wbz.a(parcel0, DeviceIdentifier.CREATOR);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            aays.gr(parcel0);
            this.a(aayq0, deviceIdentifier0, apiMetadata0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

