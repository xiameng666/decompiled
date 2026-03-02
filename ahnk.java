import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.auth.api.fido.AuthenticationOptions;
import com.google.android.gms.auth.api.fido.GetGooglePasskeyForExportRequest;
import com.google.android.gms.auth.api.fido.RegistrationOptions;
import com.google.android.gms.common.api.ApiMetadata;

public interface ahnk extends IInterface {
    void a(advs arg1, String arg2, byte[] arg3, int arg4, String arg5, ApiMetadata arg6);

    void b(ahof arg1, AuthenticationOptions arg2, ApiMetadata arg3);

    void c(ahnw arg1, String arg2, ApiMetadata arg3);

    void d(ahnq arg1, GetGooglePasskeyForExportRequest arg2, ApiMetadata arg3);

    void e(ahof arg1, RegistrationOptions arg2, ApiMetadata arg3);

    void f(ahoc arg1, String arg2, Account arg3, ApiMetadata arg4);

    void g(azxs arg1, String arg2, Account arg3, byte[] arg4, ApiMetadata arg5);

    void h(advs arg1, String arg2, ApiMetadata arg3);

    void i(advs arg1, String arg2, String arg3, ApiMetadata arg4);
}

