import android.os.IInterface;
import com.google.android.gms.auth.cryptauth.SignCryptedBlob;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public interface ajih extends IInterface {
    void a(Status arg1, ApiMetadata arg2);

    void b(SignCryptedBlob arg1, ApiMetadata arg2);
}

