import android.os.IInterface;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions;
import com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRequestOptions;

public interface bmns extends IInterface {
    void a(bmnp arg1, PublicKeyCredentialCreationOptions arg2);

    void b(bmnp arg1, PublicKeyCredentialRequestOptions arg2);

    void c(bmfy arg1);

    void d(bmfy arg1, String arg2, byte[] arg3);
}

