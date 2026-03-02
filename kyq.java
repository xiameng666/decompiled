import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class kyq extends Service {
    public void a(kys kys0, kyo kyo0) {
        throw null;
    }

    public void b(kwv kwv0, kyn kyn0) {
        throw null;
    }

    @Override  // android.app.Service
    public IBinder onBind(Intent intent0) {
        return intent0 == null || ((kyp)kyk.a(intent0, "androidx.credentials.providerevents.service.EVENTS_SERVICE_PROVIDER_KEY")) == null ? null : kyp.a(this);
    }
}

