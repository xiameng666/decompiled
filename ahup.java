import android.os.Bundle;
import com.google.android.gms.common.api.ApiMetadata;

public final class ahup implements azys {
    public final ahwl a;
    public final kvi b;
    public final String c;

    public ahup(ahwl ahwl0, kvi kvi0, String s) {
        this.a = ahwl0;
        this.b = kvi0;
        this.c = s;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ahug ahug0 = (ahug)object0;
        ahta ahta0 = new ahta(this.a, ((evqp)object1));
        ahtj ahtj0 = (ahtj)ahug0.H();
        Bundle bundle0 = kvh.a(this.b);
        ApiMetadata apiMetadata0 = cclr.a(ahug0.r);
        ahtj0.n(ahta0, bundle0, this.c, apiMetadata0);
    }
}

