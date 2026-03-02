import android.app.Service;
import android.content.Intent;
import android.os.IBinder;

public class kyr extends Service {
    @Override  // android.app.Service
    public final IBinder onBind(Intent intent0) {
        if(intent0 != null) {
            kyj kyj0 = (kyj)kyk.a(intent0, "androidx.credentials.providerevents.service.DEVICE_SETUP_PROVIDER_KEY");
            return kyj0 == null ? null : kyj0.a();
        }
        return null;
    }
}

