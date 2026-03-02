import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;

public final class ezcy extends wby implements cjug, ezcz {
    private final cjts a;
    private final String b;
    private final String c;

    public ezcy() {
        super("com.google.android.gms.trustagent.internal.IAuthenticatorsService");
    }

    public ezcy(cjts cjts0, String s, String s1) {
        super("com.google.android.gms.trustagent.internal.IAuthenticatorsService");
        this.b = s;
        this.c = s1;
        this.a = cjts0;
    }

    @Override  // ezcz
    public final void a(ezcw ezcw0, String s, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.fn);
        azuf0.g(bbdq.q);
        azuf0.d(this.b);
        azuf0.c(this.c);
        ezam ezam0 = new ezam(ezcw0, s, azuf0.a());
        this.a.b(ezam0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        ezcw ezcw0;
        if(v == 1) {
            IBinder iBinder0 = parcel0.readStrongBinder();
            if(iBinder0 == null) {
                ezcw0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.trustagent.internal.IAuthenticatorsCallbacks");
                ezcw0 = (iInterface0 instanceof ezcw) ? ((ezcw)iInterface0) : new ezcu(iBinder0);
            }
            String s = parcel0.readString();
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            ezcy.gr(parcel0);
            this.a(ezcw0, s, apiMetadata0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

