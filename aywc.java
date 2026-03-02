import android.content.Context;
import android.net.Uri;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.chimera.modules.clearcut.AppContextProvider;
import com.google.android.gms.clearcut.appdoctor.QosTierOverrideRequestParcelable;

public final class aywc extends wby implements IInterface, cjug {
    private final cjts a;

    public aywc() {
        super("com.google.android.gms.clearcut.appdoctor.IAppDoctorClearcutLogManagerService");
    }

    public aywc(cjts cjts0) {
        super("com.google.android.gms.clearcut.appdoctor.IAppDoctorClearcutLogManagerService");
        this.a = cjts0;
    }

    private static frli a(Context context0) {
        frce frce0 = new frce(context0);
        frce0.d("clearcut");
        frce0.e("appdoctor_qos_tier_overrides.pb");
        Uri uri0 = frce0.a();
        frie frie0 = frif.a();
        frie0.f(uri0);
        frie0.e(((MessageLite)ayvz.a));
        frif frif0 = frie0.a();
        return cjtb.a.a(frif0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        aywb aywb0 = null;
        switch(v) {
            case 2: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.clearcut.appdoctor.IAppDoctorClearcutLogManagerCallbacks");
                    aywb0 = (iInterface0 instanceof aywb) ? ((aywb)iInterface0) : new aywb(iBinder0);
                }
                QosTierOverrideRequestParcelable qosTierOverrideRequestParcelable0 = (QosTierOverrideRequestParcelable)wbz.a(parcel0, QosTierOverrideRequestParcelable.CREATOR);
                aywc.gr(parcel0);
                aywf aywf0 = new aywf(aywb0, qosTierOverrideRequestParcelable0, aywc.a(AppContextProvider.a()));
                this.a.b(aywf0);
                break;
            }
            case 3: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.android.gms.clearcut.appdoctor.IAppDoctorClearcutLogManagerCallbacks");
                    aywb0 = (iInterface1 instanceof aywb) ? ((aywb)iInterface1) : new aywb(iBinder1);
                }
                QosTierOverrideRequestParcelable qosTierOverrideRequestParcelable1 = (QosTierOverrideRequestParcelable)wbz.a(parcel0, QosTierOverrideRequestParcelable.CREATOR);
                aywc.gr(parcel0);
                aywh aywh0 = new aywh(aywb0, qosTierOverrideRequestParcelable1, aywc.a(AppContextProvider.a()));
                this.a.b(aywh0);
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

