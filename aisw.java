import android.content.pm.Signature;
import android.os.IInterface;
import com.google.android.gms.auth.blockstore.restorecredential.CreateRestoreCredentialRequest;
import com.google.android.gms.auth.blockstore.restorecredential.GetRestoreCredentialRequest;

public interface aisw extends IInterface {
    void a(CreateRestoreCredentialRequest arg1, aisn arg2);

    void b(String arg1, Signature[] arg2, aisq arg3);

    void c(GetRestoreCredentialRequest arg1, aist arg2);

    void d(String arg1, Signature[] arg2, byte[] arg3, boolean arg4, aisz arg5);
}

