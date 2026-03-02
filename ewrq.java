import j..util.Collection.-EL;
import j..util.DesugarCollections;
import java.util.ArrayList;

public final class ewrq implements gfsi {
    @Override  // gfsi
    public final Object apply(Object object0) {
        ArrayList arrayList0 = new ArrayList(DesugarCollections.unmodifiableList(((ewri)((ProtoLiteBuilder)object0).b_message).e));
        if(arrayList0.isEmpty()) {
            return (ProtoLiteBuilder)object0;
        }
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ((ewri)((ProtoLiteBuilder)object0).b_message).e = hfvv.a;
        Iterable iterable0 = (Iterable)Collection.-EL.stream(arrayList0).filter(new ewry()).collect(ggaf.a);
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        ewri ewri0 = (ewri)((ProtoLiteBuilder)object0).b_message;
        ewri0.b();
        hfrj.E(iterable0, ewri0.e);
        return (ProtoLiteBuilder)object0;
    }
}

