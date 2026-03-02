import com.google.android.gms.common.api.ApiMetadata;

public final class bmez implements azys {
    public final bmfn a;
    public final byte[] b;
    public final byte[] c;
    public final bmfu d;

    public bmez(bmfn bmfn0, byte[] arr_b, byte[] arr_b1, bmfu bmfu0) {
        this.a = bmfn0;
        this.b = arr_b;
        this.c = arr_b1;
        this.d = bmfu0;
    }

    @Override  // azys
    public final void d(Object object0, Object object1) {
        bmnu bmnu0 = (bmnu)object0;
        bmfm bmfm0 = new bmfm(this.a, ((evqp)object1));
        bmoa bmoa0 = (bmoa)bmnu0.H();
        ApiMetadata apiMetadata0 = cclr.a(bmnu0.r);
        bmoa0.l(bmfm0, this.b, this.c, this.d, apiMetadata0);
    }
}

