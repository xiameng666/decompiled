import com.google.android.gms.common.api.ApiMetadata;

public final class ahog implements azys {
    public final ahow a;
    public final String b;
    public final ByteString c;
    public final int d;
    public final String e;

    public ahog(ahow ahow0, String s, ByteString hfsf0, int v, String s1) {
        this.a = ahow0;
        this.b = s;
        this.c = hfsf0;
        this.d = v;
        this.e = s1;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        ahnf ahnf0 = (ahnf)object0;
        ahov ahov0 = new ahov(this.a, ((evqp)object1));
        ahnk ahnk0 = (ahnk)ahnf0.H();
        byte[] arr_b = this.c.toByteArray();
        ApiMetadata apiMetadata0 = cclr.a(ahnf0.r);
        ahnk0.a(ahov0, this.b, arr_b, this.d, this.e, apiMetadata0);
    }
}

