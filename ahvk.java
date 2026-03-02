import com.google.android.gms.common.api.ApiMetadata;
import java.util.List;

public final class ahvk implements azys {
    public final ahwl a;
    public final String b;
    public final String c;
    public final String d;
    public final List e;

    public ahvk(ahwl ahwl0, String s, String s1, String s2, List list0) {
        this.a = ahwl0;
        this.b = s;
        this.c = s1;
        this.d = s2;
        this.e = list0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ahug ahug0 = (ahug)object0;
        ahtn ahtn0 = new ahtn(this.a, ((evqp)object1));
        ahtj ahtj0 = (ahtj)ahug0.H();
        ApiMetadata apiMetadata0 = cclr.a(ahug0.r);
        ahtj0.p(ahtn0, this.b, this.c, this.d, this.e, apiMetadata0);
    }
}

