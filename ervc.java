import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.spatula.settings.SpatulaSettingPreference;

public final class ervc extends wby implements IInterface, cjug {
    private final cjts a;
    private final ersm b;
    private final ersz c;
    private final ersw d;
    private final ersh e;
    private final ertf f;
    private final String g;
    private final String h;

    public ervc() {
        super("com.google.android.gms.spatula.settings.internal.ISpatulaSettingsService");
    }

    public ervc(cjts cjts0, ersm ersm0, ersz ersz0, ersw ersw0, ersh ersh0, ertf ertf0, String s, String s1) {
        ibuq.f(ersh0, "deviceStateProvider");
        ibuq.f(s, "callingPackage");
        super("com.google.android.gms.spatula.settings.internal.ISpatulaSettingsService");
        this.a = cjts0;
        this.b = ersm0;
        this.c = ersz0;
        this.d = ersw0;
        this.e = ersh0;
        this.f = ertf0;
        this.g = s;
        this.h = s1;
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        ervb ervb0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.spatula.settings.internal.ISpatulaSettingsCallbacks");
                    ervb0 = (iInterface0 instanceof ervb) ? ((ervb)iInterface0) : new ervb(iBinder0);
                }
                String s = parcel0.readString();
                ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ervc.gr(parcel0);
                if(ervb0 == null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                if(s == null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                azuf azuf0 = azug.b(apiMetadata0);
                azuf0.e(bbdp.eR);
                azuf0.g(bbdq.aH);
                azuf0.d(this.g);
                azuf0.c(this.h);
                azuf0.a();
                errw errw0 = new errw(this.c, this.d, this.e, ervb0, s);
                this.a.b(errw0);
                parcel1.writeNoException();
                return true;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.common.api.internal.IStatusCallback");
                    ervb0 = (iInterface1 instanceof azxs) ? ((azxs)iInterface1) : new azxq(iBinder1);
                }
                String s1 = parcel0.readString();
                SpatulaSettingPreference spatulaSettingPreference0 = (SpatulaSettingPreference)wbz.a(parcel0, SpatulaSettingPreference.CREATOR);
                ApiMetadata apiMetadata1 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
                ervc.gr(parcel0);
                if(ervb0 == null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                if(s1 == null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                if(spatulaSettingPreference0 == null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                azuf azuf1 = azug.b(apiMetadata1);
                azuf1.e(bbdp.eR);
                azuf1.g(bbdq.aH);
                azuf1.d(this.g);
                azuf1.c(this.h);
                azuf1.a();
                errz errz0 = new errz(this.f, ((azxs)ervb0), s1, spatulaSettingPreference0);
                this.a.b(errz0);
                parcel1.writeNoException();
                return true;
            }
            case 3: {
                IBinder iBinder2 = parcel0.readStrongBinder();
                if(iBinder2 != null) {
                    IInterface iInterface2 = iBinder2.queryLocalInterface("com.google.android.gms.spatula.settings.internal.ISpatulaAvailabilityCallbacks");
                    ervb0 = (iInterface2 instanceof erva) ? ((erva)iInterface2) : new erva(iBinder2);
                }
                break;
            }
            default: {
                return false;
            }
        }
        ApiMetadata apiMetadata2 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
        ervc.gr(parcel0);
        if(ervb0 == null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        azuf azuf2 = azug.b(apiMetadata2);
        azuf2.e(bbdp.eR);
        azuf2.g(bbdq.aH);
        azuf2.d(this.g);
        azuf2.c(this.h);
        azuf2.a();
        errt errt0 = new errt(this.b, ((erva)ervb0));
        this.a.b(errt0);
        parcel1.writeNoException();
        return true;
    }
}

