import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.common.api.ApiMetadata;
import java.util.List;

public final class ahuw implements azys {
    public final ahwl a;
    public final SavePasswordRequest b;
    public final List c;
    public final String d;

    public ahuw(ahwl ahwl0, SavePasswordRequest savePasswordRequest0, List list0, String s) {
        this.a = ahwl0;
        this.b = savePasswordRequest0;
        this.c = list0;
        this.d = s;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ahug ahug0 = (ahug)object0;
        ahwk ahwk0 = new ahwk(this.a, ((evqp)object1));
        ahtj ahtj0 = (ahtj)ahug0.H();
        ApiMetadata apiMetadata0 = cclr.a(ahug0.r);
        ahtj0.A(ahwk0, this.b, this.c, this.d, apiMetadata0);
    }
}

