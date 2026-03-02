import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.identity.intents.UserAddressRequest;

public final class bxro extends wby implements IInterface, cjug {
    public final Context a;
    public final fbvw b;
    public final String c;

    public bxro() {
        super("com.google.android.gms.identity.intents.internal.IAddressService");
    }

    public bxro(Context context0, fbvw fbvw0, String s) {
        super("com.google.android.gms.identity.intents.internal.IAddressService");
        this.a = context0;
        this.b = fbvw0;
        this.c = s;
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        bxrn bxrn0;
        if(v == 2) {
            IBinder iBinder0 = parcel0.readStrongBinder();
            if(iBinder0 == null) {
                bxrn0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.identity.intents.internal.IAddressCallbacks");
                bxrn0 = (iInterface0 instanceof bxrn) ? ((bxrn)iInterface0) : new bxrn(iBinder0);
            }
            UserAddressRequest userAddressRequest0 = (UserAddressRequest)wbz.a(parcel0, UserAddressRequest.CREATOR);
            Bundle bundle0 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
            bxro.gr(parcel0);
            new fboz(this, bundle0, userAddressRequest0, bxrn0).execute(new Void[0]);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

