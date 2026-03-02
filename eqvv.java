import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.smartdevice.postsetup.ConnectionHint;
import com.google.android.gms.smartdevice.postsetup.HandshakeData;
import com.google.android.gms.smartdevice.postsetup.PostSetupAuthData;
import com.google.android.gms.smartdevice.postsetup.StartServiceResponse;

public class eqvv extends wby implements eqvw {
    public eqvv() {
        super("com.google.android.gms.smartdevice.postsetup.internal.IPostSetupPairCallbacks");
    }

    @Override  // eqvw
    public void a(Status status0, StartServiceResponse startServiceResponse0) {
    }

    @Override  // eqvw
    public final void b(Status status0) {
    }

    @Override  // eqvw
    public void c(Status status0, ConnectionHint connectionHint0) {
    }

    @Override  // eqvw
    public void d(Status status0, HandshakeData handshakeData0) {
    }

    @Override  // eqvw
    public void e(Status status0, PostSetupAuthData postSetupAuthData0) {
    }

    @Override  // eqvw
    public final void f(Status status0, Bundle bundle0) {
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                ConnectionHint connectionHint0 = (ConnectionHint)wbz.a(parcel0, ConnectionHint.CREATOR);
                eqvv.gr(parcel0);
                this.c(status0, connectionHint0);
                return true;
            }
            case 2: {
                Status status1 = (Status)wbz.a(parcel0, Status.CREATOR);
                HandshakeData handshakeData0 = (HandshakeData)wbz.a(parcel0, HandshakeData.CREATOR);
                eqvv.gr(parcel0);
                return true;
            }
            case 3: {
                Status status2 = (Status)wbz.a(parcel0, Status.CREATOR);
                HandshakeData handshakeData1 = (HandshakeData)wbz.a(parcel0, HandshakeData.CREATOR);
                eqvv.gr(parcel0);
                this.d(status2, handshakeData1);
                return true;
            }
            case 4: {
                Status status3 = (Status)wbz.a(parcel0, Status.CREATOR);
                HandshakeData handshakeData2 = (HandshakeData)wbz.a(parcel0, HandshakeData.CREATOR);
                eqvv.gr(parcel0);
                return true;
            }
            case 5: {
                Status status4 = (Status)wbz.a(parcel0, Status.CREATOR);
                PostSetupAuthData postSetupAuthData0 = (PostSetupAuthData)wbz.a(parcel0, PostSetupAuthData.CREATOR);
                eqvv.gr(parcel0);
                this.e(status4, postSetupAuthData0);
                return true;
            }
            case 6: {
                Status status5 = (Status)wbz.a(parcel0, Status.CREATOR);
                Bundle bundle0 = (Bundle)wbz.a(parcel0, Bundle.CREATOR);
                eqvv.gr(parcel0);
                return true;
            }
            case 7: {
                Status status6 = (Status)wbz.a(parcel0, Status.CREATOR);
                eqvv.gr(parcel0);
                return true;
            }
            case 8: {
                Status status7 = (Status)wbz.a(parcel0, Status.CREATOR);
                StartServiceResponse startServiceResponse0 = (StartServiceResponse)wbz.a(parcel0, StartServiceResponse.CREATOR);
                eqvv.gr(parcel0);
                this.a(status7, startServiceResponse0);
                return true;
            }
            case 9: {
                Status status8 = (Status)wbz.a(parcel0, Status.CREATOR);
                eqvv.gr(parcel0);
                return true;
            }
            default: {
                return false;
            }
        }
    }

    @Override  // eqvw
    public final void g(Status status0) {
    }

    @Override  // eqvw
    public final void h(Status status0, HandshakeData handshakeData0) {
    }

    @Override  // eqvw
    public final void i(Status status0, HandshakeData handshakeData0) {
    }
}

