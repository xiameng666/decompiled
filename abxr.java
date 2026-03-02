import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.appdatasearch.GetRecentContextCall.Response;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public interface abxr extends IInterface {
    void a(Status arg1, ParcelFileDescriptor arg2, ApiMetadata arg3);

    void b(GetRecentContextCall.Response arg1, ApiMetadata arg2);

    void c(Status arg1, ApiMetadata arg2);
}

