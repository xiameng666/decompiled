import android.app.PendingIntent;
import android.os.IInterface;
import com.google.android.gms.common.api.Status;

public interface etae extends IInterface {
    void a(Status arg1, String arg2);

    void b(Status arg1, PendingIntent arg2);

    void c(Status arg1, String arg2);
}

