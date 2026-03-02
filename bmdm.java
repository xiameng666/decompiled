import com.google.android.gms.common.api.ApiMetadata;

public final class bmdm implements azys {
    public final bmdz a;
    public final String b;

    public bmdm(bmdz bmdz0, String s) {
        this.a = bmdz0;
        this.b = s;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        bmcv bmcv0 = (bmcv)object0;
        bmdg bmdg0 = new bmdg(this.a, ((evqp)object1));
        bmcy bmcy0 = (bmcy)bmcv0.H();
        ApiMetadata apiMetadata0 = cclr.a(bmcv0.r);
        bmcy0.g(bmdg0, this.b, apiMetadata0);
    }
}

