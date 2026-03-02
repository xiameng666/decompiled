import java.util.List;

public final class cfah implements bbmv {
    @Override  // bbmv
    public final void a(Object object0, Object object1) {
        if(!((ProtoLiteBuilder)object0).b_message.isImmutable()) {
            ((ProtoLiteBuilder)object0).ensureMutable();
        }
        btbe btbe0 = (btbe)((ProtoLiteBuilder)object0).b_message;
        hfui hfui0 = btbe0.e;
        if(!hfui0.c()) {
            btbe0.e = ProtoLiteMessage.D(hfui0);
        }
        hfrj.E(((List)object1), btbe0.e);
    }
}

