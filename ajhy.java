import android.os.IInterface;
import com.google.android.gms.auth.cryptauth.KeyRegistrationResult;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public interface ajhy extends IInterface {
    void a(Status arg1, ApiMetadata arg2);

    void b(KeyRegistrationResult arg1, ApiMetadata arg2);
}

