import com.google.android.gms.common.api.ApiMetadata;

public final class ahvt implements azys {
    public final ahwl a;
    public final Iterable b;
    public final String c;

    public ahvt(ahwl ahwl0, Iterable iterable0, String s) {
        this.a = ahwl0;
        this.b = iterable0;
        this.c = s;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ahug ahug0 = (ahug)object0;
        ahrc ahrc0 = new ahrc(this.a, ((evqp)object1));
        ahtj ahtj0 = (ahtj)ahug0.H();
        gged_interceptors gged0 = gged_interceptors.h(this.b);
        ApiMetadata apiMetadata0 = cclr.a(ahug0.r);
        ahtj0.a(ahrc0, gged0, this.c, apiMetadata0);
    }
}

