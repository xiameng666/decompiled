import android.os.IInterface;
import com.google.android.gms.auth.cryptauth.KeyInfoResult;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public interface ajhs extends IInterface {
    void a(Status arg1, ApiMetadata arg2);

    void b(KeyInfoResult arg1, ApiMetadata arg2);
}

