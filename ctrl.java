import com.google.android.gms.dtdi.core.ChannelInfo;

final class ctrl implements icih {
    final ctrq a;
    final ChannelInfo b;

    public ctrl(ctrq ctrq0, ChannelInfo channelInfo0) {
        this.a = ctrq0;
        this.b = channelInfo0;
        super();
    }

    @Override  // icih
    public final Object a(Object object0, ibrl ibrl0) {
        ctrq ctrq0 = this.a;
        if(!ibuq.m(ctrq0.k.b(), ctor.a)) {
            return ibom.a;
        }
        ibuq.c(this.b);
        evql evql0 = ctrq0.b.d(this.b, ctrq0.a.a, ((byte[])object0));
        evql0.b(new ctrj(new ctri()));
        evql0.A(new ctrk(ctrq0));
        return ibom.a;
    }
}

