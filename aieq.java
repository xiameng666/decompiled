import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

public abstract class aieq extends wby implements aier {
    public aieq() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 101: {
                GoogleSignInAccount googleSignInAccount0 = (GoogleSignInAccount)wbz.a(parcel0, GoogleSignInAccount.CREATOR);
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                aieq.gr(parcel0);
                this.d(googleSignInAccount0, status0);
                break;
            }
            case 102: {
                Status status1 = (Status)wbz.a(parcel0, Status.CREATOR);
                aieq.gr(parcel0);
                this.c(status1);
                break;
            }
            case 103: {
                Status status2 = (Status)wbz.a(parcel0, Status.CREATOR);
                aieq.gr(parcel0);
                this.a(status2);
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

