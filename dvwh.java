import com.google.android.gms.pay.ProtoSafeParcelable;

public final class dvwh implements evqf {
    public final dvxj a;
    public final String b;

    public dvwh(dvxj dvxj0, String s) {
        this.a = dvxj0;
        this.b = s;
    }

    @Override  // evqf
    public final void gw(Object object0) {
        this.a.aR = gfqx.a;
        this.a.aQ = gfsx.m(this.b);
        gged_interceptors gged0 = fsig.b(((ProtoSafeParcelable)object0));
        this.a.U(gged0, true, gfqx.a);
    }
}

