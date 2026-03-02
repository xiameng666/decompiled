import java.util.List;

public final class dpiu implements bboe {
    public final List a;

    public dpiu(List list0) {
        this.a = list0;
    }

    @Override  // bboe
    public final Object a(Object object0) {
        if(!((dpdv)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((dpdv)object0))).ensureMutable();
        }
        ((dpeb)((dpdv)object0).b_message).o = hfvv.a;
        if(!((dpdv)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)(((dpdv)object0))).ensureMutable();
        }
        dpeb dpeb0 = (dpeb)((dpdv)object0).b_message;
        hfuo hfuo0 = dpeb0.o;
        if(!hfuo0.c()) {
            dpeb0.o = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(this.a, dpeb0.o);
        return (dpdv)object0;
    }
}

