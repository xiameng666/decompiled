import android.os.IInterface;
import com.google.android.gms.auth.cryptauth.CryptauthPublicKey;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public interface ajie extends IInterface {
    void a(Status arg1, ApiMetadata arg2);

    void b(CryptauthPublicKey arg1, ApiMetadata arg2);
}

