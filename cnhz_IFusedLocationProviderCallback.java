import android.os.IInterface;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.location.internal.FusedLocationProviderResult;

public interface cnhz_IFusedLocationProviderCallback extends IInterface {
    void a(FusedLocationProviderResult arg1, ApiMetadata arg2);

    void b(ApiMetadata arg1);
}

