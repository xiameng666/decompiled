import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.safebrowsing.internal.SafeBrowsingRequest;
import java.util.concurrent.atomic.AtomicBoolean;

public final class eknb extends wby implements IInterface, cjug {
    public final ekog a;
    public final String b;
    public final AtomicBoolean c;
    private final cjts d;

    public eknb() {
        super("com.google.android.gms.safebrowsing.internal.ISafeBrowsingService");
    }

    public eknb(cjts cjts0, ekog ekog0, String s) {
        super("com.google.android.gms.safebrowsing.internal.ISafeBrowsingService");
        this.c = new AtomicBoolean();
        this.d = cjts0;
        this.a = ekog0;
        this.b = s;
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        ekna ekna0 = null;
        switch(v) {
            case 2: {
                SafeBrowsingRequest safeBrowsingRequest0 = (SafeBrowsingRequest)wbz.a(parcel0, SafeBrowsingRequest.CREATOR);
                String s = parcel0.readString();
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.safebrowsing.internal.ISafeBrowsingCallbacks");
                    ekna0 = (iInterface0 instanceof ekna) ? ((ekna)iInterface0) : new ekna(iBinder0);
                }
                boolean z = wbz.i(parcel0);
                eknb.gr(parcel0);
                elip elip0 = new elip(this, ekna0, safeBrowsingRequest0, z, s);
                this.d.b(elip0);
                break;
            }
            case 3: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.safebrowsing.internal.ISupportedThreatTypesCallbacks");
                    ekna0 = (iInterface1 instanceof eknc) ? ((eknc)iInterface1) : new eknc(iBinder1);
                }
                eknb.gr(parcel0);
                eliq eliq0 = new eliq(this, ((eknc)ekna0));
                this.d.b(eliq0);
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

