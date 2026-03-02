import com.google.android.gms.common.api.ApiMetadata;

public final class ahvd implements azys {
    public final ahwl a;
    public final Iterable b;
    public final int c;
    public final String d;

    public ahvd(ahwl ahwl0, Iterable iterable0, int v, String s) {
        this.a = ahwl0;
        this.b = iterable0;
        this.c = v;
        this.d = s;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ahug ahug0 = (ahug)object0;
        ahwc ahwc0 = new ahwc(this.a, ((evqp)object1));
        ahtj ahtj0 = (ahtj)ahug0.H();
        gged_interceptors gged0 = gged_interceptors.h(this.b);
        ApiMetadata apiMetadata0 = cclr.a(ahug0.r);
        ahtj0.G(ahwc0, gged0, this.c, this.d, apiMetadata0);
    }
}

