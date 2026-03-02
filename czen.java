import android.os.Parcel;
import com.google.android.gms.nearby.internal.connection.ReadAuthMessageParams;
import com.google.android.gms.nearby.internal.connection.SendAuthMessageParams;

public abstract class czen extends wby implements czeo {
    public czen() {
        super("com.google.android.gms.nearby.internal.connection.IAuthenticationTransport");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 1: {
                SendAuthMessageParams sendAuthMessageParams0 = (SendAuthMessageParams)wbz.a(parcel0, SendAuthMessageParams.CREATOR);
                czen.gr(parcel0);
                this.c(sendAuthMessageParams0);
                return true;
            }
            case 2: {
                ReadAuthMessageParams readAuthMessageParams0 = (ReadAuthMessageParams)wbz.a(parcel0, ReadAuthMessageParams.CREATOR);
                czen.gr(parcel0);
                this.a(readAuthMessageParams0);
                return true;
            }
            default: {
                return false;
            }
        }
    }
}

