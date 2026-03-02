import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import java.util.ArrayList;

public final class acns extends wby implements IInterface, cjug {
    private final cjts a;
    private final String b;
    private final String c;

    public acns() {
        super("com.google.android.gms.appusage.internal.IAppUsageService");
    }

    public acns(cjts cjts0, String s, String s1) {
        super("com.google.android.gms.appusage.internal.IAppUsageService");
        this.b = s;
        this.c = s1;
        this.a = cjts0;
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        acnr acnr0 = null;
        switch(v) {
            case 2: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.appusage.internal.IAppUsageCallbacks");
                    acnr0 = (iInterface0 instanceof acnr) ? ((acnr)iInterface0) : new acnr(iBinder0);
                }
                long v1 = parcel0.readLong();
                long v2 = parcel0.readLong();
                ArrayList arrayList0 = parcel0.createStringArrayList();
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                acns.gr(parcel0);
                azuf azuf0 = azug.b(apiMetadata0);
                azuf0.e(bbdp.eU);
                azuf0.g(bbdq.t);
                azuf0.d(this.b);
                azuf0.c(this.c);
                escc escc0 = new escc(acnr0, v1, v2, arrayList0, azuf0.a());
                this.a.b(escc0);
                break;
            }
            case 3: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.appusage.internal.IAppUsageCallbacks");
                    acnr0 = (iInterface1 instanceof acnr) ? ((acnr)iInterface1) : new acnr(iBinder1);
                }
                long v3 = parcel0.readLong();
                long v4 = parcel0.readLong();
                ArrayList arrayList1 = parcel0.createStringArrayList();
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                acns.gr(parcel0);
                azuf azuf1 = azug.b(apiMetadata1);
                azuf1.e(bbdp.eU);
                azuf1.g(bbdq.t);
                azuf1.d(this.b);
                azuf1.c(this.c);
                escb escb0 = new escb(acnr0, v3, v4, arrayList1, azuf1.a());
                this.a.b(escb0);
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

