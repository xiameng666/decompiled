import com.google.android.gms.common.api.ApiMetadata;

public final class bmdp implements azys {
    public final bmdz a;
    public final String b;
    public final byte[] c;

    public bmdp(bmdz bmdz0, String s, byte[] arr_b) {
        this.a = bmdz0;
        this.b = s;
        this.c = arr_b;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        bmcv bmcv0 = (bmcv)object0;
        bmdu bmdu0 = new bmdu(this.a, ((evqp)object1));
        bmcy bmcy0 = (bmcy)bmcv0.H();
        ApiMetadata apiMetadata0 = cclr.a(bmcv0.r);
        bmcy0.d(bmdu0, this.b, this.c, apiMetadata0);
    }
}

