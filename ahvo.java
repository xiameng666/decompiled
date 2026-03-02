import com.google.android.gms.auth.api.identity.SavePasswordRequest;
import com.google.android.gms.common.api.ApiMetadata;

public final class ahvo implements azys {
    public final ahwl a;
    public final SavePasswordRequest b;
    public final String c;
    public final String d;

    public ahvo(ahwl ahwl0, SavePasswordRequest savePasswordRequest0, String s, String s1) {
        this.a = ahwl0;
        this.b = savePasswordRequest0;
        this.c = s;
        this.d = s1;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ahug ahug0 = (ahug)object0;
        ahtt ahtt0 = new ahtt(this.a, ((evqp)object1));
        ahtj ahtj0 = (ahtj)ahug0.H();
        ApiMetadata apiMetadata0 = cclr.a(ahug0.r);
        ahtj0.v(ahtt0, this.b, this.c, this.d, apiMetadata0);
    }
}

