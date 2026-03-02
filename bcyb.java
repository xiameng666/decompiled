import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.core.settings.ControlPageRequest;

public final class bcyb extends wby implements bcyc, cjug {
    private final cjts a;
    private final bcxw b;
    private final String c;
    private final String d;

    public bcyb() {
        super("com.google.android.gms.core.settings.internal.ISettingsService");
    }

    public bcyb(cjts cjts0, bcxw bcxw0, String s, String s1) {
        super("com.google.android.gms.core.settings.internal.ISettingsService");
        this.a = cjts0;
        this.b = bcxw0;
        this.c = s;
        this.d = s1;
    }

    @Override  // bcyc
    public final void a(bcxz bcxz0, ControlPageRequest controlPageRequest0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.aR);
        azuf0.g(bbdq.Z);
        azuf0.d(this.c);
        azuf0.c(this.d);
        azug azug0 = azuf0.a();
        bcxt bcxt0 = new bcxt(this.b, bcxz0, controlPageRequest0, azug0);
        this.a.b(bcxt0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        bcxz bcxz0;
        if(v == 1) {
            IBinder iBinder0 = parcel0.readStrongBinder();
            if(iBinder0 == null) {
                bcxz0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.core.settings.internal.ISettingsCallbacks");
                bcxz0 = (iInterface0 instanceof bcxz) ? ((bcxz)iInterface0) : new bcxx(iBinder0);
            }
            ControlPageRequest controlPageRequest0 = (ControlPageRequest)wbz.a(parcel0, ControlPageRequest.CREATOR);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            bcyb.gr(parcel0);
            this.a(bcxz0, controlPageRequest0, apiMetadata0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

