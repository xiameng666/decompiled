import android.os.IInterface;
import android.os.ParcelFileDescriptor;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public interface bmdb extends IInterface {
    void a(Status arg1, ParcelFileDescriptor arg2, ApiMetadata arg3);
}

