import android.os.Binder;
import android.os.Bundle;
import com.google.android.gms.common.internal.GetServiceRequest;
import java.util.HashMap;
import java.util.Map;

public final class bwrm implements cjuo {
    public static final Map a;
    public final bxav b;
    public final boolean c;
    public final String d;

    static {
        bwrm.a = new HashMap();
    }

    public bwrm(bxav bxav0, boolean z, String s) {
        this.b = bxav0;
        this.c = z;
        this.d = s;
    }

    @Override  // cjuo
    public final void a(cjtn cjtn0, GetServiceRequest getServiceRequest0) {
        bxav bxav0 = this.b;
        if(bxav0 == null) {
            bwne.a("AppIndexingService is unavailable on this device");
            cjtn0.b(16, null, new Bundle());
            return;
        }
        String s = getServiceRequest0.f;
        int v = getServiceRequest0.e;
        int v1 = Binder.getCallingUid();
        bwrl bwrl0 = new bwrl(this, gltq.t, s, cjtn0, s, v, v1, getServiceRequest0);
        bxav0.c.h(bwrl0);
    }
}

