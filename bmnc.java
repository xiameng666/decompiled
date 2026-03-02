import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;

public final class bmnc extends wby implements IInterface, cjug {
    private final cjts a;
    private final String b;
    private final String c;

    public bmnc() {
        super("com.google.android.gms.fido.fido2.internal.firstparty.IFido2FirstPartyService");
    }

    public bmnc(cjts cjts0, String s, String s1) {
        super("com.google.android.gms.fido.fido2.internal.firstparty.IFido2FirstPartyService");
        this.b = s;
        this.c = s1;
        this.a = cjts0;
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        bmfz bmfz0;
        if(v == 1) {
            IBinder iBinder0 = parcel0.readStrongBinder();
            if(iBinder0 == null) {
                bmfz0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.fido.fido2.api.IByteArrayCallback");
                bmfz0 = (iInterface0 instanceof bmfz) ? ((bmfz)iInterface0) : new bmfz(iBinder0);
            }
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            bmnc.gr(parcel0);
            ccmq.a().a(bbdg.dc);
            azuf azuf0 = azug.b(apiMetadata0);
            azuf0.e(bbdp.bv);
            azuf0.g(bbdq.aL);
            azuf0.d(this.b);
            azuf0.c(this.c);
            blku blku0 = new blku(bmfz0, azuf0.a());
            this.a.b(blku0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

