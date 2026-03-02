import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.internal.GetServiceRequest;

public final class ccdf extends wby implements ccdg, cjug {
    private final cjts a;
    private final byte[] b;
    private final String c;
    private final String d;

    public ccdf() {
        super("com.google.android.gms.learning.internal.IGmsTrainer");
    }

    public ccdf(cjts cjts0, GetServiceRequest getServiceRequest0) {
        super("com.google.android.gms.learning.internal.IGmsTrainer");
        this.c = getServiceRequest0.f;
        this.d = getServiceRequest0.p;
        this.a = cjts0;
        this.b = getServiceRequest0.i.getByteArray("learning.options");
    }

    @Override  // ccdg
    public final void a(azxs azxs0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.ak);
        azuf0.g(bbdq.aJ);
        azuf0.d(this.c);
        azuf0.c(this.d);
        azug azug0 = azuf0.a();
        ccgs ccgs0 = new ccgs(this.b, azxs0, azug0);
        this.a.b(ccgs0);
    }

    @Override  // ccdg
    public final void b(azxs azxs0, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.f(azud.a);
        azuf0.e(bbdp.ak);
        azuf0.g(bbdq.aJ);
        azuf0.d(this.c);
        azuf0.c(this.d);
        azug azug0 = azuf0.a();
        ccgu ccgu0 = new ccgu(this.b, azxs0, azug0);
        this.a.b(ccgu0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        azxs azxs0 = null;
        switch(v) {
            case 2: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    azxs0 = (iInterface0 instanceof azxs) ? ((azxs)iInterface0) : new azxq(iBinder0);
                }
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ccdf.gr(parcel0);
                this.b(azxs0, apiMetadata0);
                break;
            }
            case 3: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    azxs0 = (iInterface1 instanceof azxs) ? ((azxs)iInterface1) : new azxq(iBinder1);
                }
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ccdf.gr(parcel0);
                this.a(azxs0, apiMetadata1);
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

