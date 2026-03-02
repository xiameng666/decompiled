import android.os.IInterface;
import com.google.android.gms.asterism.GetAsterismConsentResponse;
import com.google.android.gms.asterism.SetAsterismConsentResponse;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public interface acoy extends IInterface {
    void a(Status arg1, GetAsterismConsentResponse arg2, ApiMetadata arg3);

    void c(Status arg1, SetAsterismConsentResponse arg2, ApiMetadata arg3);

    void d(Status arg1, boolean arg2, ApiMetadata arg3);
}

