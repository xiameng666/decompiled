import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;

public final class buwv extends wby implements buww, cjug {
    private final cjts a;
    private final icck b;
    private final String c;
    private final String d;
    private final buuk e;

    public buwv() {
        super("com.google.android.gms.googlesettings.internal.ISelectedAccountManagerService");
    }

    public buwv(cjts cjts0, buuk buuk0, icck icck0, String s, String s1) {
        ibuq.f(buuk0, "accountManager");
        ibuq.f(icck0, "coroutineScope");
        ibuq.f(s, "callingPackage");
        super("com.google.android.gms.googlesettings.internal.ISelectedAccountManagerService");
        this.a = cjts0;
        this.e = buuk0;
        this.b = icck0;
        this.c = s;
        this.d = s1;
    }

    @Override  // buww
    public final void a(buwt buwt0, ApiMetadata apiMetadata0) {
        ibuq.f(buwt0, "callbacks");
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.bW);
        azuf0.g(bbdq.Z);
        azuf0.d(this.c);
        azuf0.c(this.d);
        azug azug0 = azuf0.a();
        buvk buvk0 = new buvk(this.e, this.b, buwt0, azug0);
        this.a.b(buvk0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        buwt buwt0;
        if(v == 1) {
            IBinder iBinder0 = parcel0.readStrongBinder();
            if(iBinder0 == null) {
                buwt0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.googlesettings.internal.ISelectedAccountManagerCallbacks");
                buwt0 = (iInterface0 instanceof buwt) ? ((buwt)iInterface0) : new buwr(iBinder0);
            }
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            buwv.gr(parcel0);
            this.a(buwt0, apiMetadata0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

