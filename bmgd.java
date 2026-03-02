import android.os.IInterface;
import com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredential;

public interface bmgd extends IInterface {
    void a();

    void b(blyu arg1, int arg2);

    void c(AuthenticatorErrorResponse arg1);

    void d(PublicKeyCredential arg1);

    void e(String arg1);
}

