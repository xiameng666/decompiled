import android.os.Parcel;
import com.google.android.gms.mdocstore.DisconnectionCause;
import com.google.android.gms.mdocstore.PresentationRequest;

public abstract class cqxy extends wby implements cqxz {
    public cqxy() {
        super("com.google.android.gms.mdocstore.internal.IPresentationCallbacks");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 2: {
                String s = parcel0.readString();
                cqxy.gr(parcel0);
                this.c(s);
                return true;
            }
            case 3: {
                PresentationRequest presentationRequest0 = (PresentationRequest)wbz.a(parcel0, PresentationRequest.CREATOR);
                cqxy.gr(parcel0);
                this.d(presentationRequest0);
                return true;
            }
            case 4: {
                DisconnectionCause disconnectionCause0 = (DisconnectionCause)wbz.a(parcel0, DisconnectionCause.CREATOR);
                cqxy.gr(parcel0);
                this.a(disconnectionCause0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

