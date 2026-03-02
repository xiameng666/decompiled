import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.auth.api.phone.IncomingCallRetrieverRequest;

public abstract class ahyb extends wby implements ahyc {
    public ahyb() {
        super("com.google.android.gms.auth.api.phone.internal.IMissedCallRetrieverService");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        ahya ahya0;
        if(v == 1) {
            IBinder iBinder0 = parcel0.readStrongBinder();
            if(iBinder0 == null) {
                ahya0 = null;
            }
            else {
                IInterface iInterface0 = iBinder0.queryLocalInterface("com.google.android.gms.auth.api.phone.internal.IMissedCallRetrieverCallbacks");
                ahya0 = (iInterface0 instanceof ahya) ? ((ahya)iInterface0) : new ahya(iBinder0);
            }
            IncomingCallRetrieverRequest incomingCallRetrieverRequest0 = (IncomingCallRetrieverRequest)wbz.a(parcel0, IncomingCallRetrieverRequest.CREATOR);
            ahyb.gr(parcel0);
            this.a(ahya0, incomingCallRetrieverRequest0);
            parcel1.writeNoException();
            return true;
        }
        return false;
    }
}

