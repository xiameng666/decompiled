import com.google.android.gms.dtdi.core.ChannelInfo;

public final class ctsy extends ibsl implements ibtw {
    int a;
    final cttb b;
    final ChannelInfo c;

    public ctsy(cttb cttb0, ChannelInfo channelInfo0, ibrl ibrl0) {
        this.b = cttb0;
        this.c = channelInfo0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((ctsy)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new ctsy(this.b, this.c, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object1 = ibrx.a;
        int v = this.a;
        ibnx.b(object0);
        if(v == 0) {
            icig icig0 = iciv.a(this.b.f.d);
            ctsx ctsx0 = new ctsx(this.b, this.c);
            this.a = 1;
            if(icig0.oR(ctsx0, this) == object1) {
                return object1;
            }
        }
        return ibom.a;
    }
}

