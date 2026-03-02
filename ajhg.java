import android.os.IInterface;
import com.google.android.gms.auth.cryptauth.KeyDerivationResult;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public interface ajhg extends IInterface {
    void a(Status arg1, ApiMetadata arg2);

    void b(KeyDerivationResult arg1, ApiMetadata arg2);
}

