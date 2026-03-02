import android.app.PendingIntent;
import android.os.IInterface;
import com.google.android.gms.common.api.ApiMetadata;
import com.google.android.gms.common.api.Status;

public interface bmnx extends IInterface {
    void a(Status arg1, ApiMetadata arg2);

    void c(Status arg1, PendingIntent arg2, ApiMetadata arg3);
}

