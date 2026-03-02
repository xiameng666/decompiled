import android.os.IInterface;
import com.google.android.gms.carrierauth.EAPAKAResponse;
import com.google.android.gms.carrierauth.EapInfoResponse;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public interface atqu extends IInterface {
    void a(Status arg1, EAPAKAResponse arg2, ApiMetadata arg3);

    void b(Status arg1, EapInfoResponse arg2, ApiMetadata arg3);
}

