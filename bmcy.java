import android.accounts.Account;
import android.os.IInterface;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.fido.credentialstore.KeyCreationRequestOptions;

public interface bmcy extends IInterface {
    void a(azxs arg1, String arg2, long arg3, ApiMetadata arg4);

    void b(azxs arg1, Account arg2, String arg3, byte[] arg4, ApiMetadata arg5);

    void c(bmde arg1, KeyCreationRequestOptions arg2, ApiMetadata arg3);

    void d(bmde arg1, String arg2, byte[] arg3, ApiMetadata arg4);

    void e(bmdb arg1, Account arg2, String arg3, byte[] arg4, ApiMetadata arg5);

    void f(bmdk arg1, String arg2, ApiMetadata arg3);

    void g(bmdh arg1, String arg2, ApiMetadata arg3);

    void h(azxs arg1, Account arg2, byte[] arg3, ApiMetadata arg4);
}

