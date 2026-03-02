import com.google.android.gms.common.api.ApiMetadata;

public final class aqgb implements azys {
    public final aqgg a;
    public final long b;
    public final String c;

    public aqgb(aqgg aqgg0, long v) {
        this.a = aqgg0;
        this.b = v;
        this.c = "com.google.android.gms.romanesco";
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        asae asae0 = (asae)object0;
        aqgf aqgf0 = new aqgf(this.a, ((evqp)object1));
        asav asav0 = (asav)asae0.H();
        ApiMetadata apiMetadata0 = cclr.a(asae0.r);
        asav0.e(aqgf0, this.b, this.c, apiMetadata0);
    }
}

