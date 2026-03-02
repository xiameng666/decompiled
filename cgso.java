import java.util.List;

public final class cgso implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkvw gkvw0 = (gkvw)((ProtoLiteBuilder)object0).b_message;
        hfuf hfuf0 = gkvw0.E;
        if(!hfuf0.c()) {
            gkvw0.E = ProtoLiteMessage.C(hfuf0);
        }
        hfrj.E(((List)object1), gkvw0.E);
    }
}

