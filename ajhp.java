import android.os.IInterface;
import com.google.android.gms.auth.cryptauth.KeyHandleResult;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public interface ajhp extends IInterface {
    void a(Status arg1, ApiMetadata arg2);

    void b(KeyHandleResult arg1, ApiMetadata arg2);
}

