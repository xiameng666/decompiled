import java.util.List;

public final class cgbt implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gkro gkro0 = (gkro)((ProtoLiteBuilder)object0).b_message;
        gkro0.b();
        hfrj.E(((List)object1), gkro0.h);
    }
}

