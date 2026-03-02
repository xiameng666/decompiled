import android.os.IInterface;
import com.google.android.gms.auth.cryptauth.ExportedSymmetricKey;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public interface ajha extends IInterface {
    void a(Status arg1, ApiMetadata arg2);

    void c(ExportedSymmetricKey arg1, ApiMetadata arg2);
}

