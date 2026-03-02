import android.accounts.Account;
import android.os.Bundle;
import android.os.IInterface;
import com.google.android.gms.auth.api.identity.BeginSignInRequest;
import com.google.android.gms.auth.api.identity.CallerVerificationRequest;
import com.google.android.gms.auth.api.identity.CallingAppInfoCompat;
import com.google.android.gms.auth.api.identity.InternalSignInCredentialWrapper;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.common.api.ApiMetadata;
import java.util.List;

public interface ahtj extends IInterface {
    void A(azxs arg1, SavePasswordRequest arg2, List arg3, String arg4, ApiMetadata arg5);

    void B(azxs arg1, String arg2, boolean arg3, String arg4, ApiMetadata arg5);

    void C(azxs arg1, Account arg2, String arg3, boolean arg4, String arg5, ApiMetadata arg6);

    void D(azxs arg1, String arg2, ApiMetadata arg3);

    void E(ahue arg1, List arg2, String arg3, ApiMetadata arg4);

    void F(azxs arg1, String arg2, String arg3, Account arg4, ApiMetadata arg5);

    void G(azxs arg1, List arg2, int arg3, String arg4, ApiMetadata arg5);

    void H(azxs arg1, InternalSignInCredentialWrapper arg2, CallingAppInfoCompat arg3, String arg4, ApiMetadata arg5);

    void I(azxs arg1, CallerVerificationRequest arg2, ApiMetadata arg3);

    void a(ahrd arg1, List arg2, String arg3, ApiMetadata arg4);

    void b(azxs arg1, SaveAccountLinkingTokenRequest arg2, String arg3, String arg4, Account arg5, String arg6, ApiMetadata arg7);

    void c(ahro arg1, String arg2, String arg3, String arg4, String arg5, InternalSignInCredentialWrapper arg6, String arg7, String arg8, int arg9, ApiMetadata arg10, String arg11, List arg12);

    void d(azxs arg1, Account arg2, List arg3, String arg4, BeginSignInRequest arg5, ApiMetadata arg6);

    void e(ahsa arg1, SaveAccountLinkingTokenRequest arg2, Account arg3, String arg4, ApiMetadata arg5);

    void f(ahsd arg1, String arg2, String arg3, ApiMetadata arg4);

    void g(ahsd arg1, String arg2, String arg3, ApiMetadata arg4);

    void h(ahsg arg1, Bundle arg2, ApiMetadata arg3);

    void i(ahsj arg1, Account arg2, String arg3, String arg4, int arg5, List arg6, ApiMetadata arg7);

    void j(ahsm arg1, Account arg2, String arg3, String arg4, ApiMetadata arg5);

    void k(ahsp arg1, CallerVerificationRequest arg2, ApiMetadata arg3);

    void l(ahss arg1, String arg2, String arg3, ApiMetadata arg4);

    void m(ahsy arg1, String arg2, String arg3, ApiMetadata arg4);

    void n(ahtb arg1, Bundle arg2, String arg3, ApiMetadata arg4);

    void o(ahtg arg1, String arg2, ApiMetadata arg3);

    void p(ahto arg1, String arg2, String arg3, String arg4, List arg5, ApiMetadata arg6);

    void q(ahtr arg1, String arg2, BeginSignInRequest arg3, boolean arg4, ApiMetadata arg5);

    void v(ahtu arg1, SavePasswordRequest arg2, String arg3, String arg4, ApiMetadata arg5);

    void w(azxs arg1, String arg2, String arg3, ApiMetadata arg4);

    void x(azxs arg1, Account arg2, ApiMetadata arg3);

    void y(azxs arg1, String arg2, String arg3, Account arg4, int arg5, ApiMetadata arg6, String arg7);

    void z(azxs arg1, String arg2, String arg3, ApiMetadata arg4);
}

