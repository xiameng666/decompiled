import java.util.List;

public final class cyrg implements gfsi {
    public final List a;

    public cyrg(List list0) {
        this.a = list0;
    }

    @Override  // gfsi
    public final Object apply(Object object0) {
        Object object1 = ((ProtoLiteMessage)cyjq.a).w(((ProtoLiteMessage)(((cyjq)object0))));
        if(!object1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)object1).ensureMutable();
        }
        ((cyjq)object1.b_message).l = hfvb.a;
        if(!object1.b_message.isImmutable()) {
            ((ProtoLiteBuilder)object1).ensureMutable();
        }
        cyjq cyjq0 = (cyjq)object1.b_message;
        hfui hfui0 = cyjq0.l;
        if(!hfui0.c()) {
            cyjq0.l = ProtoLiteMessage.D(hfui0);
        }
        hfrj.E(this.a, cyjq0.l);
        return object1;
    }
}

