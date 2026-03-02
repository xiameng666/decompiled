import android.content.Context;
import java.util.ArrayList;
import java.util.List;

public final class ezfi {
    public final gged_interceptors a;
    public final Object b;
    public final Context c;
    public final List d;

    public ezfi(Context context0) {
        this.a = gged_interceptors.n(new ezfh("com.google.android.gms.trustlet.bluetooth.service.BIND", hzca.c()), new ezfh("com.google.android.gms.trustlet.onbody.service.BIND", hzcm.d()), new ezfh("com.google.android.gms.trustlet.place.service.BIND", hzcr.c()));
        this.b = new Object();
        this.d = new ArrayList();
        this.c = context0;
    }
}

