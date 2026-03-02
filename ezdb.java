import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.chimera.modules.trustagent.AppContextProvider;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public final class ezdb extends wby implements cjug, ezdc {
    private final cjts a;
    private final String b;
    private final String c;

    public ezdb() {
        super("com.google.android.gms.trustagent.internal.IBridgeApi");
    }

    public ezdb(cjts cjts0, String s, String s1) {
        super("com.google.android.gms.trustagent.internal.IBridgeApi");
        this.b = s;
        this.c = s1;
        this.a = cjts0;
    }

    @Override  // ezdc
    public final basb a(ezdf ezdf0, int v, Bundle bundle0, ApiMetadata apiMetadata0) {
        ezan ezan0;
        azuf azuf0 = azug.b(apiMetadata0);
        azuf0.e(bbdp.fn);
        azuf0.g(bbdq.q);
        azuf0.d(this.b);
        azuf0.c(this.c);
        azug azug0 = azuf0.a();
        switch(v) {
            case 2: {
                ezan0 = new ezan(new ezcg(ezcl.a(AppContextProvider.a())), ezdf0, bundle0, azug0);
                break;
            }
            case 3: {
                ezan0 = new ezaq(ezdf0, bundle0, azug0);
                break;
            }
            case 4: {
                ezan0 = new ezar(ezdf0, bundle0, azug0);
                break;
            }
            default: {
                ezan0 = null;
            }
        }
        if(ezan0 == null) {
            try {
                ezdf0.a(new Status(8, "Invalid operation."), null, ApiMetadata.b);
            }
            catch(RemoteException unused_ex) {
            }
            return null;
        }
        this.a.b(ezan0);
        return ezan0.b;
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        ezdf ezdf0;
        if(v == 1) {
            IBinder iBinder0 = parcel0.readStrongBinder();
            if(iBinder0 == null) {
                ezdf0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.trustagent.internal.IBridgeCallbacks");
                ezdf0 = (iInterface0 instanceof ezdf) ? ((ezdf)iInterface0) : new ezdd(iBinder0);
            }
            int v1 = parcel0.readInt();
            Bundle bundle0 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
            ApiMetadata apiMetadata0 = (ApiMetadata)wbz.a(parcel0, ApiMetadata.CREATOR);
            ezdb.gr(parcel0);
            basb basb0 = this.a(ezdf0, v1, bundle0, apiMetadata0);
            parcel1.writeNoException();
            wbz.h(parcel1, basb0);
            return true;
        }
        return false;
    }
}

