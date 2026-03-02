import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Process;
import com.google.android.gms.dynamiclinks.service.DynamicLinksApiChimeraService;

public final class gpck extends wby implements cjug, gpcl {
    private final DynamicLinksApiChimeraService a;
    private final cjts b;
    private final String c;
    private final int d;

    public gpck() {
        super("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
    }

    public gpck(DynamicLinksApiChimeraService dynamicLinksApiChimeraService0, cjts cjts0, String s, int v) {
        super("com.google.firebase.dynamiclinks.internal.IDynamicLinksService");
        this.a = dynamicLinksApiChimeraService0;
        this.b = cjts0;
        this.c = s;
        this.d = v;
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        gpci gpci0 = null;
        switch(v) {
            case 1: {
                IBinder iBinder0 = parcel0.readStrongBinder();
                if(iBinder0 != null) {
                    IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
                    gpci0 = (iInterface0 instanceof gpci) ? ((gpci)iInterface0) : new gpci(iBinder0);
                }
                String s = parcel0.readString();
                gpck.gr(parcel0);
                baqr baqr0 = new baqr();
                baqr0.a = Process.myUid();
                baqr0.d = this.c;
                baqr0.e = "com.google.android.gms";
                bjhj bjhj0 = new bjhj(gpci0, s, baqr0, bjhe.a(this.a), this.d);
                this.b.b(bjhj0);
                break;
            }
            case 2: {
                IBinder iBinder1 = parcel0.readStrongBinder();
                if(iBinder1 != null) {
                    IInterface iInterface1 = iBinder1.queryLocalInterface("com.google.firebase.dynamiclinks.internal.IDynamicLinksCallbacks");
                    gpci0 = (iInterface1 instanceof gpci) ? ((gpci)iInterface1) : new gpci(iBinder1);
                }
                Bundle bundle0 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                gpck.gr(parcel0);
                bjhh bjhh0 = new bjhh(gpci0, this.c, bundle0);
                this.b.b(bjhh0);
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

