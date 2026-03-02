import android.os.Parcel;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.AuthAccountResult;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultResponse;
import com.google.android.gms.signin.internal.SignInResponse;

public class epua extends wby implements epub {
    public epua() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override  // epub
    public void a(SignInResponse signInResponse0) {
    }

    @Override  // epub
    public void c(Status status0, GoogleSignInAccount googleSignInAccount0) {
    }

    @Override  // epub
    public void d(Status status0) {
    }

    @Override  // epub
    public void e(Status status0) {
    }

    @Override  // epub
    public void f(ConnectionResult connectionResult0, AuthAccountResult authAccountResult0) {
    }

    @Override  // wby
    public final boolean fj_onTransact(int v, Parcel parcel0, Parcel parcel1) {
        switch(v) {
            case 3: {
                ConnectionResult connectionResult0 = (ConnectionResult)wbz.a(parcel0, ConnectionResult.CREATOR);
                AuthAccountResult authAccountResult0 = (AuthAccountResult)wbz.a(parcel0, AuthAccountResult.CREATOR);
                epua.gr(parcel0);
                this.f(connectionResult0, authAccountResult0);
                break;
            }
            case 4: {
                Status status0 = (Status)wbz.a(parcel0, Status.CREATOR);
                epua.gr(parcel0);
                this.d(status0);
                break;
            }
            case 6: {
                Status status1 = (Status)wbz.a(parcel0, Status.CREATOR);
                epua.gr(parcel0);
                this.e(status1);
                break;
            }
            case 7: {
                Status status2 = (Status)wbz.a(parcel0, Status.CREATOR);
                GoogleSignInAccount googleSignInAccount0 = (GoogleSignInAccount)wbz.a(parcel0, GoogleSignInAccount.CREATOR);
                epua.gr(parcel0);
                this.c(status2, googleSignInAccount0);
                break;
            }
            case 8: {
                SignInResponse signInResponse0 = (SignInResponse)wbz.a(parcel0, SignInResponse.CREATOR);
                epua.gr(parcel0);
                this.a(signInResponse0);
                break;
            }
            case 9: {
                RecordConsentByConsentResultResponse recordConsentByConsentResultResponse0 = (RecordConsentByConsentResultResponse)wbz.a(parcel0, RecordConsentByConsentResultResponse.CREATOR);
                epua.gr(parcel0);
                this.kB(recordConsentByConsentResultResponse0);
                break;
            }
            default: {
                return false;
            }
        }
        parcel1.writeNoException();
        return true;
    }

    @Override  // epub
    public void kB(RecordConsentByConsentResultResponse recordConsentByConsentResultResponse0) {
    }
}

