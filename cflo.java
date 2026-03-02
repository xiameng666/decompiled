import java.util.List;

public final class cflo implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        gliz gliz0 = (gliz)((ProtoLiteBuilder)object0).b_message;
        gliz0.b();
        hfrj.E(((List)object1), gliz0.s);
    }
}

