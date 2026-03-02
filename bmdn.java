import com.google.android.gms.common.api.ApiMetadata;

public final class bmdn implements azys {
    public final bmdz a;
    public final String b;
    public final long c;

    public bmdn(bmdz bmdz0, String s, long v) {
        this.a = bmdz0;
        this.b = s;
        this.c = v;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        bmcv bmcv0 = (bmcv)object0;
        bmdw bmdw0 = new bmdw(this.a, ((evqp)object1));
        bmcy bmcy0 = (bmcy)bmcv0.H();
        ApiMetadata apiMetadata0 = cclr.a(bmcv0.r);
        bmcy0.a(bmdw0, this.b, this.c, apiMetadata0);
    }
}

