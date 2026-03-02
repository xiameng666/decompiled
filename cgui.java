import java.util.List;

public final class cgui implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkse gkse0 = (gkse)((ProtoLiteBuilder)object0).b_message;
        hfuo hfuo0 = gkse0.f;
        if(!hfuo0.c()) {
            gkse0.f = ProtoLiteMessage.E(hfuo0);
        }
        hfrj.E(((List)object1), gkse0.f);
    }
}

