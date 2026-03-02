import android.content.Intent;
import android.os.IBinder;
import com.google.android.chimera.BoundService;
import java.util.List;

public abstract class cbzb extends BoundService {
    private final IBinder a;

    public cbzb() {
        this.a = new ccei(this);
    }

    public abstract void a(boolean arg1, List arg2, cbzi arg3);

    @Override  // com.google.android.chimera.BoundService
    public final IBinder onBind(Intent intent0) {
        return this.a;
    }
}

