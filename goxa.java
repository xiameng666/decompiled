import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.PhoneAuthCredential;
import com.google.firebase.auth.api.aidlresponses.OnFailedMfaSignInAidlResponse;
import com.google.firebase.auth.api.model.GetAccountInfoUser;
import com.google.firebase.auth.api.model.GetTokenResponse;
import com.google.firebase.auth.api.model.ResetPasswordResponse;

public class goxa {
    public final baun b;
    public final goxg c;

    public goxa(goxg goxg0, baun baun0) {
        batl.s(goxg0);
        this.c = goxg0;
        this.b = baun0;
    }

    public void a(String s) {
        try {
            Parcel parcel0 = this.c.jo();
            parcel0.writeString(s);
            this.c.jq(9, parcel0);
        }
        catch(RemoteException remoteException0) {
            this.b.g("RemoteException when sending send verification code response.", remoteException0, new Object[0]);
        }
    }

    public void b(Status status0) {
        try {
            this.c.a(status0);
        }
        catch(RemoteException remoteException0) {
            this.b.g("RemoteException when sending failure result.", remoteException0, new Object[0]);
        }
    }

    public final void c(OnFailedMfaSignInAidlResponse onFailedMfaSignInAidlResponse0) {
        try {
            Parcel parcel0 = this.c.jo();
            wbz.f(parcel0, onFailedMfaSignInAidlResponse0);
            this.c.jq(15, parcel0);
        }
        catch(RemoteException remoteException0) {
            this.b.g("RemoteException when sending failure result for mfa", remoteException0, new Object[0]);
        }
    }

    public final void d(GetTokenResponse getTokenResponse0, GetAccountInfoUser getAccountInfoUser0) {
        try {
            Parcel parcel0 = this.c.jo();
            wbz.f(parcel0, getTokenResponse0);
            wbz.f(parcel0, getAccountInfoUser0);
            this.c.jq(2, parcel0);
        }
        catch(RemoteException remoteException0) {
            this.b.g("RemoteException when sending get token and account info user response", remoteException0, new Object[0]);
        }
    }

    public final void e(ResetPasswordResponse resetPasswordResponse0) {
        try {
            Parcel parcel0 = this.c.jo();
            wbz.f(parcel0, resetPasswordResponse0);
            this.c.jq(4, parcel0);
        }
        catch(RemoteException remoteException0) {
            this.b.g("RemoteException when sending password reset response.", remoteException0, new Object[0]);
        }
    }

    public final void f(PhoneAuthCredential phoneAuthCredential0) {
        try {
            Parcel parcel0 = this.c.jo();
            wbz.f(parcel0, phoneAuthCredential0);
            this.c.jq(10, parcel0);
        }
        catch(RemoteException remoteException0) {
            this.b.g("RemoteException when sending verification completed response.", remoteException0, new Object[0]);
        }
    }
}

