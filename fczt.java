import android.util.Log;
import com.google.android.gms.wearable.internal.ConnectionStateEventParcelable;
import java.util.Set;

public final class fczt {
    public final Set a;
    private static fczt b;

    public fczt() {
        this.a = ggog.l();
    }

    public static fczt a() {
        if(fczt.b == null) {
            fczt.b = new fczt();
        }
        return fczt.b;
    }

    public final void b(int v, String s) {
        ConnectionStateEventParcelable connectionStateEventParcelable0 = new ConnectionStateEventParcelable(v, s);
        if(Log.isLoggable("ConnectionStateService", 3)) {
            Log.d("ConnectionStateService", "onConnectionStateChanged: " + connectionStateEventParcelable0.toString());
        }
        for(Object object0: this.a) {
            ((fcei)object0).a(connectionStateEventParcelable0);
        }
    }
}

