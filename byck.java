import android.app.PendingIntent;
import android.os.IInterface;
import com.google.android.gms.identitycredentials.CreateCredentialResponse;

public interface byck extends IInterface {
    void a(String arg1, String arg2);

    void b(CreateCredentialResponse arg1, PendingIntent arg2);
}

