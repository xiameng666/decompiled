import android.os.IInterface;
import com.google.android.gms.auth.cryptauth.SignedBlob;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public interface ajik extends IInterface {
    void a(Status arg1, ApiMetadata arg2);

    void c(SignedBlob arg1, ApiMetadata arg2);
}

