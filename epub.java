import android.os.IInterface;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.signin.internal.AuthAccountResult;
import com.google.android.gms.signin.internal.RecordConsentByConsentResultResponse;
import com.google.android.gms.signin.internal.SignInResponse;

public interface epub extends IInterface {
    void a(SignInResponse arg1);

    void c(Status arg1, GoogleSignInAccount arg2);

    void d(Status arg1);

    void e(Status arg1);

    void f(ConnectionResult arg1, AuthAccountResult arg2);

    void kB(RecordConsentByConsentResultResponse arg1);
}

