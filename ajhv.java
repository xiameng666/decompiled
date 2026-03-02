import android.os.IInterface;
import com.google.android.gms.auth.cryptauth.KeyInvalidationResult;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public interface ajhv extends IInterface {
    void a(Status arg1, ApiMetadata arg2);

    void b(KeyInvalidationResult arg1, ApiMetadata arg2);
}

