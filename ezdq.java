import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.ApiMetadata;

public final class ezdq extends wby implements cjug, ezdr {
    private final cjts a;
    private final String b;
    private final String c;

    public ezdq() {
        super("com.google.android.gms.trustagent.internal.ITrustedDevicesService");
    }

    public ezdq(cjts cjts0, String s, String s1) {
        super("com.google.android.gms.trustagent.internal.ITrustedDevicesService");
        this.b = s;
        this.c = s1;
        this.a = cjts0;
    }

    @Override  // ezdr
    public final void a(ezdo ezdo0, String s, ApiMetadata apiMetadata0) {
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.fn);
        azuf0.g(bbdq.q);
        azuf0.d(this.b);
        azuf0.c(this.c);
        ezat ezat0 = new ezat(ezdo0, s, azuf0.a());
        this.a.b(ezat0);
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        ezdo ezdo0;
        if(v == 1) {
            IBinder iBinder0 = parcel0.readStrongBinder();
            if(iBinder0 == null) {
                ezdo0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.trustagent.internal.ITrustedDevicesCallbacks");
                ezdo0 = (iInterface0 instanceof ezdo) ? ((ezdo)iInterface0) : new ezdm(iBinder0);
            }
            String s = parcel0.readString();
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            ezdq.gr(parcel0);
            this.a(ezdo0, s, apiMetadata0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

