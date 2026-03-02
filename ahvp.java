import com.google.android.gms.common.api.ApiMetadata;
import java.util.List;

public final class ahvp implements azys {
    public final ahwl a;
    public final List b;
    public final String c;

    public ahvp(ahwl ahwl0, List list0, String s) {
        this.a = ahwl0;
        this.b = list0;
        this.c = s;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ahug ahug0 = (ahug)object0;
        ahud ahud0 = new ahud(this.a, ((evqp)object1));
        ahtj ahtj0 = (ahtj)ahug0.H();
        ApiMetadata apiMetadata0 = cclr.a(ahug0.r);
        ahtj0.E(ahud0, this.b, this.c, apiMetadata0);
    }
}

