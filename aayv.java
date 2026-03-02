import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.activeunlock.DeviceIdentifier;
import com.google.android.gms.common.api.ApiMetadata;

public final class aayv extends wby implements IInterface, cjug {
    private final cjts a;
    private final eyhl b;
    private final Context c;
    private final String d;
    private final String e;

    public aayv() {
        super("com.google.android.gms.activeunlock.internal.ISettingsService");
    }

    public aayv(cjts cjts0, eyhl eyhl0, Context context0, String s, String s1) {
        ibuq.f(eyhl0, "getSettingsTileStateFactory");
        ibuq.f(s, "callingPackage");
        super("com.google.android.gms.activeunlock.internal.ISettingsService");
        this.a = cjts0;
        this.b = eyhl0;
        this.c = context0;
        this.d = s;
        this.e = s1;
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        Object object0;
        if(v == 1) {
            IBinder iBinder0 = parcel0.readStrongBinder();
            if(iBinder0 == null) {
                object0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.activeunlock.internal.ISettingsCallbacks");
                object0 = (iInterface0 instanceof aayu) ? ((aayu)iInterface0) : new aayu(iBinder0);
            }
            DeviceIdentifier deviceIdentifier0 = (DeviceIdentifier)wbz.a(parcel0, DeviceIdentifier.CREATOR);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            aayv.gr(parcel0);
            ibuq.f(object0, "callbacks");
            ibuq.f(deviceIdentifier0, "deviceIdentifier");
            Context context0 = this.c;
            String s = this.d;
            if(!eygz.a(s, context0)) {
                azql.c(context0).d(s);
            }
            azuf azuf0 = azug.b(apiMetadata0);
            azuf0.e(bbdp.h);
            azuf0.g(bbdq.q);
            azuf0.d(s);
            azuf0.c(this.e);
            azug azug0 = azuf0.a();
            eyhn eyhn0 = this.b.a(((aayu)object0), deviceIdentifier0, azug0);
            this.a.b(eyhn0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

