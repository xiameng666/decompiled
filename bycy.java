import android.os.Parcel;
import com.google.android.gms.identitycredentials.SignalCredentialStateResponse;

public final class bycy extends wby implements bycz {
    public bycy() {
        super("com.google.android.gms.identitycredentials.provider.ISignalCredentialStateCallbacks");
    }

    @Override  // bycz
    public final void a(String s, String s1) {
        ibuq.f(s, "errorType");
        ibuq.f(s1, "message");
    }

    @Override  // bycz
    public final void b(SignalCredentialStateResponse signalCredentialStateResponse0) {
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                SignalCredentialStateResponse signalCredentialStateResponse0 = (SignalCredentialStateResponse)wbz.a(parcel0, SignalCredentialStateResponse.CREATOR);
                bycy.gr(parcel0);
                break;
            }
            case 2: {
                String s = parcel0.readString();
                String s1 = parcel0.readString();
                bycy.gr(parcel0);
                this.a(s, s1);
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

