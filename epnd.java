import java.util.Collection;
import java.util.Map;

final class epnd extends ibsl implements ibtw {
    Object a;
    int b;
    final epnt c;
    final Map d;

    public epnd(epnt epnt0, Map map0, ibrl ibrl0) {
        this.c = epnt0;
        this.d = map0;
        super(2, ibrl0);
    }

    @Override  // ibtw
    public final Object a(Object object0, Object object1) {
        return ((epnd)this.c(((icck)object0), ((ibrl)object1))).jI(ibom.a);
    }

    @Override  // ibsd
    public final ibrl c(Object object0, ibrl ibrl0) {
        return new epnd(this.c, this.d, ibrl0);
    }

    @Override  // ibsd
    public final Object jI(Object object0) {
        Object object2;
        Object object1 = ibrx.a;
        if(this.b != 0) {
            object2 = this.a;
            ibnx.b(object0);
            goto label_18;
        }
        ibnx.b(object0);
        ProtoLiteBuilder hftp0 = (ProtoLiteBuilder)((ProtoLiteMessage)this.c).jf(5, null);
        hftp0.X(((ProtoLiteMessage)this.c));
        if(!((epns)hftp0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((epns)hftp0))).ensureMutable();
        }
        ((epnt)((epns)hftp0).b_message).b = hfvv.a;
        Collection collection0 = this.d.values();
        this.a = (epns)hftp0;
        this.b = 1;
        Object object3 = epom.i(collection0, this);
        if(object3 != object1) {
            object0 = object3;
            object2 = (epns)hftp0;
        label_18:
            ((epns)object2).a(((Iterable)object0));
            Object object4 = ((ProtoLiteBuilder)object2).N_build();
            ibuq.e(object4, "build(...)");
            return object4;
        }
        return object1;
    }
}

